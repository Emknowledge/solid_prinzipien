package dipAbhängigkeitsinversion.solution;

public class Fahrer {

    // In unserem Beispiel verwendet die Fahrer-Klasse eine Abstraktion namens Fahrzeug.
    // Das kann eine Schnittstelle oder eine abstrakte Klasse sein, die allgemeine Methoden für Fahrzeuge definiert


    private Fahrzeug fahrzeug;

    // (Abhängigkeiten umkehren):
    // Das hochrangige Modul ist Fahrer, und das niederrangige Modul ist Fahrzeug.
    // In der Fahrer-Klasse wird eine Abhängigkeit von Fahrzeug hergestellt, aber die Fahrer-Klasse
    // hängt nicht von einer spezifischen Implementierung von Fahrzeug ab.
    public Fahrer(final Fahrzeug fahrzeug){
        this.fahrzeug = fahrzeug;
    }

    // Abhängigkeiten umkehren: Die Fahrer-Klasse hängt nicht von konkreten Rennwagen-Implementierungen ab,
    // sondern nur von der abstrakten Fahrzeug-Schnittstelle. Das bedeutet, dass die Fahrer-Klasse
    // unabhängig von den konkreten Implementierungsdetails von Fahrzeugen ist
    // und leicht wiederverwendet oder ausgetauscht werden kann.

    // (Höhere Ebene und niedrigere Ebene): Wieder in der Fahrer-Klasse
    // Die Fahrer-Klasse ist die höhere Ebene (Abstraktion), und Fahrzeug ist die niedrigere Ebene (Implementierung).
    // Die Fahrer-Klasse arbeitet nur mit der abstrakten Schnittstelle Fahrzeug und kennt die konkreten Details
    // der Implementierung nicht. Dies ermöglicht die Entkopplung und Flexibilität in Bezug auf die Art der verwendeten Fahrzeuge.

    // (Abstraktionen sollten nicht von Details abhängen):
    // Die Fahrer-Klasse arbeitet mit der abstrakten Schnittstelle Fahrzeug und ist nicht
    // von den Details einer bestimmten Implementierung abhängig. Sie kennt die konkreten
    // Implementierungsdetails von Fahrzeug nicht, dies ist an der stelle in der Methode ersichtlich.
    public void geschwindigkeitErhöhen(){
        fahrzeug.beschleunigen();
    }

}

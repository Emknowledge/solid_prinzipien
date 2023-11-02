package lspSubstitutionsPrinzip.solution;

public class PKW extends Fahrzeug {

    // Die Klasse PKW fügt eine spezifische Überprüfung für Getriebeänderungen hinzu,
    // ohne die Hauptverantwortung von Fahrzeug zu beeinflussen. Das erfüllt das SRP.

    /*
    @Override
    public void aenderGetriebe(Getriebe getriebe) {
        // Überlassen Sie die Änderung des Getriebes an die Basisklasse
        super.aenderGetriebe(getriebe);
        if (inFahrt() && (getriebe == Getriebe.R || getriebe == Getriebe.P)) {
            stop();
        }
    }*/

    // Diese Methode dafür, dass das Fahrzeug sicher von Vorwärts- auf Rückwärtsfahrt und umgekehrt wechseln kann,
    // indem es zuerst stoppt und dann das Getriebe ändert
    @Override
    public void aenderGetriebe(Getriebe getriebe) {
        // Holt das aktuelle Getriebe des Fahrzeugs und speichert es in der Variablen aktuellGetriebe.
        Getriebe aktuellGetriebe = getGetriebe();
        // Überprüfen, ob das Fahrzeug gerade vorwärts oder rückwärts fährt.
        // Wenn das Fahrzeug vorwärts fährt und das neue Getriebe R (Rückwärts) ist,
        // oder wenn das Fahrzeug rückwärts fährt und das neue Getriebe D (Vorwärts) ist, dann wird der Ausdruck true sein, und schließlich P
        if (inFahrtVorwaerts(getriebe, aktuellGetriebe) || inFahrtRueckwaerts(getriebe, aktuellGetriebe) || Getriebe.P.equals(getriebe)) {
            // Das bedeutet, dass das Fahrzeug stoppt, bevor es die Fahrtrichtung ändert. Dies ist eine Sicherheitsmaßnahme, um sicherzustellen,
            // dass das Fahrzeug nicht direkt von Vorwärts- auf Rückwärtsfahrt oder umgekehrt wechselt, während es sich bewegt.
            stop();
        }
        // Der Begriff super bezieht sich auf die Basisklasse Fahrzeug des aktuellen Objekts.
        super.aenderGetriebe(getriebe);
    }


    /* Wenn wir möchten, dass diese Methoden direkt aufrufbar sind, müssten wir sie als public deklarieren.
      Allerdings würde dies gegen die Prinzipien der Datenkapselung verstoßen, die besagen, dass interne Details
      einer Klasse verborgen und nur über öffentliche Methoden zugänglich gemacht werden sollten. Es ist daher üblich,
      solche Hilfsmethoden als private zu deklarieren und nur die notwendigen öffentlichen Methoden bereitzustellen.
      Um den Fahrzustand zu überprüfen, müssten wir noch eine Methode hinzufügen*/
    private boolean inFahrtVorwaerts (Getriebe getriebe, Getriebe aktuellGetriebe) {
        return inFahrt() && Getriebe.D.equals(aktuellGetriebe) && Getriebe.R.equals(getriebe);
    }

    private boolean inFahrtRueckwaerts(Getriebe getriebe, Getriebe aktuellGetriebe) {
        return inFahrt() && Getriebe.R.equals(aktuellGetriebe) && Getriebe.D.equals(getriebe);
    }

}
    /* S.O.L.I.D.-Prinzipien (Java-Beispiele)

       Single responsibility principle - Das Prinzip der einzigen Verantwortung bedeutet,
                                         eine Klasse sollte nur einen Grund haben, sich zu ändern.

       Open/Closed-Prinzip - Softwareeinheiten (Klassen, Module, Funktionen usw.) sollten offen für Erweiterungen,
                             aber geschlossen für Änderungen sein.

   *** Liskov-Substitutionsprinzip - Untergeordnete Klassen sollten niemals die Typdefinitionen der übergeordneten Klasse brechen.
                                     Anders gesagt eine Subklasse muss nur die Schnittstelle der Superklasse übernehmen,
                                     wenn sie neue Sachen hinzufügen darf, aber die Schnittstelle der Superklasse nicht verändern darf.
                                     -Schnittstelle: Die Schnittstelle einer Klasse ist die Menge der Methoden und Attribute,
                                      die von der Klasse zur Verfügung gestellt werden.
                                     -Veränderung der Schnittstelle: Eine Veränderung der Schnittstelle einer Klasse ist eine Änderung
                                      der Methoden oder Attribute, die von der Klasse zur Verfügung gestellt werden.

       Interface Segregation Principle - Ist dass Prinzip der Schnittstellentrennung. Kein Client sollte gezwungen werden,
                                         von Methoden abhängig zu sein, die er nicht verwendet.

       Dependency inversion principle - Im Prinzip der Abhängigkeitsinversion sollten High-Level-Module nicht von Low-Level-Modulen abhängen.
                                        Beide sollten von Abstraktionen abhängen.
                                        Abstraktionen sollten nicht von Details abhängen.
                                        Details sollten von Abstraktionen abhängen.*/


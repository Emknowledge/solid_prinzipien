package ocpOpenClosePrinzip.solution;

public class EventHandler {

    // EventHandler ist die Klasse, die das Open/Closed-Prinzip demonstriert.
    // Sie ist für Änderungen an Fahrmodi geschlossen (closed) und offen (open) für neue Fahrmodi.
    // Wenn ein neuer Fahrmodus erstellt wird, muss er das Fahrmodus-Interface implementieren
    // und die Methoden getLeistung und getFederungshoehe bereitstellen.
    // EventHandler selbst muss nicht geändert werden, wenn ein neuer Fahrmodus hinzugefügt wird.

    private Fahrzeug fahrzeug;

    public EventHandler(final Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    public void aendereFahrmodus(final Fahrmodus fahrmodus) {
        fahrzeug.setLeistung(fahrmodus.getLeistung());
        fahrzeug.setFederungshoehe(fahrmodus.getFederungshoehe());
    }
}
/* Die verschiedenen Fahrmodus-Klassen wie Komfort, Sport und Wirtschaftsmodus implementieren
   das Fahrmodus-Interface und bieten spezifische Implementierungen für getLeistung und getFederungshoehe.
   Neue Fahrmodi können erstellt werden, indem einfach eine weitere Klasse erstellt wird,
   die das Fahrmodus-Interface implementiert, ohne die bestehenden Klassen zu ändern.*/

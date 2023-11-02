package ocpOpenClosePrinzip.violation;

public class EventHandler {

    private Fahrzeug fahrzeug;

    public EventHandler(final Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    public void aendereFahrmodus(final Fahrmodus fahrmodus){
        switch (fahrmodus){
            case SPORT:
                fahrzeug.setLeistung(500);
                fahrzeug.setFederungshoehe(10);
                break;
            case KOMFORT:
                fahrzeug.setLeistung(400);
                fahrzeug.setFederungshoehe(20);
                break;
            /*default:
                fahrzeug.setLeistung(400);
                fahrzeug.setFederungshoehe(20);
                break;*/

            // Wenn ein weiterer Modus hinzugefügt werden muss (z.B. WIRTSCHAFT),
            // müssen die Klassen Fahrmodus und EreignisHandler geändert werden.
        }
    }
}

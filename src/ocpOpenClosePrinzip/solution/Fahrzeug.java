package ocpOpenClosePrinzip.solution;

public class Fahrzeug {

    /* Das Open/Closed-Prinzip besagt, dass Software-Entitäten (Klassen, Module, Funktionen usw.) offen für Erweiterungen,
       aber geschlossen für Änderungen sein sollten. In diesem Beispiel ist die Klasse EventHandler geschlossen für Änderungen
       im Hinblick auf Fahrmodi, aber offen für die Erstellung neuer Fahrmodi durch das Hinzufügen neuer Klassen,
       die das Fahrmodus-Interface implementieren. Dies ermöglicht eine leichtere Erweiterung und Wartung des Codes.*/

    private int leistung;
    private int federungshoehe;

    public int getLeistung() {
        return leistung;
    }

    public int getFederungshoehe() {
        return federungshoehe;
    }

    public void setLeistung(final int leistung) {
        this.leistung = leistung;
    }

    public void setFederungshoehe(final int federungshoehe) {
        this.federungshoehe = federungshoehe;
    }

}

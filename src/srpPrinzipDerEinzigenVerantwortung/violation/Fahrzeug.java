package srpPrinzipDerEinzigenVerantwortung.violation;

public class Fahrzeug {

    private final int maxKraftstoff;
    private int verbleibenderKraftstoff;

    public Fahrzeug(final int maxKraftstoff) {
        this.maxKraftstoff = maxKraftstoff;
        verbleibenderKraftstoff = maxKraftstoff;
    }

    // dies ist nicht Aufgabe des Autos.
    public void reFuel(){
        verbleibenderKraftstoff = maxKraftstoff;
    }

    public int getMaxKraftstoff() {
        return maxKraftstoff;
    }

    public int getVerbleibenderKraftstoff() {
        return verbleibenderKraftstoff;
    }

    public void setVerbleibenderKraftstoff(final int verbleibenderKraftstoff) {
        this.verbleibenderKraftstoff = verbleibenderKraftstoff;
    }

    public void beschleunigen() {
        verbleibenderKraftstoff--;
    }
}

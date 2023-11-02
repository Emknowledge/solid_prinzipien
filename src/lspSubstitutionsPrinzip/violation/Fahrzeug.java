package lspSubstitutionsPrinzip.violation;

public class Fahrzeug {

    private Getriebe getriebe;

    public Getriebe getGetriebe() {
        return getriebe;
    }

    public void aendereGetriebe(final Getriebe getriebe) {
        this.getriebe = getriebe;
    }
}

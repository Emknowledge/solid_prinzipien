package ocpOpenClosePrinzip.solution;


public class Wirtschaftsmodus implements Fahrmodus {

    private static final int LEISTUNG = 300;
    private static final int FEDERUNGSHOEHE = 20;

    @Override
    public int getLeistung() {
        return LEISTUNG;
    }

    @Override
    public int getFederungshoehe() {
        return FEDERUNGSHOEHE;
    }
}


package dipAbhängigkeitsinversion.violation;

public class RennWagen {

    private final int maxKraft;
    private int verbleibendeKraft;
    private int Kraftstoff;

    public RennWagen(final int maxKraft) {
        this.maxKraft = maxKraft;
        verbleibendeKraft = maxKraft;
    }

    public void beschleunigen() {
        Kraftstoff++;
        verbleibendeKraft--;
    }

}

package dipAbhängigkeitsinversion.solution;

public class RennnWagen {

    private final int maxKraft;
    private int verbleibendeKraft;
    private int Kraftstoff;

    public RennnWagen(final int maxKraft) {
        this.maxKraft = maxKraft;
        verbleibendeKraft = maxKraft;
    }

    public void beschleunigen() {
        Kraftstoff++;
        verbleibendeKraft--;
    }
}

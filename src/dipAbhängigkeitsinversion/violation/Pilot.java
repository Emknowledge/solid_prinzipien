package dipAbhängigkeitsinversion.violation;

public class Pilot {

    private RennWagen fagrzeug;

    public Pilot(){
        this.fagrzeug = new RennWagen(100);
    }

    public void geschwindigkeitErhöhen(){
        fagrzeug.beschleunigen();
    }
}

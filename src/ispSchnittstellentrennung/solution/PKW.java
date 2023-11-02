package ispSchnittstellentrennung.solution;

public class PKW extends Fahrzeug implements RadioSchaltung{

    // Die PKW-Klasse implementiert das RadioSchaltung-Interface, da sie Funktionen zum Ein- und Ausschalten
    // des Radios enthält. Ähnlich wie bei der Drohne implementiert die PKW-Klasse nur das Interface,
    // das für sie relevant ist. Das MotorSchaltung-Interface wird in dieser Klasse nicht implementiert,
    // da es nicht zur Radio-Funktionalität gehört.

    private boolean radioEin;

    public boolean istRadioEin(){
        return radioEin;
    }

    @Override
    public void schalteRadioEin() {

    }

    @Override
    public void schalteRadioAus() {

    }
}

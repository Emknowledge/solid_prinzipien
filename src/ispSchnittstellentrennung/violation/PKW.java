package ispSchnittstellentrennung.violation;

public class PKW extends Fahrzeug{

    private boolean radioEin;

    public boolean istRadioEin(){
        return radioEin;
    }

    @Override
    public void radioEin() {
        radioEin = true;
    }

    @Override
    public void radioAus() {
        radioEin = false;
    }

    @Override
    public void cameraEin() {
        // Leer, Drohne hat kein Radio
    }

    @Override
    public void cameraAus() {
        // Leer
    }
}

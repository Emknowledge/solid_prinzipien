package ispSchnittstellentrennung.violation;

public class Drohne extends Fahrzeug {

    private boolean cameraEin;

    public boolean istCameraEin() {
        return cameraEin;
    }


    @Override
    public void radioEin() {
        // Leer, Drohne hat kein Radio
    }

    @Override
    public void radioAus() {
        // Leer
    }

    @Override
    public void cameraEin() {
        cameraEin = true;
    }

    @Override
    public void cameraAus() {
        cameraEin = false;
    }
}

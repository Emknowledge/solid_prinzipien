package ispSchnittstellentrennung.solution;

public class Drohne extends Fahrzeug implements CameraSchaltung{

    // Die Drohne-Klasse implementiert das CameraSchaltung-Interface, da sie Funktionen zum Ein- und Ausschalten der Kamera enthält.
    // Hier wird nur die CameraSchaltung-Schnittstelle implementiert, und nicht die MotorSchaltung, die für diese Klasse nicht relevant ist.
    // Somit wird das ISP eingehalten, da die Klasse nur die Methoden implementiert, die sie benötigt.

    private boolean cameraEin;

    public boolean istCameraEin() {
        return cameraEin;
    }


    @Override
    public void schalteCameraEin() {
        cameraEin = true;
    }

    @Override
    public void schalteCameraAus() {
        cameraEin = false;
    }
}

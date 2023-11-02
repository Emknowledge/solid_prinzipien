package ispSchnittstellentrennung.solution;

public abstract class Fahrzeug implements MotorSchaltung{

    //  Das ISP besagt, dass es besser ist, viele spezialisierte Schnittstellen zu haben,
    //  als eine allgemeine, die von Klienten nicht benötigte Methoden erzwingt.

    private boolean motorLaeuft;

    public boolean istMotorAn(){
        return motorLaeuft;
    }


    @Override
    public void schalteMotorEin() {
        motorLaeuft = true;
    }

    @Override
    public void schalteMotorAus() {
        motorLaeuft = false;
    }

    /* Da Fahrzeug diese Motorsteuerungsfunktionen implementiert, können alle konkreten Klassen, die von Fahrzeug abgeleitet sind,
       diese Funktionalität nutzen, ohne sie erneut zu implementieren. Zum Beispiel, die Klasse Drohne und die Klasse PKW
       erben die Motorsteuerungsfunktionen von Fahrzeug und müssen nur spezifische Implementierungen für die Steuerung ihrer eigenen
       speziellen Funktionen (Kamera oder Radio) bereitstellen.*/
}

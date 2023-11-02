package ispSchnittstellentrennung.violation;

public abstract class Fahrzeug implements Schaltung {

    private boolean motorLaeuft;

    public boolean istMotorAn(){
        return motorLaeuft;
    }

    @Override
    public void motorStart() {
        motorLaeuft = true;
    }

    @Override
    public void motorStop() {
        motorLaeuft = false;
    }
}

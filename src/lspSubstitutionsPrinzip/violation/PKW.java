package lspSubstitutionsPrinzip.violation;

public class PKW extends Fahrzeug {

    // Nur ein Flugzeug kann den Rückwärtsgang einlegen, während es sich vorwärts bewegt ein PKW nicht!
    @Override
    public void aendereGetriebe(Getriebe getriebe) {
        if (Getriebe.R.equals(getriebe) && getGetriebe().equals(Getriebe.D)) {
            throw new RuntimeException("Der Rückwärtsgang kann nicht eingelegt werden, wenn " +
                    getGetriebe().toString() + " der Gang eingelegt ist!");
        }
    }
}

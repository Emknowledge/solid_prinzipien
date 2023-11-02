package lspSubstitutionsPrinzip.solution;

public class TestDrive {

    public static void main(String[] args) {

        // Unsere Methode wird true zurückgeben, solange das Auto nicht gestoppt wird oder
        // das Getriebe nicht in einen Zustand wechselt, der das Auto stoppt

        PKW pkw = new PKW();

        // Setzen des Getriebes auf "D" (Fahren)
        pkw.aenderGetriebe(Getriebe.D);
        // Setzen des Autos in Bewegung
        pkw.faehrt();
        // Überprüfen, ob das Auto in Fahrt ist
        System.out.println("Ist das Auto in Fahrt? " + pkw.inFahrt());
        // Überprüfen, welches Getriebe eingestellt ist
        System.out.println("Aktuelles Getriebe: " + pkw.getGetriebe());

        System.out.println();

        // Setzen des Getriebes auf "N" (Leerlauf)
        pkw.aenderGetriebe(Getriebe.N);
        // Überprüfen, ob das Auto in Fahrt ist (sollte immer noch in Fahrt sein)
        System.out.println("Ist das Auto in Fahrt? " + pkw.inFahrt());
        // Überprüfen, welches Getriebe eingestellt ist
        System.out.println("Aktuelles Getriebe: " + pkw.getGetriebe());

        // Setzen des Getriebes auf "R" (Rückwärtsfahren)
        pkw.aenderGetriebe(Getriebe.R);
        // Überprüfen, ob das Auto in Fahrt ist (sollte stoppen)
        System.out.println("Ist das Auto in Fahrt? " + pkw.inFahrt());
        // Überprüfen, welches Getriebe eingestellt ist
        System.out.println("Aktuelles Getriebe: " + pkw.getGetriebe());


        // Setzen des Getriebes auf "P" (Parken)
        pkw.aenderGetriebe(Getriebe.P);

        // Überprüfen, ob das Auto in Fahrt ist (sollte gestoppt sein)
        System.out.println("Ist das Auto in Fahrt? " + pkw.inFahrt());
        // Überprüfen, welches Getriebe eingestellt ist
        System.out.println("Aktuelles Getriebe: " + pkw.getGetriebe());
        System.out.println("Ist das Auto in Fahrt? " + pkw.inFahrt());

    }
}

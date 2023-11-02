package srpPrinzipDerEinzigenVerantwortung.solution;

public class KraftPumpe {

    // Die Hauptverantwortung dieser Klasse besteht darin, ein Fahrzeug zu betanken.
    // Die Methode betanken() ist dafür verantwortlich, den Kraftstoffstand eines Fahrzeugs zu erhöhen,
    // indem sie auf die Informationen über den aktuellen Kraftstoffstand und den maximalen Kraftstoff des Fahrzeugs
    // zugreift und diese mithilfe der Berechnung korrekt aktualisiert.

    public void betanken(final Fahrzeug fahrzeug){
        final int verbleibenderKraftstoff = fahrzeug.getVerbleibenderKraftstoff();
        final int beschleunigen = fahrzeug.getMaxKraftstoff() - verbleibenderKraftstoff;
        fahrzeug.setVerbleibenderKraftstoff(verbleibenderKraftstoff + beschleunigen);

        /* Die Fahrzeug-Klasse ist für die Verwaltung des Kraftstoffstands zuständig, während die
           KraftPumpe-Klasse für das Betanken des Fahrzeugs zuständig ist. Dies ermöglicht eine klare
           Trennung der Aufgaben und erhöht die Kohäsion in unserem Code.*/
    }
}

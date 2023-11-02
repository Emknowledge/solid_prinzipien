package srpPrinzipDerEinzigenVerantwortung.solution;

public class TestKraftstoffBetankung {

    public static void main(String[] args) {
        // Erzeugen eines Fahrzeugs mit ursprünglichem Kraftstoff von 50
        Fahrzeug fahrzeug = new Fahrzeug(100);

        // Erzeugen einer KraftPumpe
        KraftPumpe kraftPumpe = new KraftPumpe();

        // Aktuelle Kraftstoffwerte nach einer Fahrt ausgeben
        System.out.println("Vor dem Betanken:");
        System.out.println("Maximaler Kraftstoff: " + fahrzeug.getMaxKraftstoff());
        fahrzeug.beschleunigen();
        System.out.println("Verbleibender Kraftstoff nach 250km : " + fahrzeug.getVerbleibenderKraftstoff());

        // Das Fahrzeug mit der KraftPumpe betanken
        kraftPumpe.betanken(fahrzeug);

        // Aktuelle Kraftstoffwerte nach dem Betanken ausgeben
        System.out.println("\nNach dem Betanken:");
        System.out.println("Maximaler Kraftstoff: " + fahrzeug.getMaxKraftstoff());
        System.out.println("Verbleibender Kraftstoff: " + fahrzeug.getVerbleibenderKraftstoff());
    }
}


package ispSchnittstellentrennung.solution;

public interface CameraSchaltung {

        // Das CameraSchaltung-Interface enthält nur Methoden, die für die Kamera relevant sind: schalteCameraEin() und schalteCameraAus().

    void schalteCameraEin();

    void schalteCameraAus();

    /* Interface-Segregation-Prinzip (ISP): Dieses Prinzip besagt, dass keine Klasse von einem
       Interface abhängig sein sollte, das wir nicht verwenden. Unsere Klassen halten sich an dieses Prinzip,
       indem wir spezifische Interfaces für verschiedene Funktionen bereitstellen.
       Zum Beispiel implementiert die Drohne-Klasse das CameraSchaltung-Interface und die PKW-Klasse implementiert
       das RadioSchaltung-Interface. Auf diese Weise sind die Klassen nur von den Interfaces abhängig, die sie tatsächlich benötigen.

       Liskovsche Substitutionsprinzip (LSP): Dieses Prinzip besagt, dass Unterklassen so verwendet werden sollten,
       dass wir ihre Basisklasse ohne Beeinträchtigung der Funktionalität ersetzen können.
       Unsere Klassen halten sich an dieses Prinzip, da sowohl Drohne als auch PKW Unterklassen von Fahrzeug sind
       und die Methoden des MotorSchaltung-Interfaces implementieren, das von der Basisklasse Fahrzeug implementiert wird.*/
}

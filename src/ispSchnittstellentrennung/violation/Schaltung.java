package ispSchnittstellentrennung.violation;

public interface Schaltung {

    void motorStart();

    void motorStop();

    void radioEin();

    void radioAus();

    void cameraEin();

    void cameraAus();
}

/* S.O.L.I.D.-Prinzipien (Java-Beispiele)

       Single responsibility principle - Das Prinzip der einzigen Verantwortung bedeutet,
                                         Eine Klasse sollte nur einen Grund haben, sich zu ändern.

       Open/Closed-Prinzip - Softwareeinheiten (Klassen, Module, Funktionen usw.) sollten offen für Erweiterungen,
                             aber geschlossen für Änderungen sein.

       Liskov-Substitutionsprinzip - Untergeordnete Klassen sollten niemals die Typdefinitionen der übergeordneten Klasse brechen.
                                     Anders gesagt Eine Subklasse muss nur die Schnittstelle der Superklasse übernehmen,
                                     wenn sie neue Sachen hinzufügen darf,aber die Schnittstelle der Superklasse nicht verändern darf.
                                     -Schnittstelle: Die Schnittstelle einer Klasse ist die Menge der Methoden und Attribute,
                                      die von der Klasse zur Verfügung gestellt werden.
                                     -Veränderung der Schnittstelle: Eine Veränderung der Schnittstelle einer Klasse ist eine Änderung
                                      der Methoden oder Attribute, die von der Klasse zur Verfügung gestellt werden.

       Interface Segregation Principle - Ist dass Prinzip der Schnittstellentrennung. Kein Client sollte gezwungen werden,
                                         von Methoden abhängig zu sein, die er nicht verwendet.

       Dependency inversion principle - Im Prinzip der Abhängigkeitsinversion sollten High-Level-Module nicht von Low-Level-Modulen abhängen.
                                        Beide sollten von Abstraktionen abhängen.
                                        Abstraktionen sollten nicht von Details abhängen.
                                        Details sollten von Abstraktionen abhängen.*/

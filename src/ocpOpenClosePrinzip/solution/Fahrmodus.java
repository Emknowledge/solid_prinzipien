package ocpOpenClosePrinzip.solution;

public interface Fahrmodus {

    // Fahrmodus ist ein Interface, das die abstrakten Methoden getLeistung und
    // getFederungshoehe definiert. Durch die Verwendung dieses Interfaces wird sichergestellt,
    // dass alle Fahrmodi diese Methoden implementieren, was die Erweiterbarkeit des Codes unterstützt.

    int getLeistung();

    int getFederungshoehe();
}
/* Die verschiedenen Fahrmodus-Klassen wie Komfort, Sport und Wirtschaftsmodus implementieren
   das Fahrmodus-Interface und bieten spezifische Implementierungen für getLeistung und getFederungshoehe.
   Neue Fahrmodi können erstellt werden, indem einfach eine weitere Klasse erstellt wird,
   die das Fahrmodus-Interface implementiert, ohne die bestehenden Klassen zu ändern.*/

/* S.O.L.I.D.-Prinzipien (Java-Beispiele)

       Single responsibility principle - Das Prinzip der einzigen Verantwortung bedeutet,
                                         eine Klasse sollte nur einen Grund haben, sich zu ändern.

   *** Open/Closed-Prinzip - Softwareeinheiten (Klassen, Module, Funktionen usw.) sollten offen für Erweiterungen,
                             aber geschlossen für Änderungen sein.

       Liskov-Substitutionsprinzip - Untergeordnete Klassen sollten niemals die Typdefinitionen der übergeordneten Klasse brechen.
                                     Anders gesagt eine Subklasse muss nur die Schnittstelle der Superklasse übernehmen,
                                     wenn sie neue Sachen hinzufügen darf, aber die Schnittstelle der Superklasse nicht verändern darf.
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

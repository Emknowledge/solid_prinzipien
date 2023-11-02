# **S.O.L.I.D.-Prinzipien (Java-Beispiele)**

* **Single responsibility principle** - Das Prinzip der einzigen Verantwortung bedeutet, eine Klasse sollte nur einen Grund haben, sich zu ändern.

* **Open/Closed-Prinzip** - Softwareeinheiten (Klassen, Module, Funktionen usw.) sollten offen für Erweiterungen, aber geschlossen für Änderungen sein.

* **Liskov-Substitutionsprinzip** - Untergeordnete Klassen sollten niemals die Typdefinitionen der übergeordneten Klasse brechen. Anders gesagt eine Subklasse muss nur die Schnittstelle der Superklasse übernehmen, wenn sie neue Sachen hinzufügen darf, aber die Schnittstelle der Superklasse nicht verändern darf.
   
* **Interface Segregation Principle** - Ist dass Prinzip der Schnittstellentrennung. Kein Client sollte gezwungen werden, von Methoden abhängig zu sein, die er nicht verwendet.

* **Dependency inversion principle** - Im Prinzip der Abhängigkeitsinversion sollten High-Level-Module nicht von Low-Level-Modulen abhängen. Beide sollten von Abstraktionen abhängen. Abstraktionen sollten nicht von Details abhängen.
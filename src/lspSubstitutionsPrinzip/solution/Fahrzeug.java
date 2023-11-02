package lspSubstitutionsPrinzip.solution;


public class Fahrzeug {

    /*Das Liskov Substitution Prinzip besagt, dass Objekte einer abgeleiteten Klasse in einem Programm anstelle von Objekten
      der Basisklasse verwendet werden können, ohne die korrekte Funktionsweise des Programms zu beeinträchtigen */

    // Die Klasse Fahrzeug ist für die Steuerung des Fahrzeugzustands und des Getriebes verantwortlich.

    private boolean inFahrt;

    private Getriebe getriebe;

    public void faehrt() {
        inFahrt = true;
    }

    public void stop() {
        inFahrt = false;
    }

    public boolean inFahrt() {
        return inFahrt;
    }

    public Getriebe getGetriebe(){
        return getriebe;
    }

    // In deinem Beispiel erfüllt die Klasse PKW das LSP, da sie von der Klasse Fahrzeug erbt
    // und die Methode aenderGetriebe überschreibt. Der Übergang zu einer abgeleiteten Klasse (PKW)
    // beeinflusst die erwartete Funktionalität des Objekts nicht negativ.
    // Stattdessen verhält sich PKW konsistent mit den Vorgaben und kann anstelle von Fahrzeug verwendet werden.
    public void aenderGetriebe(final Getriebe getriebe){
        this.getriebe = getriebe;
    }
}

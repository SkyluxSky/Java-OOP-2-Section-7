// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

package SkyluxSky.Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private  boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100)? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    //modifies the amount of toner in the cartridge.
    //Checks parameter and then total toner amount with added toner amount.
    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        //Checks duplex system
        if(this.duplex){
            //Returns remainder to prevent the odd number from displaying logical error: missing page.
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

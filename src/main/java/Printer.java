public class Printer {
    private int paper;


    public Printer(int paper) {
        this.paper = paper;
    }

    public int paper() {
        return this.paper();
    }
}


//Printer
//        Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.
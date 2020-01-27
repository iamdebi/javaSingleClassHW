import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private  Printer printer;
    @Before
    public void before(){
        printer = new Printer(500, 300);
    }

    @Test
    public void hasPaper(){
        assertEquals(500, printer.paper());
    }

    @Test
    public void canPrint(){
        printer.print(14, 10);
        assertEquals(360, printer.paper());
    }

    @Test
    public void hasToner(){
        assertEquals(300, printer.toner());
    }

    @Test
    public void reduceToner(){
        printer.print(14, 10);
        assertEquals(160, printer.toner());
    }
}


//Printer
//        •	Create a Printer class that has a property for number of sheets of paper left.
//        •	Add a method to print that takes in a number of pages and number of copies.
//        •	The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        •	Add a toner volume property to the class.
//        •	Modify the printer so that it reduces the toner by 1 for each page printed.
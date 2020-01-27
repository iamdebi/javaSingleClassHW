import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public  void startFull(){
        assertEquals(100, waterBottle.volume());
    }

    @Test
    public  void canTakeDrink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.volume());
    }

    @Test
    public void canEmpty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.volume());
    }

    @Test
    public void CanRefill(){
        waterBottle.empty();
        waterBottle.refill()
        assertEquals(100, waterBottle.volume());
    }
}

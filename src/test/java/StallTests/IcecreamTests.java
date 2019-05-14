package StallTests;

import Stalls.Icecream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IcecreamTests {

    Icecream icecream;

    @Before
    public void before(){
        icecream = new Icecream("Cold Liquid Fromage", "Jean Luc Picard", 123, 4);
    }

    @Test
    public void checkGetName(){
        assertEquals("Cold Liquid Fromage", icecream.getName());
    }

    @Test
    public void checkGetOwnerName(){
        assertEquals("Jean Luc Picard", icecream.getOwnerName());
    }

    @Test
    public void checkGetParkingSpot(){
        assertEquals(123, icecream.getParkingSpot());
    }

    @Test
    public void checkGetRating(){
        assertEquals(4, icecream.getRating());
    }
}

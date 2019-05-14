package StallTests;

import Stalls.CandyFloss;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossTest {

    CandyFloss candyFloss;

    @Before
    public void before(){
        candyFloss = new CandyFloss("Fluffy Sugar", "Diane Beeties", 321, 6);
    }

    @Test
    public void checkGetName(){
        assertEquals("Fluffy Sugar", candyFloss.getName());
    }

    @Test
    public void checkGetOwnerName(){
        assertEquals("Diane Beeties", candyFloss.getOwnerName());
    }

    @Test
    public void checkGetParkingSpot(){
        assertEquals(321, candyFloss.getParkingSpot());
    }

    @Test
    public void checkGetRating(){
        assertEquals(6, candyFloss.getRating());
    }
}

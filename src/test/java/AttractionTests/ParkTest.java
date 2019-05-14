package AttractionTests;

import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Walkies", 2);
    }

    @Test
    public void checkGetName(){
        assertEquals("Walkies", park.getName());
    }

    @Test
    public void checkGetRating(){
        assertEquals(2, park.getRating());
    }
}

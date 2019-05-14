package AttractionTests;

import Attractions.Dodgems;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        dodgems = new Dodgems("Bumpers", 4.00, 3);
        visitor1 = new Visitor(31, 6.00, 300.00);
        visitor2 = new Visitor(13, 4.00, 30.00);
    }

    @Test
    public void checkGetName(){
        assertEquals("Bumpers", dodgems.getName());
    }

    @Test
    public void checkDefaultPrice(){
        assertEquals(4, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void checkPriceForOver(){
        assertEquals(4, dodgems.priceFor(visitor1), 0.01);
    }

    @Test
    public void checkPriceForUnder(){
        assertEquals(2.00, dodgems.priceFor(visitor2), 0.01);
    }

    @Test
    public void checkGetRating(){
        assertEquals(3, dodgems.getRating());
    }
}

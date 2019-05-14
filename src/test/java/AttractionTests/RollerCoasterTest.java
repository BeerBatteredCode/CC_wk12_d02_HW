package AttractionTests;

import Attractions.RollerCoaster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Looper", 5.00, 5);
        visitor1 = new Visitor(31, 6.00, 300.00);
        visitor2 = new Visitor(13, 4.00, 30.00);
    }

    @Test
    public void checkGetName(){
        assertEquals("Looper", rollerCoaster.getName());
    }

    @Test
    public void checkDefaultPrice(){
        assertEquals(5, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void checkPriceForOver(){
        assertEquals(5, rollerCoaster.priceFor(visitor1), 0.01);
    }

    @Test
    public void checkPriceForUnder(){
        assertEquals(2.5, rollerCoaster.priceFor(visitor2), 0.01);
    }

    @Test
    public void checkIsAllowedToTrue(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void checkIsAllowedToFalse(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void checkGetRating(){
        assertEquals(5, rollerCoaster.getRating());
    }
}

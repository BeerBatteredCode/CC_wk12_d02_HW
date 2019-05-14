package StallTests;

import Stalls.Tobacco;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoTest {

    Tobacco tobacco;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        tobacco = new Tobacco("Cancer'n'Coughs", "Smokey Joe", 911, 1);
        visitor1 = new Visitor(31, 6.00, 300.00);
        visitor2 = new Visitor(13, 4.00, 30.00);
    }

    @Test
    public void checkGetName(){
        assertEquals("Cancer'n'Coughs", tobacco.getName());
    }

    @Test
    public void checkGetOwnerName(){
        assertEquals("Smokey Joe", tobacco.getOwnerName());
    }

    @Test
    public void checkGetParkingSpot(){
        assertEquals(911, tobacco.getParkingSpot());
    }

    @Test
    public void checkIsAllowedToTrue(){
        assertEquals(true, tobacco.isAllowedTo(visitor1));
    }

    @Test
    public void checkIsAllowedToFalse(){
        assertEquals(false, tobacco.isAllowedTo(visitor2));
    }

    @Test
    public void checkGetRating(){
        assertEquals(1, tobacco.getRating());
    }
}

package AttractionTests;

import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("Play-on-ground", 3);
        visitor1 = new Visitor(31, 6.00, 300.00);
        visitor2 = new Visitor(13, 4.00, 30.00);
    }

    @Test
    public void checkGetName(){
        assertEquals("Play-on-ground", playground.getName());
    }

    @Test
    public void checkIsAllowedToTrue(){
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void checkIsAllowedToFalse(){
        assertEquals(false, playground.isAllowedTo(visitor2));
    }

    @Test
    public void checkGetRating(){
        assertEquals(3, playground.getRating());
    }
}

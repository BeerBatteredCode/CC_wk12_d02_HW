package VisitorTests;

import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(31, 6.00, 300.00);
    }

    @Test
    public void checkGetAge(){
        assertEquals(31, visitor.getAge());
    }

    @Test
    public void checkGetHeight(){
        assertEquals(6.00, visitor.getHeight(), 0.01);
    }

    @Test
    public void checkGetMoney(){
        assertEquals(300.00, visitor.getMoney(), 0.01);
    }
}

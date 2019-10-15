package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor ted;
    Visitor joe;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        ted = new Visitor(35, 201, 20);
        joe = new Visitor(20, 145, 15);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedToVisit(){
        assertTrue(rollerCoaster.isAllowedTo(ted));
    }

    @Test
    public void isNotAllowedToVisit(){
        assertFalse(rollerCoaster.isAllowedTo(joe));
    }

    @Test
    public void payDoublePrice(){
        assertEquals(16.80, rollerCoaster.priceFor(ted), 0.01);
    }

    @Test
    public void payDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }
}

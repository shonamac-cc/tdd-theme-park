package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor ahmed;
    Visitor amanda;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        ahmed = new Visitor(11, 130, 8);
        amanda = new Visitor(26, 165, 35);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void payHalfPrice(){
        assertEquals(2.25, dodgems.priceFor(ahmed), 0.01);
    }

    @Test
    public void payDefaultPrice(){
        assertEquals(4.50, dodgems.priceFor(amanda), 0.01);
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {
    Drumsticks drumsticks;

    @Before
    public void before() {
        drumsticks = new Drumsticks("Pearl drumsticks with tortoiseshell detailing", 30.00, 20.00);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Pearl drumsticks with tortoiseshell detailing", drumsticks.getDescription());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(30.00, drumsticks.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetPriceBought() {
        assertEquals(20.00, drumsticks.getPriceBought(), 0.01);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(10.00, drumsticks.getMarkUp(), 0.01);
    }

}

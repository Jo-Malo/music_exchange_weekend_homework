import Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Phantom of the Opera", 20.00, 15.00);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Phantom of the Opera", sheetMusic.getDescription());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(20.00, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetPriceBought(){
        assertEquals(15.00, sheetMusic.getPriceBought(), 0.01);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(5, sheetMusic.getMarkUp(), 0.01);
    }
}

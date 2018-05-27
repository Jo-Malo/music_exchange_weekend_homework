import Enums.InstrumentType;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;
    Shop shop;

    @Before
    public void before(){
        guitar = new Guitar("maple", "Strings", 6, InstrumentType.STRINGS);
        shop = new Shop();
    }

    @Test
    public void canGetColour(){
        assertEquals("maple", guitar.getColour());
    }

    @Test
    public void canGetGuitarFamily(){
        assertEquals("Strings", guitar.getFamily());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(150.00, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetPriceBought(){
        assertEquals(80.00, guitar.getPriceBought(), 0.01);
    }

    @Test
    public void canPlay(){
        String result = guitar.play("twang");
        assertEquals("Instruments.Guitar makes a twang noise", result);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(70.00, guitar.getMarkUp(), 0.01);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRINGS, guitar.getInstrumentType());
    }
}

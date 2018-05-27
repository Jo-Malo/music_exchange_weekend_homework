import Enums.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static Enums.InstrumentType.KEYBOARD;
import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;
    Shop shop;

    @Before
    public void before(){
        piano = new Piano("ferrari red", "Strings", "This piano ia one of a kind", KEYBOARD);
        shop = new Shop();
    }

    @Test
    public void canGetColour(){
        assertEquals("ferrari red", piano.getColour());
    }

    @Test
    public void canGetPianoFamily(){
        assertEquals("Strings", piano.getFamily());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(2000.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetPianoDescription(){
        assertEquals("This piano is one of a kind", piano.getDescription());
    }

    @Test
    public void canGetPriceBought(){
        assertEquals(800.00, piano.getPriceBought(), 0.01);
    }

    @Test
    public void canPlay(){
        String result = piano.play("plinkyplonky");
        assertEquals("Instruments.Piano makes a plinkyplonky noise", result);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

}

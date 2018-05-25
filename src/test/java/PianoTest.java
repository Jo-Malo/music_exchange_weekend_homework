import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("ferrari red", "Strings");
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
    public void canPlay(){
        String result = piano.play("plinkyplonky");
        assertEquals("Piano makes a plinkyplonky noise", result);
    }
}

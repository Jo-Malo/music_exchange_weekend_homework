import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("maple", "Strings");
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
    public void canPlay(){
        String result = guitar.play("twang");
        assertEquals("Guitar makes a twang noise", result);
    }
}

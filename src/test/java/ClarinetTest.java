import Enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {
    Clarinet clarinet;
    Shop shop;

    @Before
    public void before(){
        clarinet = new Clarinet("chocolate", "Woodwind", "Arundo donax", InstrumentType.WOODWIND);
        shop = new Shop();
    }

    @Test
    public void canGetColour(){
        assertEquals("chocolate", clarinet.getColour());
    }

    @Test
    public void canGetClarinetFamily(){
        assertEquals("Woodwind", clarinet.getFamily());
    }

    @Test
    public void canGetReedMaterial(){
        assertEquals("Arundo donax", clarinet.getReedMaterial());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(300.00, clarinet.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetPriceBought(){
        assertEquals(100.00, clarinet.getPriceBought(), 0.01);
    }

    @Test
    public void canPlay(){
        String result = clarinet.play("rootytooty");
        assertEquals("Clarinet makes a rootytooty noise", result);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(200.00, clarinet.getMarkUp(), 0.01);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.WOODWIND, clarinet.getInstrumentType());
    }
}


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Accessories accessories;
    Instrument instrument;
    SheetMusic sheetMusic;
    Piano piano;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop();
    }

    @Test
    public void canGetIstockInventoryCount() {
        assertEquals(0, shop.getIstockCount());
    }

    @Test
    public void canAddSheetmusicToIstock() {
        shop.addToIstock(sheetMusic);
        assertEquals(1, shop.getIstockCount());
    }

    @Test
    public void canAddPianoToIstock() {
        shop.addToIstock(piano);
        assertEquals(1, shop.getIstockCount());
    }

    @Test
    public void canAddInstrumentToIstock() {
        shop.addToIstock(instrument);
        assertEquals(1, shop.getIstockCount());
    }

    @Test
    public void canAddGuitarToIstock() {
        shop.addToIstock(guitar);
        assertEquals(1, shop.getIstockCount());
    }

    @Test
    public void canRemoveStockFromInventory() {
        shop.addToIstock(accessories);
        shop.removeStockFromIstock(accessories);
        assertEquals(0, shop.getIstockCount());
    }

}

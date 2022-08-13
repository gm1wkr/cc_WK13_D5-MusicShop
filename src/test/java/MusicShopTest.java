import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    Guitar guitar;
    TinWhistle tinWhistle;
    Piano piano;
    Consumable guitarStrings;
    Consumable drumSticks;
    Consumable sheetMusic;
    MusicShop musicShop;

    @Before
    public void before(){
        guitar = new Guitar("Fender 5", "x2", "Fender Bass Guitar", 500.00, 200.00, InstrumentType.Stringed, 5);
        tinWhistle = new TinWhistle("Feadoga", "Feadoga Stain","A Tine Whistle", 10.00, 5.00, InstrumentType.Woodwind, "D");
        piano = new Piano("Amazon Piano", "Amazon Basics Grand Piano", "Upright", 1000.00, 500.00, InstrumentType.Percusion, 102 );
        guitarStrings = new Consumable("Guitar Strings", 10.00, 5.00);
        drumSticks = new Consumable("Drum Sticks", 20.00, 15.00);
        sheetMusic = new Consumable("Mini the Moocher", 25.00, 10.00);
        musicShop = new MusicShop("Ray's Music Exchange");
    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Exchange", musicShop.getName());
    }

    @Test
    public void shopStartsWithNoStock(){
        assertEquals(0, musicShop.getStockList());
    }

    @Test
    public void canAddToStock(){
        musicShop.addProductToStock(guitar);
        assertEquals(1, musicShop.getStockList());
        assertEquals(guitar, musicShop.getProductByName("Fender 5"));
    }

    @Test
    public void canRemoveProductFromStock(){
        musicShop.addProductToStock(guitar);
        assertEquals(1, musicShop.getStockList());
        musicShop.removeProductFromStock(guitar);
        assertEquals(0, musicShop.getStockList());
    }

    @Test
    public void canCalculateProfitForAllItems(){
        musicShop.addProductToStock(piano);
        musicShop.addProductToStock(guitar);
        musicShop.addProductToStock(tinWhistle);
        musicShop.addProductToStock(drumSticks);
        musicShop.addProductToStock(guitarStrings);
        musicShop.addProductToStock(sheetMusic);
        assertEquals(830.00, musicShop.calculateProfit(), 0.000001);
    }
}

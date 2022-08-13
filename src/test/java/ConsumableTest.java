import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsumableTest {

    Consumable guitarStrings;
    Consumable sheetMusic;
    Consumable plectrum;

    @Before
    public void before(){
        guitarStrings = new Consumable("Guitar Strings", 5.00, 2.00);
        sheetMusic = new Consumable("Beethovens 9th", 20.00, 15.00);
        plectrum = new Consumable("Plectrum", 2.00, 0.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Guitar Strings", guitarStrings.getName());
        assertEquals("Beethovens 9th", sheetMusic.getName());
        assertEquals("Plectrum", plectrum.getName());
    }

    @Test
    public void canGetRetailPrice(){
        assertEquals(5.00, guitarStrings.getRetailPrice(), 0.0000001);
        assertEquals(20.00, sheetMusic.getRetailPrice(), 0.0000001);
        assertEquals(2.00, plectrum.getRetailPrice(), 0.0000001);
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(2.00, guitarStrings.getCostPrice(), 0.0000001);
        assertEquals(15.00, sheetMusic.getCostPrice(), 0.0000001);
        assertEquals(0.50, plectrum.getCostPrice(), 0.0000001);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1.50, plectrum.calculateMarkup(), 0.000001);
    }


}

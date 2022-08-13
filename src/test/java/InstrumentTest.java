import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Piano piano;
    TinWhistle tinWhistle;
    Guitar guitar;

    @Before
    public void before(){
        piano = new Piano("Dyson Piano",
                "Tinkle X2000",
                "Grand Piano for Pianoey Stuff",
                2000.00,
                1000.00,
                InstrumentType.Stringed,
                83);
        tinWhistle = new TinWhistle("Tin Whistle", "Deluxe", "Clarke Whistle in D", 20.00, 10.00, InstrumentType.Percusion, "D");
        guitar = new Guitar("Boomer","XC4", "Bass Guitar", 500.00, 300.00, InstrumentType.Stringed, 4);
    }

    @Test
    public void canGetName(){
        assertEquals("Dyson Piano", piano.getName());
    }
    @Test
    public void canGetModel(){
        assertEquals("Tinkle X2000", piano.getModel());
    }
    @Test
    public void canGetDescription(){
        assertEquals("Grand Piano for Pianoey Stuff", piano.getDescription());
    }
    @Test
    public void canGetRetailPrice(){
        assertEquals(2000.00, piano.getRetailPrice(), 0.000001);
    }
    @Test
    public void canGetCostPrice(){
        assertEquals(1000.00, piano.getCostPrice(), 0.00001);
    }
    @Test
    public void canGetInstrumentType(){
        assertEquals("Stringed", piano.getProductType());
    }
    @Test
    public void canGetNumberOfKeys(){
        assertEquals(83, piano.getNumberOfKeys());
    }
    @Test
    public void canPlayASound(){
        assertEquals("Tinkle Tinkle", piano.play());
    }
    @Test
    public void canGetMarkup(){
        assertEquals(1000.00, piano.calculateMarkup(), 0.0000001);
    }
    @Test
    public void canGetGuitarNumberOfStrings(){
        assertEquals(4, guitar.getNumberOfStrings());
    }
    @Test
    public void canGetGuitarToPlay(){
        assertEquals("Dwanggg", guitar.play());
    }
    @Test
    public void canGetTinWhistleKey(){
        assertEquals("D", tinWhistle.getKey());
    }
    @Test
    public void canGetTinWhistleToPlay(){
        assertEquals("DiddleDiDiddleDo", tinWhistle.play());
    }


    @Test
    public void canCalculateMarkUp(){
        assertEquals(10.00, tinWhistle.calculateMarkup(), .0000001);
    }

}

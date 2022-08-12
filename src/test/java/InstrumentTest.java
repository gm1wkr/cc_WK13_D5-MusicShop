import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Dyson Piano",
                "Tinkle X2000",
                "Grand Piano for Pianoey Stuff",
                2000.00,
                1000.00,
                "String",
                83);
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
        assertEquals("String", piano.getInstrumentType());
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

}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;

    @Before
    public void before(){
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
}

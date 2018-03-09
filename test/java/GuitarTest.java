import Classes.Guitar;
import ENUMs.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("GIBSON Les Paul Traditional 2018", 1000, 1500, 6, GuitarType.ELECTRIC);
//        String name, int WholesalePrice, int RetailPrice, int numberOfStrings, GuitarType guitarType
    }

    @Test
    public void canPlay(){
        assertEquals("I am playing a Guitar!", guitar.playInstrument("Guitar!"));
    }
}

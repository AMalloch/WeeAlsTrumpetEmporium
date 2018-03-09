import Classes.Guitar;
import ENUMs.GuitarType;
import ENUMs.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("GIBSON Les Paul Traditional 2018", 700, 300, InstrumentType.CHORDOPHONE, 6, GuitarType.ELECTRIC, 1, "Sunburst", "Hazelwood");
//        String name, int WholesalePrice, int RetailPrice, int numberOfStrings, GuitarType guitarType
    }

    @Test
    public void canPlay(){
        assertEquals("I am playing a Guitar!", guitar.playInstrument("Guitar!"));
    }

    @Test
    public void canGetWholeSalePrice(){
        assertEquals(300,guitar.getWholeSalePrice());
    }

    @Test
    public void canGetRetailPrice(){
        assertEquals(700, guitar.getRetailPrice());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(400, guitar.calculateMarkup());
    }
}

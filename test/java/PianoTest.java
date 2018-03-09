import Classes.Guitar;
import Classes.Piano;
import ENUMs.GuitarType;
import ENUMs.InstrumentType;
import ENUMs.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("Steinway", 88, 1500, 1000, InstrumentType.CHORDOPHONE, 6, PianoType.GRAND, "Black", "Mahogany");
//        String name, int WholesalePrice, int RetailPrice, int numberOfStrings, GuitarType guitarType
    }

    @Test
    public void canPlay(){
        assertEquals("I am playing a Piano!", piano.playInstrument("Piano!"));
    }

    @Test
    public void canGetWholeSalePrice(){
        assertEquals(1000, piano.getWholeSalePrice());
    }

    @Test
    public void canGetRetailPrice(){
        assertEquals(1500, piano.getRetailPrice());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(500, piano.calculateMarkup());
    }
}

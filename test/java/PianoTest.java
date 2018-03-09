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
        piano = new Piano("Steinway", 88, 1000, 1500, InstrumentType.CHORDOPHONE, 6, PianoType.GRAND, "Black", "Mahogany");
//        String name, int WholesalePrice, int RetailPrice, int numberOfStrings, GuitarType guitarType
    }

    @Test
    public void canPlay(){
        assertEquals("I am playing a Piano!", piano.playInstrument("Piano!"));
    }
}

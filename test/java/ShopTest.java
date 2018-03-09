import AbstractClasses.Product;
import Classes.DrumStick;
import Classes.Guitar;
import Classes.Piano;
import Classes.Shop;
import ENUMs.DrumStickType;
import ENUMs.GuitarType;
import ENUMs.InstrumentType;
import ENUMs.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Piano piano;
    Guitar guitar;
    DrumStick drumStick;
    Shop shop;
    Product product;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("WeeAlsTrumpetEmporioum");
        piano = new Piano("Steinway", 88, 1500, 1000, InstrumentType.CHORDOPHONE, 6, PianoType.GRAND, "Black", "Mahogany");
        guitar = new Guitar("GIBSON Les Paul Traditional 2018", 700, 300, InstrumentType.CHORDOPHONE, 6, GuitarType.ELECTRIC, 1, "Sunburst", "Hazelwood");
        drumStick = new DrumStick("Vic Furth", 30, 20, 5, DrumStickType.BRUSHES);
    }

    @Test
    public void canCountStock(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddProductToStock(){
        shop.addToStock(product);
        assertEquals(1, shop.countStock());
    }
}

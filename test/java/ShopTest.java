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

    private Shop shop;
    private Product product1;
    private Product product2;
    private Product product3;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("WeeAlsTrumpetEmporioum");
        product1 = new Piano("Steinway", 88, 1500, 1000, InstrumentType.CHORDOPHONE, 6, PianoType.GRAND, "Black", "Mahogany");
        product2 = new Guitar("GIBSON Les Paul Traditional 2018", 700, 300, InstrumentType.CHORDOPHONE, 6, GuitarType.ELECTRIC, 1, "Sunburst", "Hazelwood");
        product3 = new DrumStick("Vic Furth", 30, 20, 5, DrumStickType.BRUSHES, "Oak", 16);
    }

    @Test
    public void canCountStock(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddProductToStock(){
        shop.addToStock(product1);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveProductFromStock(){
        shop.addToStock(product1);
        shop.addToStock(product1);
        shop.removeStock();
        assertEquals(1, shop.countStock());
    }

    @Test
    public void totalPotentialProfit(){
        shop.addToStock(product3);
        shop.addToStock(product2);
        shop.addToStock(product1);
        assertEquals(3450, shop.totalPotentialProfit());
    }
}

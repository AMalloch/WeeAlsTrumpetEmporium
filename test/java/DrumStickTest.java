import Classes.DrumStick;
import ENUMs.DrumStickType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    private DrumStick drumStick;

    @Before
    public void setUp() throws Exception {
        drumStick = new DrumStick("Vic Furth", 30, 20, 5, DrumStickType.BRUSHES, "Oak");
    }

    @Test
    public void canGetRetailPrice(){
        assertEquals(30, drumStick.getRetailPrice());
    }

    @Test
    public void canGetWholeSalePrice(){
        assertEquals(20, drumStick.getWholeSalePrice());
    }

    @Test
    public void canCalculateMarkupIndividually(){
        assertEquals(10, drumStick.calculateMarkupIndividual());
    }

    @Test
    public void canCalculateMarkupByQuantity(){
        assertEquals(50, drumStick.calculateMarkupAll());
    }

    @Test
    public void getQuantity(){
        assertEquals(5, drumStick.getQuantity());
    }
}

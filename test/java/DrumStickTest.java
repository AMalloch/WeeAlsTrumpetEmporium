import Classes.DrumStick;
import ENUMs.DrumStickType;
import org.junit.Before;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void setUp() throws Exception {
        drumStick = new DrumStick("Vic Furth", 30, 20, 5, DrumStickType.BRUSHES);
    }
}

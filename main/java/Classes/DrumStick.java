package Classes;

import AbstractClasses.Accessorie;
import ENUMs.DrumStickType;

public class DrumStick extends Accessorie{

    private DrumStickType drumStickType;

    public DrumStick(String name, int retailPrice, int wholesalePrice, int quantity, DrumStickType drumStickType) {
        super(name, retailPrice, wholesalePrice, quantity);
    }

    @Override
    public int calculateMarkup() {
        return 0;
    }
}

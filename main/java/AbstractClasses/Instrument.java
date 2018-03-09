package AbstractClasses;

import ENUMs.InstrumentType;
import Interfaces.IPlay;

public abstract class Instrument extends Product implements IPlay {

    private InstrumentType instrumentType;
    private String colour;
    private String material;

    public Instrument(String name, int retailPrice, int wholesalePrice, InstrumentType instrumentType, int quantity, String colour, String material) {
        super(name, wholesalePrice, retailPrice, quantity);
    }
}

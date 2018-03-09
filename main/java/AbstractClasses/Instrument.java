package AbstractClasses;

import ENUMs.InstrumentType;
import Interfaces.IPlay;

public abstract class Instrument extends Product implements IPlay {

    private InstrumentType instrumentType;

    public Instrument(String name, int WholesalePrice, int RetailPrice, InstrumentType instrumentType) {
        super(name, WholesalePrice, RetailPrice);
    }
}

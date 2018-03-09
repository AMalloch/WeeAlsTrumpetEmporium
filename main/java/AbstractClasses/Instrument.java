package AbstractClasses;

import Interfaces.IPlay;

public abstract class Instrument extends Product implements IPlay {
    public Instrument(String name, int WholesalePrice, int RetailPrice) {
        super(name, WholesalePrice, RetailPrice);
    }
}

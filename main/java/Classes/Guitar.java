package Classes;

import AbstractClasses.Instrument;
import ENUMs.GuitarType;
import ENUMs.InstrumentType;

public class Guitar extends Instrument{

    private int numberOfStrings;
    private GuitarType guitarType;

    public Guitar(String name, int WholesalePrice, int RetailPrice, InstrumentType instrumentType, int numberOfStrings, GuitarType guitarType) {
        super(name, WholesalePrice, RetailPrice, instrumentType);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    @Override
    public String playInstrument(String instrument) {
        return "I am playing a " + instrument;
    }
}

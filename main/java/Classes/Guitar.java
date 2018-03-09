package Classes;

import AbstractClasses.Instrument;
import ENUMs.GuitarType;
import ENUMs.InstrumentType;

public class Guitar extends Instrument{

    private int numberOfStrings;
    private GuitarType guitarType;

    public Guitar(String name, int retailPrice, int wholesalePrice, InstrumentType instrumentType, int numberOfStrings, GuitarType guitarType, int quantity, String colour, String material) {
        super(name, wholesalePrice, retailPrice, instrumentType, quantity, colour, material);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    @Override
    public String playInstrument(String instrument) {
        return "I am playing a " + instrument;
    }

    @Override
    public int calculateMarkup() {
        return getRetailPrice() - getWholeSalePrice();
    }
}

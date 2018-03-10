package Classes;

import AbstractClasses.Instrument;
import ENUMs.InstrumentType;
import ENUMs.PianoType;

public class Piano extends Instrument {

    private int numberOfKeys;
    private PianoType pianoType;

    public Piano(String name, int numberOfKeys, int retailPrice, int wholesalePrice, InstrumentType instrumentType, int quantity, PianoType pianoType, String colour, String material) {
        super(name, wholesalePrice, retailPrice, instrumentType, quantity, colour, material);
    }

    @Override
     public String playInstrument(String instrument) {
         return "I'm playing a " + instrument;
     }

    @Override
    public int calculateMarkupIndividual() {
        return getRetailPrice() - getWholeSalePrice();
    }

    @Override
    public int calculateMarkupAll() {
        return (getRetailPrice() - getWholeSalePrice()) * getQuantity();
    }

}

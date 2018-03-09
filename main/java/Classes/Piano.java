package Classes;

import AbstractClasses.Instrument;
import ENUMs.InstrumentType;
import ENUMs.PianoType;

public class Piano extends Instrument {

    private int numberOfKeys;
    private PianoType pianoType;

    public Piano(String name, int numberOfKeys, int WholesalePrice, int RetailPrice, InstrumentType instrumentType, int quantity, PianoType pianoType, String colour, String material) {
        super(name, WholesalePrice, RetailPrice, instrumentType, quantity, colour, material);
    }

    @Override
     public String playInstrument(String instrument) {
         return null;
     }
 }

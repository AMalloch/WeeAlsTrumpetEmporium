package Classes;

import AbstractClasses.Accessory;
import ENUMs.DrumStickType;

public class DrumStick extends Accessory {

    private DrumStickType drumStickType;
    private String material;

    public DrumStick(String name, int retailPrice, int wholesalePrice, int quantity, DrumStickType drumStickType, String material) {
        super(name, retailPrice, wholesalePrice, quantity);
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

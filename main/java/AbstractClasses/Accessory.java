package AbstractClasses;

import AbstractClasses.Product;

public abstract class Accessory extends Product{
    public Accessory(String name, int retailPrice, int wholesalePrice, int quantity) {
        super(name, retailPrice, wholesalePrice, quantity);
    }
}

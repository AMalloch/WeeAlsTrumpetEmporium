package AbstractClasses;

import AbstractClasses.Product;

public abstract class Accessorie extends Product{
    public Accessorie(String name, int retailPrice, int wholesalePrice, int quantity) {
        super(name, retailPrice, wholesalePrice, quantity);
    }
}

package AbstractClasses;

import Interfaces.ISell;

public abstract class Product implements ISell{
    private String name;
    private int wholesalePrice;
    private int retailPrice;
    private int quantity;

    public Product(String name, int retailPrice, int wholesalePrice, int quantity) {
        this.name = name;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.quantity = quantity;
    }

    public int getWholeSalePrice() {
        return wholesalePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }
}

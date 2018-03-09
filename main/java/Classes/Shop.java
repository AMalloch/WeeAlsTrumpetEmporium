package Classes;

import AbstractClasses.Product;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Product> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addToStock(Product product) {
        this.stock.add(product);
    }

}

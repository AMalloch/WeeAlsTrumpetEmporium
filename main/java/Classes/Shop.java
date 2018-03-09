package Classes;

import AbstractClasses.Product;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Product> stock;
    private int potentialProfit;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
        this.potentialProfit = potentialProfit;
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addToStock(Product product) {
        this.stock.add(product);
    }

    public void removeStock() {
        this.stock.remove(0);
    }

    public int totalPotentialProfit() {
        for (Product product : stock) {
            potentialProfit = product.calculateMarkup();
        }return potentialProfit;
    }
}

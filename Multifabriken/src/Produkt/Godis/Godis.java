package Produkt.Godis;

import Produkt.Produkt;

public class Godis extends Produkt {

    private String taste; 
    private int amount; 

    public Godis (String taste, int amount) {
        this.taste = taste; 
        this.amount = amount; 
        this.price = 100; 
    }

    public int getPrice() {
        return price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}

package Produkt.Havremjölk;
import Produkt.Produkt;

public class Havremjolk extends Produkt {
    private double lAmount;
    private double fat; 

    public Havremjolk (double lAmount, double fat) {
        this.lAmount = lAmount;
        this.fat = fat; 
        this.price = 20; 
    }

    public int getPrice() {
        return price;
    }

    public double getlAmount() {
        return lAmount;
    }

    public void setlAmount(double lAmount) {
        this.lAmount = lAmount;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }
}

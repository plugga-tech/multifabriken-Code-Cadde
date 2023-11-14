package Havremjölk;
public class Havremjolk {
    private double lAmount;
    private double fat; 

    public Havremjolk (double lAmount, double fat) {
        this.lAmount = lAmount;
        this.fat = fat; 
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

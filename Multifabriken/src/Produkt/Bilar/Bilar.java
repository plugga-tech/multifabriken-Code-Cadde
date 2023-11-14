package Produkt.Bilar;

import Produkt.Produkt;

public class Bilar extends Produkt {

    private String reg; 
    private String color; 
    private String brand; 

    public Bilar(String reg, String color, String brand, int price) {
        this.reg =  reg; 
        this.color = color; 
        this.brand = brand;
        this.price = price;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}

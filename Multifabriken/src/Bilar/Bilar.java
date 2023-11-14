package Bilar;
public class Bilar {

    private String reg; 
    private String color; 
    private String brand; 

    public Bilar(String reg, String color, String brand) {
        this.reg =  reg; 
        this.color = color; 
        this.brand = brand; 
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

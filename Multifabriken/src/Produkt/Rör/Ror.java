package Produkt.Rör;

import Produkt.Produkt;

public class Ror extends Produkt{
    private double diameter; 
    private double length; 

    public Ror (double diameter, double length) {
        this.diameter = diameter; 
        this.length = length; 
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
}

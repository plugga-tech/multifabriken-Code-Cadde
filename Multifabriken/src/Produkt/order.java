package Produkt;

import java.util.ArrayList;
import java.util.List;

import Produkt.Bilar.Bilar;
import Produkt.Godis.Godis;
import Produkt.Havremjölk.Havremjolk;
import Produkt.Rör.Ror;

public class order {
    private List<Bilar> cars; 
    private List<Godis> candys; 
    private List<Ror> pipe; 
    private List <Havremjolk> oatmilk; 
    

    public order() {
        this.cars = new ArrayList<>(); 
        this.candys =  new ArrayList<>(); 
        this.pipe =  new ArrayList<>();
        this.oatmilk =  new ArrayList<>(); 
    }
    public void createCar (String regnr, String color, String brand, int price) {
        Bilar nybil = new Bilar(regnr, color, brand);
        cars.add(nybil); 
    }
    public void createCandy (String taste, int amount) {
        Godis newCandy = new Godis(taste, amount);
        candys.add(newCandy);
}
public void createPipe (double diameter, double length) {
        Ror newPipe = new Ror(diameter, length);
        pipe.add(newPipe);
}
public void createOatmeal (double amount, double fat) {
        Havremjolk newOatmilk = new Havremjolk(amount, fat);
        oatmilk.add(newOatmilk); 
}
public void listOrder() {
    System.out.println("Beställda bilar: ");
    for (Bilar bil : cars) {
        System.out.println("Registreringsnummer: " + bil.getReg() + ", Färg: " + bil.getColor() + ", Bilmärke: " + bil.getBrand() + ", Pris: " + bil.getPrice());
    }

    System.out.println("Beställt godis:");
    for (Godis godis : candys) {
        System.out.println("Smak: " + godis.getTaste() + ", Antal: " + godis.getAmount() + ", Pris: " + godis.getPrice());
    }

    System.out.println("Beställda rör:");
    for (Ror rör : pipe) {
        System.out.println("Diameter: " + rör.getDiameter() + ", Längd: " + rör.getLength() + ", Pris: " + rör.getPrice());
    }

    System.out.println("Beställd havremjölk:");
    for (Havremjolk oatmilk : oatmilk) {
        System.out.println("Mängd: " + oatmilk.getlAmount() + " liter, Fetthalt: " + oatmilk.getFat() + ", Pris: " + oatmilk.getPrice());
    }
}

}
        
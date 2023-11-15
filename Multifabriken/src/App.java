import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner =  new Scanner(System.in); 
        int choice; 
        boolean run = true; 

        System.out.println("Välkommen till Berras alltiallo butik!");

        


        while (run == true) {
            System.out.println("Välj en produkttyp att beställa:");
            System.out.println("1. Bil");
            System.out.println("2. Godis");
            System.out.println("3. Rör");
            System.out.println("4. Havremjölk");
            System.out.println("5. Avsluta");

            System.out.print("Ange ditt val: ");
            choice = scanner.nextInt(); 

        switch (choice) {
            case 1:

            System.out.println("Ange registreringsnummer: ");
            String regNr = scanner.nextLine();
            System.out.println("Ange färg: ");
            String color = scanner.nextLine();
            System.out.println("Ange bilmärke: ");
            String brand = scanner.nextLine();  
            break;

            case 2:
            System.out.println("Ange smak: ");
            String taste = scanner.nextLine();
            System.out.println("Ange mängd: ");
            int amount = scanner.nextInt();     
            break;

            case 3:
            System.out.println("Ange diameter: ");
            double diameter = scanner.nextInt(); 
            System.out.println("Ange längd: ");
            double length =  scanner.nextInt(); 
            break;

            case 4:
            System.out.println("Ange mängd i liter: ");
            double lAmount = scanner.nextInt(); 
            System.out.println("Välj fetthalt: ");
            double fat = scanner.nextInt(); 
            break;

            case 5:
            System.out.println("Avslutar programmet. Tack för ditt besök!");
            run = false; 
            break;
        
            default:
            System.out.println("Ogiltigt svar, försök igen!");
                break;
        }
        }

    }
}

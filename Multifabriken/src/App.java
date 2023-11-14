import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner =  new Scanner(System.in); 
        String choice; 
        boolean run = true;

        System.out.println("Välkommen till Berras alltiallo butik!");

        while (run = true) {
            System.out.println("Välj en produkttyp att beställa:");
            System.out.println("1. Bil");
            System.out.println("2. Godis");
            System.out.println("3. Rör");
            System.out.println("4. Havremjölk");
            System.out.println("5. Avsluta");

            System.out.print("Ange ditt val: ");
            choice = scanner.nextLine(); 

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
                
            break;

            case 3:
                
            break;

            case 4:
                
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

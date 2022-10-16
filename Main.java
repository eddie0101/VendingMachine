import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        System.out.println("\t****************************************************");
        System.out.println("\t               WELCOME TO JAVA DRINKS!              ");
        //System.out.println("\t****************************************************");

        Machine machine = new Machine(
            new Item[][] {
                { new Item("Pepsi", 1.99, 3), new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
                { new Item("Fanta", 1.99, 2), new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
                { new Item("Crush", 1.99, 2), new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
            }
        );
        System.out.println(machine);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Pick a row: ");
            int row = scan.nextInt();
            System.out.print("Pick a spot: ");
            int spot = scan.nextInt();
    
            if (machine.dispense(row, spot) == true) {
                System.out.print("Enjoy your drink! Press 1 to get another: ");
            }
            else {
                System.out.print("Sorry, we're out of this item. Press 1 to purchase another: ");
            }
            int input = scan.nextInt();
            if (input == 1) {
                System.out.println(machine);
            }
            else {
                System.exit(0);
            }

        }

    }

}
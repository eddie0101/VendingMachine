import java.util.Scanner;

import models.Item;
import models.Machine;

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
            int row = scan.hasNextInt() ? scan.nextInt() : 404;
            scan.nextLine();
            System.out.print("Pick a spot: ");
            int spot = scan.hasNextInt() ? scan.nextInt() : 404;
            scan.nextLine();

            if (row == 404 || spot == 404) {
                System.out.println("INVALID INPUT");
                continue;
            } else if (row < 1 || row > machine.getItemLength() || spot < 1 || spot > machine.getItemRowLength()) {
                System.out.println("INPUT OUT OF RANGE");
                continue;
            } else if (machine.getItem(row, spot).getQuantity() == 0) {
                System.out.println("EMPTY SLOT");
                continue;
            }

            machine.dispense(row, spot);
            System.out.println("\n" + machine);
            System.out.print("Enjoy your drink! Press 1 to purchase another: ");
            if (!scan.nextLine().equals("1")) {
                break;
            }
        }
        scan.close();

    }

}
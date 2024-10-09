package shoppingcart;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        String command;
        System.out.println("Welcome to your shopping cart ");

        while (true) {
            System.out.print("\n> ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("list")) {
                shoppingCart.listItems();
            } else if (command.toLowerCase().startsWith("add")) {
                String items = command.substring(4); // Extract items after 'add'
                shoppingCart.addItems(items);
            } else if (command.toLowerCase().startsWith("delete")) {
                try {
                    int index = Integer.parseInt(command.substring(7).trim()); // Extract index after 'delete'
                    shoppingCart.deleteItem(index);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Unknown command. Please try again.");
            }
        }

        scanner.close();

    }

}

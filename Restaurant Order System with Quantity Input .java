import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for menu selection, quantity, and total amount
        int choice;
        int quantity;
        double totalAmount = 0;

        // Display the menu
        System.out.println("MENU");
        System.out.println("1. Burger    - PHP 100");
        System.out.println("2. Fries     - PHP 50");
        System.out.println("3. Soda      - PHP 30");
        System.out.println("4. Ice Cream - PHP 45");
        System.out.println("5. Exit");

        // Prompt the user to enter a menu item number
        System.out.print("Enter the menu number of your choice: ");
        choice = scanner.nextInt();

        // Use switch to process the user's menu choice
        switch (choice) {
            case 1: // Burger
                System.out.print("Enter the quantity: ");
                quantity = scanner.nextInt();
                totalAmount = 100 * quantity;
                System.out.println("You ordered Burger.");
                break;
            case 2: // Fries
                System.out.print("Enter the quantity: ");
                quantity = scanner.nextInt();
                totalAmount = 50 * quantity;
                System.out.println("You ordered Fries.");
                break;
            case 3: // Soda
                System.out.print("Enter the quantity: ");
                quantity = scanner.nextInt();
                totalAmount = 30 * quantity;
                System.out.println("You ordered Soda.");
                break;
            case 4: // Ice Cream
                System.out.print("Enter the quantity: ");
                quantity = scanner.nextInt();
                totalAmount = 45 * quantity;
                System.out.println("You ordered Ice Cream.");
                break;
            case 5: // Exit
                System.out.println("Thank you for visiting. Have a nice day!");
                return; // Exit the program
            default:
                System.out.println("Invalid choice. Please select a valid menu item.");
                return; // Exit if invalid input
        }

        // Display the total bill
        System.out.printf("Total amount: PHP %.2f\n", totalAmount);
    }
}
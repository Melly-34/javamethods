package restaurant.cj;

import java.util.Scanner;

public class StartingPoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Vees Restaurant");
        System.out.println("Select a service:");
        System.out.println("1. Show menu.\n2. Place order.\n3. Edit Restaurant menu(Admininstration only).");
        System.out.println("Enter a number representing a service: ");
        int selectedOption = input.nextInt();

        Menu menuObj = new Menu();
        switch (selectedOption) {
            case 1 -> {
                System.out.println("Selected Service: Show menu");
                menuObj.showMenu();
            }
            case 2 -> {
                System.out.println("Selected Service: Place order");
                menuObj.showMenu();
                System.out.println("Enter a number representing a drink: ");
                int selectedDrink = input.nextInt();
                System.out.println("Enter a number representing a food: ");
                int selectedFood = input.nextInt();

                Transactions transactionsObject = new Transactions();
                transactionsObject.showSelectedOrder(selectedDrink, selectedFood);
            }
            case 3 -> System.out.println("Selected Service: Edit Restaurant menu");
            default -> System.out.println("Invalid selection");
        }

    }
}

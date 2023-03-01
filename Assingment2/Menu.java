package restaurant.cj;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    void showMenu() {
        System.out.println("Drinks: ");
        // list to hold drinks items
        List<String> drinks = new ArrayList<String>();
        drinks.add("1. Water - 200");
        drinks.add("2. CockTail - 450");
        drinks.add("3. MockTail - 400");
        drinks.add("4. Juice - 300");
        drinks.add("5. Coffee - 250");
        System.out.println(drinks);

        System.out.println("Foods: ");
        // list to hold foods items
        List<String> foods = new ArrayList<String>();
        foods.add("1. Shawarma - 250");
        foods.add("2. Chips Masala - 250");
        foods.add("3. Pilau - 200");
        foods.add("4. Biryani - 350");
        foods.add("5. Pizza - 750");
        System.out.println(foods);
    }

    List<String> drinks = new ArrayList<>();
    List<String> foods = new ArrayList<>();
    void showMenuItems() {
        System.out.println("Drinks: ");
        // list to hold drinks items

        drinks.add("1. Water - 200");
        drinks.add("2. CockTail - 450");
        drinks.add("3. MockTail - 400");
        drinks.add("4. Juice - 300");
        drinks.add("5. Coffee - 250");

        System.out.println("Foods: ");
        // list to hold foods items

        foods.add("1. Shawarma - 250");
        foods.add("2. Chips Masala - 250");
        foods.add("3. Pilau - 200");
        foods.add("4. Biryani - 350");
        foods.add("5. Pizza - 750");
    }
}

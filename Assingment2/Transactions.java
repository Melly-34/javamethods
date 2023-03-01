package restaurant.cj;

public class Transactions {

    void showSelectedOrder(int selectedDrink, int selectedFood){
        Menu menuObj = new Menu();

        menuObj.showMenuItems();
        System.out.println("Selected drink: " + menuObj.drinks.get(selectedDrink-1));
        System.out.println("Selected foods: " + menuObj.foods.get(selectedFood-1));
    }
}

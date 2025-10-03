package encapsulation.exercises;

import java.util.*;

/**
 TODO:
 1. Create a class ShoppingCart with:
      - private field items (ArrayList of Strings).
      - private field totalPrice (double).

 2. Add methods:
      - addItem(String item, double price) → adds item and increases total price.
      - removeItem(String item, double price) → removes item if it exists and decreases total price.
      - getTotalPrice() → returns current total.
      - getItems() → returns the list of items.

 3. Add validation:
      - No negative prices allowed.
      - If you try to remove an item that doesn't exist, print a message.

 4. Challenge:
      - Add a method applyDiscount(double percentage) → reduces total price by that percentage,
        but only if percentage is between 0 and 50.
*/
class ShoppingCart
{
    private List<String> items;
    private double totalPrice;
    ShoppingCart()
    {
        items = new ArrayList<>();
        totalPrice = 0;
    }

    public void addItem(String item, double price)
    {
        if(price < 1)
        {
            System.out.println(item + " wasn't added - price cannot be less than 1!");
            return;
        }
        items.add(item);
        totalPrice += price;
    }

    public void removeItem(String item, double price)
    {
        if(items.remove(item))
        {
            totalPrice -= price;
            System.out.println(item + " - was successfully removed");
        }
        else
        {
            System.out.println(item + " - was not found");
        }
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }

    public List<String> getItems()
    {
        return items;
    }

    @Override
    public String toString()
    {
        return "Your cart:\t\t\t" + items + "\n" + "Your total price:\t" + totalPrice;
    }
}
public class ExerciseShoppingCart
{
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("Apple", 10);
        shoppingCart.addItem("Banana", 12);
        shoppingCart.addItem("Orange", 23);
        shoppingCart.addItem("Tomato", -1);

        System.out.println();
        System.out.println(shoppingCart);

        shoppingCart.removeItem("Banana", 12);
        shoppingCart.removeItem("Watermelon", 12);

        System.out.println();
        System.out.println(shoppingCart);



    }

}

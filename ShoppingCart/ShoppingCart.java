package ShoppingCart;
import java.util.HashMap;
import java.util.Map;

/*
 * Online Shopping Cart
 * 
 * This java program is to implement a shopping cart system where
 * users can add items.
 * 
 * @author @tgillysuit - Tyler Gilmore
 * @version 0.0.1
 * 
 */

public class ShoppingCart 
{
    // The item's name and price.
    private Map<String, Double> cart;

    // Constructor
    public ShoppingCart()
    {
        cart = new HashMap<>();
    }

    // Method that adds an item to the cart
    public void addItem(String itemName, Double price)
    {
        cart.put(itemName, price);
        System.out.println(itemName + " was added to your cart.");
    }

    // Method that displays the items in the cart
    public void displayCart()
    {
        System.out.println("Items in your cart: ");
        for (Map.Entry<String, Double> entry : cart.entrySet())
        {
            System.out.println(("- " + entry.getKey() + ": $" + entry.getValue()));
        }
    }

    // Method that calculates the total in the cart
    public double calculateTotal() {
        double total = 0.0;
        for (double price : cart.values())
        {
            total += price;
        }
        return total;
    }
}
package ShoppingCart;
import java.util.Scanner;

/*
 * Store
 * 
 * This is the Main class where we will go shopping! :D
 * 
 * @author @tgillysuit - Tyler Gilmore
 * @version 0.0.1
 * 
 */

// The "Main" class
public class Store 
{
    private static String itemName;
    private static double price;
    private static String choice;  

    public static void main(String[] args) 
    {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        boolean addItems = true;

        while (addItems)
        {
            System.out.print("Enter item name: ");
            itemName = scanner.nextLine();
            System.out.print("Enter Item price: ");
            price = scanner.nextDouble();
            scanner.nextLine();

            cart.addItem(itemName, price);
            
            System.out.println("Would you like to add another item? (y/n)");
            choice = scanner.nextLine();

            addItems = choice.equals("y");
        }

        cart.displayCart();

        System.out.println("Total Price: $" + cart.calculateTotal());

        scanner.close();
    }
}

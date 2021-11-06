
/**
 * Simulates shopping.
 *
 * @author Ian T. Webster
 * @version 3/10/2021
 */
import java.util.Scanner;
public class ShopTest3
{
    public static void main(String[] args){
        int items = 0;
        int status;
        String name;
        double price;
        int quantity;
        ShoppingCart3 shoppingCart = new ShoppingCart3();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Would you like to add something to your cart?(Enter 1 for yes, 2 if you are finished shopping)");
            status = scan.nextInt();
            scan.nextLine();
            if (status==1){
                System.out.println("Item name?");
                name = scan.nextLine();
                System.out.println("Item price?");
                price = scan.nextDouble();
                System.out.println("Item quantity?");
                quantity = scan.nextInt();
                scan.nextLine();
                shoppingCart.addToCart(name, price, quantity);
                items++;
                System.out.println(shoppingCart.toString());               
            }
            
            else if(status==2){
                System.out.println("Please pay: $"+shoppingCart.getTotalPrice());
                break;}
            else
                System.out.println("Try again, I don't think you entered a 1 or 2.");
        }

                 
    }
    
}


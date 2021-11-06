
// **********************************************************************
// ShoppingCart.java
//
// Represents a shopping cart as an array of items
// **********************************************************************
import java.text.NumberFormat;
public class ShoppingCart2
{
private int itemCount; // total number of items in the cart
private double totalPrice; // total price of items in the cart
private int capacity; // current cart capacity
public Item[] cart;
//
// Creates an empty shopping cart with a capacity of 5 items.
//
public ShoppingCart2()
{
capacity = 5;
itemCount = 0;
totalPrice = 0.0;
cart = new Item[capacity];
}
//
// Adds an item to the shopping cart.
//
public void addToCart(String itemName, double price, int quantity)
{
    if(itemCount==capacity)
        increaseSize();
    Item george = new Item(itemName, price, quantity);
    cart[itemCount]=george;
    itemCount++;
    totalPrice+=(price*quantity);
}

public void increaseSize(){
    capacity*=3;
    Item [] cart1 = new Item[capacity];
    for (int bob = 0; bob<cart.length; bob++)
        cart1[bob] = cart[bob];    
    cart = cart1;
}
//
// Returns the contents of the cart together with
// summary information.
//
public String toString()
{
NumberFormat fmt = NumberFormat.getCurrencyInstance();
String contents = "\nShopping Cart\n";
contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
for (int i = 0; i < itemCount; i++)
contents += cart[i].toString() + "\n";
contents += "\nTotal Price: " + fmt.format(totalPrice);
contents += "\n";
return contents;
}
public double getTotalPrice(){
     return totalPrice;
}
}
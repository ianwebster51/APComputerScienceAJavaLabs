
/**
 * Sauteed Mushrooms.
 *
 * Ian T. Webster
 * 10/21/2020
 */
import java.util.Scanner;
public class Factorials
{
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         int factorial, counter = 1, product = 1;
         System.out.println("What number would you like to factorial to?(must be a positive integer)");
         factorial = scan.nextInt();
         while ((factorial < 0)||(factorial%1 != 0)){
              System.out.println("Whoops, looks like you didn't enter a positive integer, try again!");
              factorial = scan.nextInt();}
         while(counter <= factorial){
            product *= counter;
            counter++;
         }
         System.out.println("Your factorial's answer is " + product + ".");
        }
}

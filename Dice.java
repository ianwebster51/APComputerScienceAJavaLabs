
/**
 * Simulates the rolling of two dice
 *
 * Ian T. Webster
 * 9/10/2020
 */
import java.util.Scanner;//importing the scanner to take in input.

public class Dice
{
   public static void main (String[] args)
   {
       Scanner scan = new Scanner(System.in);//instantiating the scanner for later use.
       
       String status;//declaring my variables
       
       double dice1, dice2, sum;//declaring my variables
       
       while (true) {//allowing program to be used more than once without having to open again.
            
           while(true){//making sure an error doesn't occur.
                
               System.out.println("Would you like to roll?(answer yes or no exactly): ");//making it user friendly
           
               status = scan.nextLine();
            
               if (status.equals("yes")){
                   
                   break;
                }
                else if (status.equals("no")){
                
                    System.out.println("Maybe later.");
            
                }
                else {
                
                    System.out.println("Try again: You didn't enter \"yes\" or \"no\" exactly.");
                
                }
                
           }
            
            dice1 = (int)((Math.random()) * 6) + 1;//generating the random dice rolls.
            dice2 = (int)((Math.random()) * 6) + 1;
            
            sum = dice1 + dice2;//calculating the sum of the rolls.
            
            System.out.println("Dice 1 rolled "+dice1+", Dice 2 rolled "+dice2+", their sum is "+sum+".");
        }
       
   }
}

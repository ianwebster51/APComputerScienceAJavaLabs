
/**
 * Pineapple on Pizza.
 *
 * Ian T. Webster
 * 10/20/2020
 */
import java.util.Scanner;
public class OddEven
{
    public static void main(String[] args){
        
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Please enter a positive integer: ");
       
       int ppizza = scan.nextInt();
       
       int odd = 0, even = 0, zero = 0, cv = 0;
       
       for(int k = 0; k < (String.valueOf(ppizza)).length(); k++){
           
           cv =  (Character.getNumericValue((String.valueOf(ppizza)).charAt(k)));
           
           if ((cv % 2) == 0) {
               if (cv == 0)
                  zero++;
               else
                  even++;
            }
            
            else
               odd++;
        }
        
        if ( even == 1)
           System.out.println("There is " + even + " even digit." );
        else
           System.out.println("There are " + even + " even digits.");
       
        if ( odd == 1)
           System.out.println("There is " + odd + " odd digit." );
        else
           System.out.println("There are " + odd + " odd digits.");
        
        if ( zero == 1)
           System.out.println("There is " + zero + " zero digit." );
        else
           System.out.println("There are " + zero + " zero digits.");
        }
}


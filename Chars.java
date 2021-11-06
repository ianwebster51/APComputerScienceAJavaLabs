
/**
 * Wings and blue cheese.
 *
 * Ian T. Webster
 * 10/20/2020
 */
import java.util.Scanner;
public class Chars
{
    public static void main(String[] args){
    
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter a string of characters: ");
       String wings = scan.nextLine();
       for(int k = 0; k < wings.length(); k++){
           System.out.println(wings.charAt(k));
        }
    }
}

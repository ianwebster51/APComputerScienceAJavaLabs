
/**
 * Write a description of class AccountTest2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AccountTest2
{
    static int numOfAcct;
    static String name;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many accounts will you be creating?");
        numOfAcct = scan.nextInt();
        scan.nextLine(); //to eliminate the skipping problem when I use nextLine below.
        System.out.println();
        for(int k=0; k<numOfAcct; k++){
            System.out.print("Enter the name of the account #"+(k+1)+": ");
            name = scan.nextLine();
            Account2 account = new Account2(100,name);
            System.out.println(account.toString());
            System.out.println("Next id number is: "+Account2.getNextNum());
            System.out.println();
        }
        System.out.println("End of program, Goodbye");
    }
}

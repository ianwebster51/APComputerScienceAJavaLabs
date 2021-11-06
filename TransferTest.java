
/**
 * Tests Account.
 *
 * Ian T. Webster
 * 1/28/2021
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class TransferTest
{
    public static void main(String[] args){
        //variables
        boolean bob = true;
        int choice;
        double transferAmount;
        
        //objects
        Scanner scan = new Scanner(System.in);
        NumberFormat nerf = NumberFormat.getCurrencyInstance();       
        Account john = new Account(1000, "John");
        Account sally = new Account(1000, "Sally");
        
        //This loop does all the actual interacting with the user and calling of the functions.
        while (bob){
            //This print statement gives the user their transfer options.
            System.out.println("1 – Transfer from John to Sally’s account.\n2 – Transfer from Sally to John’s account.\n3 – Transfer using static method.\n4 - Quit\nEnter the number to choose an option from above:");
            choice = scan.nextInt();
            //Option 4 quits, it ends the transfer loop.
            if (choice == 4){bob = false;}
            
            //Option 1 transfers money from John's account to Sally's account.
            else if (choice == 1){
                System.out.println("How much would you like to transfer?(Enter a double or int)");
                transferAmount = scan.nextDouble();
                john.transfer(sally,transferAmount);
                System.out.println("John's balance is "+nerf.format(john.getBalance())+". Sally's balance is "+nerf.format(sally.getBalance())+".");
            }
            
            //Option 2 transfers money from Sally's account to John's account.
            else if (choice == 2){
                System.out.println("How much would you like to transfer?(Enter a double or int)");
                transferAmount = scan.nextDouble();
                sally.transfer(john,transferAmount);
                System.out.println("John's balance is "+nerf.format(john.getBalance())+". Sally's balance is "+nerf.format(sally.getBalance())+".");              
            }
            
            //Option 3 does the same as the two that come before, except with a static method.
            else if (choice == 3){
                System.out.println("How much would you like to transfer?(Enter a double or int)");
                transferAmount = scan.nextInt();
                //This part allows the user to choose from which account they want to transfer money from.
                System.out.println("Which account do you want the money tranfered from to?\n(enter 1 if you want to tranfer from John's account to Sally's account, \nenter 2 if you want to transfer from Sally's accout to John's account):");
                choice = scan.nextInt();
                
                if (choice==1){Account.transfer(john, sally, transferAmount);}
                else if(choice==2){Account.transfer(sally, john, transferAmount);}
                else{System.out.println("Invalid Response, try again.");}
                System.out.println("John's balance is "+nerf.format(john.getBalance())+". Sally's balance is "+nerf.format(sally.getBalance())+".");  
            }
            
            
            else{System.out.println("Invalid Response, try again.");}
        }
        
        //Prints the final balances
        System.out.println(john);
        System.out.println(sally);
    }
}

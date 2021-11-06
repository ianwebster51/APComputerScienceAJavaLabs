
/**
 * Bank account class with
methods to withdraw, deposit, get name, get the balance and get account number, and return a String
representation.
 *
 * Ian T. Webster
 * 1/28/2021
 */
import java.text.NumberFormat;
public class Account
{
    static NumberFormat nerf = NumberFormat.getCurrencyInstance();
    double balance;
    String ownerName;
    int accountNum;
    private static int nextAccountNum = 1000;//Holds the value of the next account number.
    
    //constructors
    public Account (double initBal, String owner, int blip){
        balance = initBal;
        ownerName = owner;
        accountNum = blip;
    }
    public Account (double initBal, String owner){
        balance = initBal;
        ownerName = owner;
        accountNum = nextAccountNum;
        nextAccountNum++;
    }
    public Account (String owner){
        ownerName = owner;
        balance = 0;
        accountNum = nextAccountNum;
        nextAccountNum++;
    }
    
    //Setter methods
    public void withdraw(double blop){
        if (blop>balance){
            System.out.println("Insufficent funds.");
        }
        else{
            balance-=blop;
            System.out.println("Withdraw "+nerf.format(blop)+" from "+ownerName+"’s account. New balance is "+nerf.format(balance)+".");
        }
    }
    public void withdraw(double blop, double fee){
        if ((blop+fee)>balance){
            System.out.println("Insufficent funds.");
        }
        else{
            
            balance-=(blop+fee);
            System.out.println("Withdraw "+nerf.format(blop)+" plus "+nerf.format(fee)+" from "+ownerName+"’s account. New balance is "+nerf.format(balance)+".");
        }
    }
    public void deposit(double bloop){balance+=bloop;}
    
    //Getter methods
    public static int getNextNum(){return nextAccountNum;}
    public double getBalance(){return balance;}
    public String getName(){return ownerName;}
    public String toString(){return ownerName+"’s account number is "+accountNum+". Balance is "+nerf.format(balance)+".";}
    
    //Here's the normal transfer method.
    public void transfer(Account acct, double amount)//this transfers money from the instance of the account class that 
    //this method is being called from to the instance that is being passed as a parameter.
    {
        if (amount>balance){System.out.println("Insufficent funds.");}//Checks to ensure there's enough money for the transaction.
        else{
            balance-=amount;
            acct.deposit(amount);
            System.out.println("Transferred "+nerf.format(amount)+" from "+ownerName+"'s account to "+acct.getName()+"'s account.");
        }
        
    }
    
    //Here's the static transfer method.
    public static void transfer(Account acct1, Account acct2, double amount){
        if (amount>acct1.getBalance()){System.out.println("Insufficent funds.");}//Checks to ensure there's enough money for the transaction.
        else{
            acct1.balance-=amount;
            acct2.deposit(amount);
            System.out.println("Transferred "+nerf.format(amount)+" from "+acct1.ownerName+"'s account to "+acct2.ownerName+"'s account.");
        }
    }
}

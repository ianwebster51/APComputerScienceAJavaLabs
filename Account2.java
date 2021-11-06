
/**
 * Bank account class with
methods to withdraw, deposit, get the balance and return a String representation.
 *
 * Ian T. Webster
 * 1/28/2021
 */
public class Account2
{
    double balance;
    String ownerName;
    int accountNum;
    private static int nextAccountNum = 1000;
    public Account2 (double initBal, String owner, int blip){
        balance = initBal;
        ownerName = owner;
        accountNum = blip;
    }
    public Account2 (double initBal, String owner){
        balance = initBal;
        ownerName = owner;
        accountNum = nextAccountNum;
        nextAccountNum++;
    }
    public Account2 (String owner){
        ownerName = owner;
        balance = 0;
        accountNum = nextAccountNum;
        nextAccountNum++;
    }
    public void withdraw(double blop){
        if (blop>balance){
            System.out.println("Insufficent funds.");
        }
        else{
            balance-=blop;
            System.out.println("Withdraw $"+blop+" from "+ownerName+"’s account. New balance is $"+balance+".");
        }
    }
    public void withdraw(double blop, double fee){
        if ((blop+fee)>balance){
            System.out.println("Insufficent funds.");
        }
        else{
            
            balance-=(blop+fee);
            System.out.println("Withdraw $"+blop+" plus $"+fee+" from "+ownerName+"’s account. New balance is $"+balance+".");
        }
    }
    public void deposit(double bloop){balance+=bloop;}
    public static int getNextNum(){return nextAccountNum;}
    public double getBalance(){return balance;}
    public String getName(){return ownerName;}
    public String toString(){return ownerName+"’s account number is "+accountNum+". Balance is $"+balance+".";}
}

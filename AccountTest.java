
/**
 * This tests the account class.
 *
 * Ian T. Webster
 * 1/28/2021
 */
public class AccountTest
{
    public static void main(String[] args){
        Account acct1 = new Account(1000, "John", 1234);
        Account acct2 = new Account("Sally");
        Account acct3 = new Account(5500, "Tommy");
        acct1.deposit(100);
        acct1.withdraw(500);
        System.out.println(acct1);
        acct2.deposit(5000);
        acct2.withdraw(150, 2.50);
        acct2.withdraw(5000);
        System.out.println(acct2);
        acct3.withdraw(500);
        System.out.println(acct3);
    }
}

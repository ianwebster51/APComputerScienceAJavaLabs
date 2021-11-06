
/**
 * Makes objects from the Name class.
 *
 * Ian T. Webster
 * 11/18/2020
 */
import java.util.Scanner;
public class NameTest
{
    public static void main(String[] args){
        
        //instantiating the objects
        Name name1, name2;
        Scanner scan = new Scanner(System.in);
        
        //capturing the inputs
        System.out.print("Enter the name of person 1(first middle last, hit enter after each one): ");
        System.out.println();
        name1 = new Name(scan.nextLine(),scan.nextLine(),scan.nextLine());
        System.out.println();
        
        System.out.println("Enter the name of person 2(first middle last): ");
        System.out.println();
        name2 = new Name(scan.nextLine(),scan.nextLine(),scan.nextLine());
        System.out.println();
        
        //printing out object data
        System.out.println(name1.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println("The name length is "+name1.length()+" characters.");
        System.out.println();
             
        System.out.println(name2.firstMiddleLast());
        System.out.println(name2.lastFirstMiddle());
        System.out.println(name2.initials());
        System.out.println("The name length is "+name2.length()+" characters.");
        System.out.println();
        
        if (name1.equals(name1.fullName,name2.fullName))
             System.out.println("Both names are the same.");
        else
             System.out.println("Both names are different.");
    }
}

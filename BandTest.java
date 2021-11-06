
/**
 * Makes objects of the BandBooster class
 *
 * Ian T. Webster
 * 11/18/2020
 */
import java.util.Scanner;
public class BandTest
{
    
    public static void main(String[] args){
         //initializing the variables 
         BandBooster band1, band2;
         
         //intantiating the methods
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter the name of Band Booster 1: ");
         band1 = new BandBooster(scan.nextLine());
         System.out.println("");
         System.out.print("Enter the name of Band Booster 2: ");
         band2 = new BandBooster(scan.nextLine());
         System.out.println("");
         
         //updating the band booster objects with their boxes sold for week one
         System.out.print("Enter the # of boxes sold by "+band1.name+" for week 1: ");
         band1.updateSales(scan.nextInt());
         System.out.println("");
         System.out.print("Enter the # of boxes sold by "+band1.name+" for week 2: ");
         band1.updateSales(scan.nextInt());
         System.out.println("");
         System.out.print("Enter the # of boxes sold by "+band1.name+" for week 3: ");
         band1.updateSales(scan.nextInt());
         System.out.println("");
         
         System.out.print("Enter the # of boxes sold by "+band2.name+" for week 1: ");
         band2.updateSales(scan.nextInt());
         System.out.println("");
         System.out.print("Enter the # of boxes sold by "+band2.name+" for week 2: ");
         band2.updateSales(scan.nextInt());
         System.out.println("");
         System.out.print("Enter the # of boxes sold by "+band2.name+" for week 3: ");
         band2.updateSales(scan.nextInt());
         System.out.println("");
         
         //toString method
         System.out.println(band1.toString());
         System.out.println(band2.toString());
    }
}

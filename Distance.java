
/**
 * This program computes the distance between two points: (x1,y1) and (x2,y2).
 * Ian T. Webster
 * 9/10/2020
 */

import java.util.Scanner;//installing the scanner method to take in input.

public class Distance
{
   public static void main (String[] args)
   {
       double x1,y1,x2,y2,distance;//declaring my variables.
       
       Scanner scan = new Scanner(System.in);//instantiating the Scanner.
       
       System.out.println("To calculate the distance between the points (x1,y1) and (x2,y2), enter the following values: ");
       
       System.out.println("x1(numeral input only): ");
       
       x1 = scan.nextInt();
       
       System.out.println("y1(numeral input only): ");
       
       y1 = scan.nextInt();
       
       System.out.println("x2(numeral input only): ");
       
       x2 = scan.nextInt();
       
       System.out.println("y2(numeral input only): ");
       
       y2 = scan.nextInt();
       
       distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));//calculating the distance between the points.
       
       System.out.println("Point 1: ("+x1+","+y1+")     Point 2: ("+x2+","+y2+")");
       System.out.println("Distance between them: "+distance);
   }
}

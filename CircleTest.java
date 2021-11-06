
/**
 * Allows user to get the area of a circle from its radius.
 *
 * Ian T. Webster
 * 9/9/2020
 */
import java.util.Scanner;

public class CircleTest
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double r = scan.nextDouble();
    Circle circle1 = new Circle(r);
    double area = circle1.getArea();
    System.out.println("Circle1's radius = " + r + " Circle1's area = " + area);
    double circumference = circle1.getCircumference();
    System.out.println("Circle1's circumference = " + circumference);
    System.out.print("Enter the radius: ");
    r = scan.nextDouble();
    Circle circle2 = new Circle(r);
    area = circle1.getArea();
    circumference = circle2.getCircumference();
    System.out.println("Circle2's circumference = " + circumference + 
    " Circle2's area = " + area);
  }
}

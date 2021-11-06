
/**
 * Write a description of class DivideTwoGui here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class DivideTwoGui
{
    public static void main(String[] args)
    {
      String input;
      double numerator, denominator;
      JOptionPane.showMessageDialog(null, "This program divides two numbers.");
      
      //The input of the jOptionPane is always treated as a string.
      input = JOptionPane.showInputDialog("Enter the numerator:");
      
      //Parsing the string input to a double value using the static method parseDouble() of the DOUBLE class
      numerator = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("Enter the denominator:");
      denominator = Double.parseDouble(input);
      while (denominator == 0){
          System.out.println("Division by zero is not allowed, try again.");
          input = JOptionPane.showInputDialog("Enter the denominator:");
          denominator = Double.parseDouble(input);
        }
      JOptionPane.showMessageDialog(null, numerator + "/" + denominator + " = " +
                                    numerator/denominator);
      System.exit(0);
    }
}
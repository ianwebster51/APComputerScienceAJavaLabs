
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Paint
{
    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        final int DOOR = 20;//area of a door in sq ft
        final int WINDOW = 15;//area of a window in sq ft
        int length, width, height, doors, windows;//declaring the variables
        double totalSqFt, paintNeeded;
	Scanner scan = new Scanner(System.in);//instantiating the scanner

        System.out.println("What is the length of the room?: ");//asking for input
	length = scan.nextInt();//assigning input to its corresponding variable

        System.out.println("What is the width of the room?: ");//asking for input
	width = scan.nextInt();//assigning input to its corresponding variable

        System.out.println("What is the height of the room?: ");//asking for input
	height = scan.nextInt();//assigning input to its corresponding variable
	
	System.out.println("How many doors on the walls are there?: ");//asking for input
	doors = scan.nextInt();//assigning input to its corresponding variable
	
	System.out.println("How many windows on the walls are there?: ");//asking for input
	windows = scan.nextInt();//assigning input to its corresponding variable

        totalSqFt = 2*height*(length+width)-(doors*DOOR)-(windows*WINDOW);//calculating the total area to be painted
        
        paintNeeded = totalSqFt/COVERAGE;//calculating the gallons of paint needed to cover that area
       
        //Commented out, a way to round it upwards to the nearest whole number.
        //if (totalSqFt%COVERAGE == 0)
        //{
            //paintNeeded = totalSqFt/COVERAGE;
        //}
        //else 
        //{
            //paintNeeded = (int)(totalSqFt/COVERAGE) + 1;
        //}

        System.out.println("Length: " + length + ", Width: " + width +
        ", Height: " + height + ", Gallons of paint needed: " + paintNeeded);
    }
}

// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student’s info. 
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data 
    String name;
    double test1;
    double test2;
    Scanner scan = new Scanner(System.in);

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
	//add body of constructor
	name = studentName;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
	//add body of inputGrades
	System.out.print("Enter test 1 score: ");
	test1 = scan.nextDouble();
	System.out.println("");
	System.out.print("Enter test 2 score: ");
	test2 = scan.nextDouble();
	System.out.println("");
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    //add header for getAverage
    public double getAverage()
    {
	//add body of getAverage
	return((test1+test2)/2);
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    //add header for printName
    public void printName()
    {
	//add body of printName
	System.out.println(name);
    }
    
    public String toString(){
         return("Name: "+name+" Test1: "+test1+" Test2: "+test2);
    }

}
// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;

public class Rock
{
    public static void main(String[] args)
    {
	String personPlay;    //User's play -- "R", "P", or "S"
	String computerPlay = "U";  //Computer's play -- "R", "P", or "S"
	int computerInt;      //Randomly generated number for computer play

        Scanner scan = new Scanner(System.in);

	System.out.print("Enter your play, must be an r, p, or s: ");//Get player's play -- note that this is stored as a string

	personPlay = scan.nextLine();//Make player's play uppercase for ease of comparison

	personPlay = personPlay.toUpperCase();
	
	computerInt = (int)((Math.random())*3);//Generate computer's play (0,1,2). Use the Math.random() method

	//Translate computer's randomly generated play to string
	if (computerInt == 0)
	    computerPlay = "R";
	else if (computerInt == 1)
	    computerPlay = "P";
	else
	    computerPlay = "S";
		//...  Fill in rest of code

	System.out.println("Computer's play: "+ computerPlay);//Print computer's play

	//See who won.  Use nested ifs instead of &&.
	if (personPlay.equals(computerPlay))  
	    System.out.println("It's a tie!");
	else if (personPlay.equals("R")) 	   
            if (computerPlay.equals("S"))
    	        System.out.println("Rock crushes scissors.  You win!!");
            else if (computerPlay.equals("P"))
    	        System.out.println("Paper covers Rock.  Computer wins!!");
    	else if (personPlay.equals("P")) 	   
            if (computerPlay.equals("S"))
    	        System.out.println("Scissors cuts Paper.  Computer wins!!");
            else if (computerPlay.equals("R"))
    	        System.out.println("Paper covers Rock.  You win!!");
	else if (personPlay.equals("S")) 	   
            if (computerPlay.equals("P"))
    	        System.out.println("Scissors cuts Paper.  You win!!");
            else if (computerPlay.equals("R"))
    	        System.out.println("Rock crushes Scissors.  Computer wins!!");
		//...  Fill in rest of code
    } //End Main
    
} //End Class
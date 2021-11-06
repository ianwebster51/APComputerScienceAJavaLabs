
/**
 * Cookie vs. Creme.
 *
 * Ian T. Webster
 * 10/21/2020
 */
import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
      int numToGuess;       //Number the user tries to guess
      int guess;            //The user's guess

	Scanner scan = new Scanner(System.in);
	Random generator = new Random();

	//randomly generate the  number to guess
        numToGuess = (generator.nextInt(9))+1;
	//print message asking user to enter a guess
        System.out.println("I'm thinking of a number between 1(inclusive) and 10(inclusive)!\nEnter your guess: ");
	//read in guess
        guess = scan.nextInt();
	while (guess != numToGuess)  //keep going as long as the guess is wrong
        {
	    //print message saying guess is wrong
	    System.out.println("That's wrong, try again!");
	    //get another guess from the user
	    guess = scan.nextInt();
	}

	//print message saying guess is right
	System.out.println("Congratulations! You got it right: You Win!");
    }
}
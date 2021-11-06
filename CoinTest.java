
// ********************************************************************
// CoinTest.java
//
// Finds the length of the longest run of heads in 100 flips of a coin.
// ********************************************************************

public class CoinTest
{
    public static void main (String[] args)
    {
	final int FLIPS = 100; // number of coin flips

	int currentRun = 0; // length of the current run of HEADS
	int maxRun = 0;     // length of the maximum run so far

	// Create a coin object
	Coin coin = new Coin();

	// Flip the coin FLIPS times
	for (int i = 0; i < FLIPS; i++)
	    {
		// Flip the coin & print the result
		coin.flip();
		System.out.println(coin.toString());

		// Update the run information
		if (coin.isHeads() == true){
		     currentRun++;}
		else{
		     if (currentRun>maxRun){
		         maxRun = currentRun;
		     }
		     currentRun = 0;
		}		

	    }

	// Print the results
	System.out.println("The maximum run of HEADS was " + maxRun + ".");

    }
}
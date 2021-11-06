
/**
 * You've gotta have a lot of balls to play golf like I do.
 *
 * Ian T. Webster
 * 10/20/2020
 */
import java.util.Scanner;
public class LoveCS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
	
	System.out.println("How many times would you like the message to be printed?");
	
	int limit = scan.nextInt(), sum = 0, ilv = 1;
	if (limit == 0)
	   ilv = 0;

	int count = 1;

	while (count <= limit){
	    System.out.println(count + " I love Computer Science!!");
	    sum += count;
	    count++;
	}
	System.out.println("Printed this message " + limit + " times."+
	"The sum of the numbers from " + ilv + " to " + limit + " is " + sum + ".");
    }
}

// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;
public class Sales
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter number of salespeople: ");
final int SALESPEOPLE = scan.nextInt();
int[] sales = new int[SALESPEOPLE];
int sum;
for (int i=0; i < sales.length; i++)
{
System.out.print("Enter sales for salesperson " + i + ": ");
sales[i] = scan.nextInt();
}
System.out.println("\nSalesperson Sales");
System.out.println("--------------------");
sum = 0;
for (int i=0; i < sales.length; i++)
{
System.out.println("\t " + i + "\t\t\t" + sales[i]);
sum += sales[i];
}
System.out.println("\nTotal sales: " + sum);
System.out.println("\nAverage sales: " + (double)sum/sales.length);
int maxIndex = sales[0];
int minIndex=sales[0];
for(int monkey = 0; monkey<sales.length; monkey++){
    if (sales[monkey]>maxIndex)
         maxIndex = monkey;}
for(int monkey = 0; monkey<sales.length; monkey++){
    if (sales[monkey]<maxIndex)
         minIndex = monkey;}
System.out.println("Salesperson "+maxIndex+" had the highest sale with $"+sales[maxIndex]+".");
System.out.println("Salesperson "+minIndex+" had the lowest sale with $"+sales[minIndex]+".");
}
}


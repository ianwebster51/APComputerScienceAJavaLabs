// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest
{
public static void main(String[] args)
{
Dog york = new Yorkshire("Yorky");
System.out.println(york.getName() + " says " + york.speak());
Dog lab = new Labrador("Labo", "Black");
System.out.println(lab.getName() + " says " + lab.speak());
}
}
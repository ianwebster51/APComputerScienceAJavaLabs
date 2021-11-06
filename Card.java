
// **********************************************************************
// Card.java
//
// Represents a Card with a face and a suit.
// **********************************************************************
public class Card
{
private String face;
private String suit;
private int value;
public Card (String cardFace, String cardSuit)
{
face = cardFace;
suit = cardSuit;
}
public int getValue(){
return value;}
public void setValue(int bob){
value = bob;}
public String toString()
{
return face + " of " + suit;
}
}
// **********************************************************************
// DeckOfCards.java
//
// Contains a deck of Card objects. Methods to shuffle and deal Cards.
// **********************************************************************
public class DeckOfCards {
private Card deck[];
private int currentCard;
private final int NUMBER_OF_CARDS = 52;
private String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

private String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
//
// Constructor fills a deck array with Card objects.
//
public DeckOfCards()
{
deck = new Card[ NUMBER_OF_CARDS ];
currentCard = 0; // set currentCard so first Card dealt is deck[0]
// populate deck with Card objects
for (int count = 0; count < deck.length; count ++){
deck [ count ] = new Card(faces[count % 13], suits [count / 13]);
if(faces[count%13].equals("Ace"))deck[count].setValue(11);
else if(faces[count%13].equals("Deuce"))deck[count].setValue(2);
else if(faces[count%13].equals("Three"))deck[count].setValue(3);
else if(faces[count%13].equals("Four"))deck[count].setValue(4);
else if(faces[count%13].equals("Five"))deck[count].setValue(5);
else if(faces[count%13].equals("Six"))deck[count].setValue(6);
else if(faces[count%13].equals("Seven"))deck[count].setValue(7);
else if(faces[count%13].equals("Eight"))deck[count].setValue(8);
else if(faces[count%13].equals("Nine"))deck[count].setValue(9);
else if(faces[count%13].equals("Ten"))deck[count].setValue(10);
else if(faces[count%13].equals("Jack"))deck[count].setValue(10);
else if(faces[count%13].equals("Queen"))deck[count].setValue(10);
else if(faces[count%13].equals("King"))deck[count].setValue(10);}

} // end DeckOfCards constructor
//
// Shuffle deck of Cards by randomly switching all cards in deck.
//
public void shuffle()
{
    for (int first = 0; first < deck.length; first++)
    {
        // select a random number between 0 and 51
        int second = (int)(Math.random() * 52);
        // swap current Card with randomly selected Card
        Card temp = deck[ first ];
        deck[ first ] = deck[ second ];
        deck[ second ] = temp;
    }
} // end method shuffle
//
// Deals one Card.
//
public Card dealCard()
{
// determine whether Cards remain to be dealt
     if (currentCard < deck.length)
         return deck [ currentCard++ ];
     else
         return null; // return null to indicate no more cards
}
}
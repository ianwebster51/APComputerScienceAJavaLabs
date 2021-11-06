
/**
 * Blackjack game.
 *
 * @author Ian T. Webster
 * @version 3/10/2021
 */
import java.util.*;
public class Blackjack
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DeckOfCards deck = new DeckOfCards();
        ArrayList<Card> dealerHand = new ArrayList<Card>();
        ArrayList<Card> playerHand = new ArrayList<Card>();
        deck.shuffle();
        int status=1;
        dealerHand.add(deck.dealCard());
        dealerHand.add(deck.dealCard());
        playerHand.add(deck.dealCard());
        playerHand.add(deck.dealCard());
        System.out.println("One of the dealer's cards is "+dealerHand.get(0)+".");
        if(dealerHand.get(0).getValue()==11 && dealerHand.get(1).getValue()==11){dealerHand.get(1).setValue(1);}
        else if(playerHand.get(0).getValue()==11 && playerHand.get(1).getValue()==11){playerHand.get(1).setValue(1);}
        else if(dealerHand.get(0).getValue()+dealerHand.get(1).getValue()==21){
            if(playerHand.get(0).getValue()+playerHand.get(1).getValue()==21){
                System.out.println("Your cards are "+playerHand+".");
                System.out.println("The dealer's cards are "+dealerHand+".");
                System.out.println("The Game is over, tie goes to the runner, the player wins.");}
            else{
                System.out.println("Your cards are "+playerHand+".");
                System.out.println("The dealer's cards are "+dealerHand+".");
                System.out.println("The Game is over, the dealer wins.");}}
        else{        
        while(true){
            System.out.println("Your cards are "+playerHand+".");
            if (getTotal(playerHand)==21){
                System.out.println("The dealer's cards are "+playerHand+".");
                if(getTotal(dealerHand)!=21){
                    System.out.println("The Game is over, the player wins.");
                    break;}
                else{
                    System.out.println("The Game is over, tie goes to the runner, the player wins.");
                    break;}}
            else if(getTotal(playerHand)>21){
                while(getTotal(playerHand)>21 && isAce(playerHand) ==true){
                    if(isAce(playerHand) == true){
                        playerHand.get(aceIndex(playerHand)).setValue(1);}}
                                        
                if(getTotal(playerHand)>21){
                    if(getTotal(dealerHand)>21){
                        while(getTotal(dealerHand)>21 && isAce(dealerHand) ==true){
                            if(isAce(dealerHand) == true){
                                dealerHand.get(aceIndex(dealerHand)).setValue(1);}}}
                    if(getTotal(dealerHand)>21){
                        System.out.println("The dealer's cards are "+dealerHand+".");
                        System.out.println("The Game is over, tie goes to the runner, the player wins.");
                        break;}
                    else if (getTotal(dealerHand)<21){
                        System.out.println("The dealer's cards are "+dealerHand+".");
                        System.out.println("The Game is over, the dealer wins.");
                        break;}}   
                else if(getTotal(playerHand)<21){
                    if(getTotal(dealerHand)>21){
                        while(getTotal(dealerHand)>21 && isAce(dealerHand) ==true){
                            if(isAce(dealerHand) == true){
                                dealerHand.get(aceIndex(dealerHand)).setValue(1);}}}
                    if(getTotal(dealerHand)>21){
                        System.out.println("The dealer's cards are "+playerHand+".");
                        System.out.println("The Game is over, the player wins.");
                        break;}}                        
            }    
            else if(getTotal(playerHand)<21){
                if(getTotal(dealerHand)>21){
                        while(getTotal(dealerHand)>21 && isAce(dealerHand) ==true){
                            if(isAce(dealerHand) == true){
                                dealerHand.get(aceIndex(dealerHand)).setValue(1);}}}
                    else if(getTotal(dealerHand)>21){
                        System.out.println("The dealer's cards are "+dealerHand+".");
                        System.out.println("The Game is over, the player wins.");
                        break;}}            
            
            
            if (!(getTotal(dealerHand)>=17))dealerHand.add(deck.dealCard());                                            
            else{
               if (status == 2){
                    if(getTotal(playerHand)<21){
                        if(getTotal(dealerHand)>21){
                            while(getTotal(dealerHand)>21 && isAce(dealerHand) ==true){
                                if(isAce(dealerHand) == true){
                                    dealerHand.get(aceIndex(dealerHand)).setValue(1);}}}
                        if(getTotal(dealerHand)>21){
                            System.out.println("The dealer's cards are "+dealerHand+".");
                            System.out.println("The Game is over, the player wins.");
                            break;}
                        else if (getTotal(dealerHand)<21){
                            if(getTotal(dealerHand)>getTotal(playerHand)){
                                System.out.println("The dealer's cards are "+dealerHand+".");
                                System.out.println("The Game is over, the dealer wins.");
                                break;}
                            else if(getTotal(dealerHand)<getTotal(playerHand)){
                                System.out.println("The dealer's cards "+dealerHand+".");
                                System.out.println("The Game is over, the player wins.");
                                break;}
                            else{
                                System.out.println("The dealer's cards "+dealerHand+".");
                                System.out.println("The Game is over, tie goes to the runner, the player wins.");
                                break;}}}   
                    } 
            }
            if(status==1){
                System.out.println("Would you like to hit or stay?(enter 1 for hit, enter 2 for stay)");
                status = scan.nextInt();}
            if (status == 1)playerHand.add(deck.dealCard());
        }
    }
        
    }
    public static int getTotal(ArrayList<Card> bob){
        int total = 0;
        for (Card card:bob)total+= card.getValue();       
        return total;
    }
    public static boolean isAce(ArrayList<Card> bob){
        for (Card card:bob)
            if(card.getValue()==11)return true;
        return false;    
    }
    public static int aceIndex(ArrayList<Card> bob){
        for (int card = 0; card<bob.size();card++)
            if(bob.get(card).getValue()==11)return card;
        return 0;    
    }
    
}

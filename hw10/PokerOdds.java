////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//hw10
//Poker Odds Java Program
//description of program
    /*
    */

//import Random and Scanner Class to program    
import java.util.Random;
import java.util.Scanner;


//add class
public class PokerOdds{
    
    
    
    
    //add main method
    public static void main(String [] arg){
        showHands();
        simulateOdds();
    }
    
    public static void showHands() {
        
        Random myRandom = new Random();
        Scanner myScanner = new Scanner(System.in);
        String checker = "";
        do{
            final int NUMBER_OF_CARDS = 52,
                HAND_SIZE = 5;
            int [] deck = new int [NUMBER_OF_CARDS],
                resetDeck = new int [NUMBER_OF_CARDS],
                //temp = new int [1],
                hand = new int [HAND_SIZE];
            int temp = 0;
            
            //assign suit for each card in hand
            int [] clubs = new int [HAND_SIZE],
                diamonds = new int [HAND_SIZE],
                hearts = new int [HAND_SIZE],
                spades = new int [HAND_SIZE];
            
            String cardRank[] = new String [13];
            String finalizedHand[] = new String [HAND_SIZE];
      
            
    
                
            for(int handCard = 0; handCard < HAND_SIZE; handCard++) {
                clubs[handCard] = -1;
                diamonds[handCard] = -1;
                hearts[handCard] = -1;
                spades[handCard] = -1;
            }
            
            //assigning values to deck array
            for (int cardNumber = 0; cardNumber < deck.length; cardNumber++) {
                deck [cardNumber] = cardNumber;
                resetDeck[cardNumber] = cardNumber;
                
            }
           //generated hand
            for (int handCard = 0; handCard < hand.length; handCard++) {
                hand [handCard] = -1;
            }
        
            int randomCard = 0,
                numberOfCards = 52;
            
            for(int handCard = 0; handCard < hand.length; handCard++) {

                randomCard = myRandom.nextInt(numberOfCards);
                hand [handCard] = deck[randomCard];
                deck[randomCard] = -1;
                int lastCardInDeckArray = numberOfCards - 1 - handCard;
                temp = deck[lastCardInDeckArray];
                deck[lastCardInDeckArray] = -1;
                deck[randomCard] = temp;
                numberOfCards--;
                int [] newDeck = new int [numberOfCards];
                for (int cardNumber = 0; cardNumber < newDeck.length; cardNumber++) {
                    //if (deck[cardNumber] == -1) {
                    //}
                    //else {
                        newDeck [cardNumber] = deck[cardNumber];
                        //deck[cardNumber] = newDeck[cardNumber];
                    //}
                }
                deck = newDeck;
            }
            deck = resetDeck;
    
            
            for(int handCard = 0; handCard < hand.length; handCard++) {    
                int suitDetermination = hand [handCard]%4;
                switch (suitDetermination) {
                    case 0: clubs [handCard] = hand[handCard];
                        break;
                    case 1: diamonds [handCard] = hand [handCard];
                        break;
                    case 2: hearts [handCard] = hand [handCard];
                        break;
                    case 3: spades [handCard] = hand [handCard];
                        break;
                }
                
            }
            
            System.out.print("Clubs: " );
            for(int handCard = 0; handCard < hand.length; handCard++) {    
                if (clubs[handCard] == -1) {
                    System.out.print("");
                }
                else {
                    int rankDetermination = clubs[handCard]%13;
                    switch (rankDetermination) {
                        case 0: finalizedHand[handCard] = "A";
                            break;
                        case 1: finalizedHand[handCard] = "K";
                            break;
                        case 11: finalizedHand[handCard] = "Q";
                            break;
                        case 12: finalizedHand[handCard] = "J";
                            break;
                        default: finalizedHand[handCard] = "" + rankDetermination;
                            break;
                    }
                    System.out.print(finalizedHand[handCard] + ' ');
                }
            }
            
            System.out.println();
            
            System.out.print("Diamonds: " );
            for(int handCard = 0; handCard < hand.length; handCard++) {    
                if (diamonds[handCard] == -1) {
                    System.out.print("");
                }
                else {
                    int rankDetermination = diamonds[handCard]%13;
                    switch (rankDetermination) {
                        case 0: finalizedHand[handCard] = "A";
                            break;
                        case 1: finalizedHand[handCard] = "K";
                            break;
                        case 11: finalizedHand[handCard] = "Q";
                            break;
                        case 12: finalizedHand[handCard] = "J";
                            break;
                        default: finalizedHand[handCard] = "" + rankDetermination;
                            break;
                    }
                    System.out.print(finalizedHand[handCard] + ' ');
                }       
            }
            
            System.out.println();
            
            System.out.print("Hearts: " );
            for(int handCard = 0; handCard < hand.length; handCard++) {    
                if (hearts[handCard] == -1) {
                    System.out.print("");
                }
                else {
                    int rankDetermination = hearts[handCard]%13;
                    switch (rankDetermination) {
                        case 0: finalizedHand[handCard] = "A";
                            break;
                        case 1: finalizedHand[handCard] = "K";
                            break;
                        case 11: finalizedHand[handCard] = "Q";
                            break;
                        case 12: finalizedHand[handCard] = "J";
                            break;
                        default: finalizedHand[handCard] = "" + rankDetermination;
                            break;
                    }
                    System.out.print(finalizedHand[handCard] + ' ');
                }
            }
            
            System.out.println();
            
            System.out.print("Spades: " );
            for(int handCard = 0; handCard < hand.length; handCard++) {    
                if (spades[handCard] == -1) {
                    System.out.print("");
                }
                else {
                    int rankDetermination = spades[handCard]%13;
                    switch (rankDetermination) {
                        
                            case 0: finalizedHand[handCard] = "A";
                                break;
                            case 1: finalizedHand[handCard] = "K";
                                break;
                            case 11: finalizedHand[handCard] = "Q";
                                break;
                            case 12: finalizedHand[handCard] = "J";
                                break;
                            default: finalizedHand[handCard] = "" + rankDetermination;
                                break;
                    }
                    System.out.print(finalizedHand[handCard] + ' ');
                }
            }
            
            
            
            
            
            
            System.out.println();
            System.out.print("Run program again?  Enter \"Y\" or \"y\" to rerun; anything else to quit: ");
            checker = myScanner.next();
        } while (checker.equals("Y") || checker.equals("y"));
    }
    
    public static void simulateOdds() {
            
            String [] rank = new String[13];
            int [] frequency = new int [13];
            
            for(int counter = 0; counter < 13; counter++) {
                switch (counter) {
                    case 0: rank[counter] = "A";
                        break;
                    case 1: rank[counter] = "K";
                        break;
                    case 11: rank[counter] = "Q";
                        break;
                    case 12: rank[counter] = "J";
                        break;
                    default: rank[counter] = "" + counter;;
                        break;
                }
                frequency[counter] = 0;
            }
            
            Random myRandom = new Random();
            //Scanner myScanner = new Scanner(System.in);
            String checker = "";
            
                final int NUMBER_OF_CARDS = 52,
                    HAND_SIZE = 5,
                    NUMBER_OF_SIMULATIONS = 10000;
                int [] deck = new int [NUMBER_OF_CARDS],
                    resetDeck = new int [NUMBER_OF_CARDS],
                    hand = new int [HAND_SIZE];
                int temp = 0;
                int notOnePair = 0;
                
                String cardRank[] = new String [13];
                String finalizedHand[] = new String [HAND_SIZE];
                for (int counter = 0; counter < resetDeck.length; counter++){
                    resetDeck[counter] = counter;
                }
        for (int numberOfHands = 0; numberOfHands < NUMBER_OF_SIMULATIONS; numberOfHands++) {
            temp = 0;

            //assigning values to deck array
            for (int cardNumber = 0; cardNumber < deck.length; cardNumber++) {
                deck [cardNumber] = cardNumber;
            }
           //generated hand
            for (int handCard = 0; handCard < hand.length; handCard++) {
                hand [handCard] = -1;
            }
        
            int randomCard = 0,
                numberOfCards = 52;//myRandom.nextInt(52);
            
            for(int handCard = 0; handCard < hand.length; handCard++) {
                randomCard = myRandom.nextInt(numberOfCards);
                hand [handCard] = deck[randomCard];
                deck[randomCard] = -1;
                int lastCardInDeckArray = numberOfCards - 1 - handCard;
                temp = deck[lastCardInDeckArray];
                deck[lastCardInDeckArray] = -1;
                deck[randomCard] = temp;
                numberOfCards--;
                int [] newDeck = new int [numberOfCards];
                for (int cardNumber = 0; cardNumber < newDeck.length; cardNumber++) {
                        newDeck [cardNumber] = deck[cardNumber];
                }
                deck = newDeck;
            }
            deck = resetDeck;
       
            if (exactlyOneDup(hand)) {
                int pairedCardValue = -10;
                for(int handCard = 0; handCard < hand.length; handCard++) {
                    int plusOne = handCard + 1;
                    for (; plusOne < hand.length; plusOne++) {
                        if (hand[handCard] == hand[plusOne]) {
                            pairedCardValue = hand[handCard];
                        }
                        plusOne = handCard + 1;
                    }
                }
                System.out.println(pairedCardValue);
                for(int handCard = 0; handCard < hand.length; handCard++) {
                    int pairCard = pairedCardValue%13;
                    
                    switch (pairCard) {
                        case 0: frequency[pairCard]++;
                            break;
                        case 1: frequency[pairCard]++;
                            break;
                        case 11: frequency[pairCard]++;
                            break;
                        case 12: frequency[pairCard]++;
                            break;
                        default: frequency[pairCard]++;
                            break;
                    }
                }
                
            }
            else {
                notOnePair++;
            }
            
        }
        
        System.out.println("rank \t"+"frequency of exactly one pair");
        //System.out.println(" "+rank[0]+"\t"+"\t"+frequency[0]);
        //System.out.println(" "+rank[)
        for (int counter = 0; counter < rank.length; counter++) {
            int tempCounter = 0;
            while (tempCounter < 13) {
                switch (tempCounter) {
                    case 0: System.out.println(" " + rank[tempCounter] +"\t\t" + frequency[tempCounter]);
                        break;
                    case 1: System.out.println(" " + rank[tempCounter] +"\t\t" + frequency[tempCounter]);
                        break;
                    case 11: System.out.println(" " + rank[tempCounter] +"\t\t" + frequency[tempCounter]);
                        break;
                    case 12: System.out.println(" " + rank[tempCounter] +"\t\t" + frequency[tempCounter]);
                        break;
                }
                tempCounter++;
            }
            if (counter >=2 && counter <=10) {
            System.out.println(" " + rank[counter] +"\t\t" + frequency[counter]);
            }
            
        }
        for (int counter = 0; counter < 13; counter++) {
            System.out.print('-');
        }
        System.out.println();
        System.out.println("frequency of hand not having exactly one pair: " + notOnePair++);
        
    }
            
            
    public static boolean exactlyOneDup (int [] num) {
        //set the test value for duplicates to 0
        int positiveTestValue = 0;
        //for loop for initializing each search for a given index number
        for (int index = 0; index < num.length; index++) {
            //comparison number that is set to the next number to prevent redundant comparisons
            int comparisonArrayNumber = index + 1;
            //for loop for scanning through the rest of the members of the array that come after the given index number/member
            for (; comparisonArrayNumber < num.length; comparisonArrayNumber++) {
                //when the two numbers are equal, i.e., are duplicates...
                if (num[index] == num[comparisonArrayNumber]) {
                    //...the test value is incremented by one.
                    positiveTestValue++;
                }
            }
            /*needed to reset comparison array number to index+1 for next loop 
                because increment of comparisonArrayNumber in the nested loop is 
                stored into the outer loop!*/            
                comparisonArrayNumber = index + 1;  
        }
        //if exactly one duplicate of any number in the array is present (i.e., positiveTestValue should be only equal to 1!)...
        if (positiveTestValue == 1){
            //...true is sent out from this method
            return true;
        }
        //if not exactly one duplicate of any number in the array is present...
        else {
            //...false is sent out from this method
            return false;
        }
        
    }               
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//hw11
//Poker Hands Java Program
//description of program
    /*This program asks the user to enter a suit and a rank for a card five times
    and generates a hand based on those cards and tell the user what kind of hand
    (e.g. pair, high card, royal flush, full house, etc.) he entered.
    */
    
//import scanner
import java.util.Scanner;
import java.util.Arrays;

//add class
public class PokerHands {
    
    
    //display ragged array method
    public static void display (int[][] array) {
        //string for which array display will be stored
        String output = "{ \n";
        //for loop to choose main array member for display
        for (int i = 0; i < array.length; i++) {
            //add "{ " to output string
            output += "{ ";
            //for loop for adding subarray members to string
            for (int j = 0; j < array[i].length; j++) {
                //add subarray member to string
                output += array[i][j];    
                //puts ", " in appropriate places
                if (j < array[i].length - 1) {
                    output += ", ";
                }
            }
            //closes off the end of subarray with " }" and returns to next line
            output += " }\n";
        }
        //closes the multidimensional array with "}"
        output+= "}";
        //displays the array
        System.out.println(output);
    }

    public static String entry (Scanner myScanner, String key, String prompt) {
        
        myScanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.print(prompt);
            input = myScanner.next();
            boolean test = key.indexOf(input) >= 0;
            if (!test || input.length() != 1) {
                System.out.println("You did not enter a valid response.");
            }
        } while (!(key.indexOf(input) >= 0) || input.length() != 1);
        
        return input;
    }
    
    public static int[] selectionSort (int[] A) {
        //for loop sequentially setting each array value as a reference value & for determining the farthest left
        //value in the array that hasn't been already checked/swapped/modified.
        for(int i = 0; i < A.length - 1; i++){ 
            //stores the index of the min value as integer
            int minValIndex = i;
            //for loop sequentially comparing the next value after the reference value to the reference value
            for (int k  = i + 1; k < A.length; k++) {
                //if statement that's entered, when the compared value is less than the reference value
                if (A[k] < A[minValIndex]) {
                    //change the min value index to that from the new smaller value
                    minValIndex = k;
                }
            }
            //statement that prevents the swap if the current reference value is the lowest value in the array
            //starting from array index at j
            if (i != minValIndex) {
                //store value at index j in another int
                int temp = A[i];
                //set value at index j equal to the min value
                A[i] = A[minValIndex];
                //finish the swap -- replace value where min value is with the previous value at index j
                A[minValIndex] = temp;
            }
        }
        //return the sorted matrix to another method
        return A;
    }    

        
    public static int cardRankLinearSearch (Scanner myScanner, String [] A, String prompt) {
        myScanner = new Scanner(System.in);
        int index = -1;
            //test = 0;
        do {
            System.out.print(prompt);
            String key = myScanner.next();
            for (int i = 0; i < A.length; i++) {
                if(key.equals(A[i])) {
                    index = i;
                    //test++;
                }
                
            }
            if (index == -1) {
                System.out.println("You did not enter valid input.");
            }
        } while (index == -1);
        return index;
    }
    
    
    public static void showOneHand(int hand[]){
        
        String suit[] = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
        String face[] = {"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
            "4 ","3 ","2 "};
        String out = "";
        for(int s = 0; s < 4; s++){ 
        out += suit[s];
            for(int rank = 0; rank < 13; rank++) {
                for(int card = 0; card < 5; card++) {
                    if(hand[card] / 13 == s && hand[card]%13 == rank) {
                        out += face[rank];
                    }
                }
            }
            out+='\n';
        }
        System.out.println(out);
    }
    
    //hasDups detects whether or not duplicate numbers are present
    public static boolean hasDups (int num []) {
        //set the test value for duplicates to 0
        int positiveTestValue = 0;
        //for loop for initializing each search for a given index number
        for (int index = 0; index < num.length; index++) {
            //comparison number that is set to the next number to prevent redundant comparisons
            int comparisonArrayNumber = index + 1;
            //System.out.println(index + '+' + comparisonArrayNumber);
            //for loop for scanning through the rest of the members of the array that come after the given index number/member
            for (; comparisonArrayNumber < num.length; comparisonArrayNumber++) {
                //when the two numbers are equal, i.e., are duplicates...
                if (num[index] == num[comparisonArrayNumber]) {
                    //...the test value is incremented by one.
                    positiveTestValue--;
                }
            }
            /*needed to reset comparison array number to index+1 for next loop 
                because increment of comparisonArrayNumber in the nested loop is 
                stored into the outer loop!*/
            comparisonArrayNumber = index + 1;  
        }
        //if duplicates were present...
        if (positiveTestValue < 0){
            //...true is sent out from this method
            return true;
        }
        //if no duplicates were present...
        else {
            //...false is sent out from this method
            return false;
        }
    }
    
    

    //add main method
    public static void main (String [] args) {
        //add scanner to main method
        Scanner myScanner = new Scanner(System.in);
        //final variables for array sizes
        final int SUIT = 4,
            RANK = 13,
            NUMBER_OF_CARDS_IN_HAND = 5;
        //initialize deck and rankfrequency array
        int [][]wholeDeck = new int[SUIT][RANK],
            //initialize hand array
            rankFrequency = new int [13][1];
        //initialized convertedSingleArrayDeck, convertedHand, and tempHand
        int [] convertedSingleArrayDeck = new int [51],
            convertedHand = new int [NUMBER_OF_CARDS_IN_HAND],
            tempHand = new int [5];
        //assign numbers to wholeDeck array
        for (int i = 0; i < wholeDeck.length; i++) {
            //fills array wholeDeck[i] with numbers 0 to 12
            for (int j = 0; j < wholeDeck[i].length; j++) {
                wholeDeck[i][j] = j;   
            }
        }
        //create converted deck with 0 to 51, inclusive, for showHands method
        for (int i = 0; i < convertedSingleArrayDeck.length; i++) {
            convertedSingleArrayDeck[i] = i;
        }
        //create converted hand with -1, -2, ..., -4, inclusive
        for (int i = 0; i < convertedHand.length; i++) {
            convertedHand[i] = -(i + 1);
        }
        //allocate rankFrequency counter array with all zeros
        for(int i = 0; i < rankFrequency.length; i++) {
            for(int j = 0; j < rankFrequency[i].length; j++) {
                rankFrequency[i][j] = 0;
            }
        }
        //intialized various strings arrays the following contents
        String [] face = {"A","K","Q","J","10","9","8","7","6","5",
            "4","3","2"},
            winningHands = {"Royal Flush", "Straight Flush","Four of a Kind", "Full House", "Flush", "Straight", "Three of a Kind",
            "Two Pair", "Pair", "High Card"};
        //declare string for use with entry method
        String suit = "cdhs";
        
        System.out.println("Enter 'y' or 'Y'  to enter a(nother) hand: ");
        String yOrY = myScanner.next();
        while (yOrY.equals("Y") || yOrY.equals("y")) {
            
            for (int i = 0; i < 5; i++) {
                //for (int j = 0; j < 2; j++) {
                    String suitEntry = entry(myScanner, "cdhs", "Enter the suit 'c', 'd', 'h', 's': ");
                    int suitIndex = suit.indexOf(suitEntry);
                    int rankEntry = cardRankLinearSearch(myScanner, face, "Enter one of A, K, Q, J, 10, ..., 3, 2: ");
                   
                    
                    convertedHand [i] = (suitIndex * 13) + rankEntry;
                    //if statement for finding dups
                    if (hasDups(convertedHand)) {
                        System.out.println("You already entered that card.");
                        i--;    //redoes the entry for the loop
                    }
                    //else statement then accounts for times rank of card is entered
                    else {
                        rankFrequency[rankEntry][0]++;
                    }
                //}
                
            }
            showOneHand(convertedHand);
            //sort converted hand
            convertedHand = selectionSort(convertedHand);
            //fill tempHand with values of convertedHand%13
            for (int i = 0; i < tempHand.length; i++) {
                tempHand[i] = convertedHand[i]%13;
            }
            //sort tempHand
            tempHand = selectionSort(tempHand);
            

            //declare booleans for types of hands
            boolean threeKind = false,
                fourKind = false;
            //variable for counting pairs in hand
            int pairCounter = 0;
            
            //System.out.println();
            
            //for loop series for scanning through rankfrequency array to find pairs, three of a kinds, and four of a kinds
            for (int i = 0; i < rankFrequency.length; i++) {
                for (int j = 0; j < rankFrequency[i].length; j++) {
                    switch (rankFrequency[i][j]) {
                        case 2: //pair = true;
                            pairCounter++;
                            break;
                        case 3: threeKind = true;
                            break;
                        case 4: fourKind = true;
                            break;
                    }
                }
            }
            //booleans for detecting one pair or two pairs, or full houses
            boolean twoPair = pairCounter == 2,
                pair = pairCounter == 1,
                fullHouse = threeKind && pairCounter == 1;
            //ints for putting each hand array member into a single variable
            int one = convertedHand[0],
                two = convertedHand[1],
                three = convertedHand[2],
                four = convertedHand[3],
                five = convertedHand[4],
            //int that are reduced to 1 to 13
                one_ = tempHand[0],
                two_ = tempHand[1],
                three_ = tempHand[2],
                four_ = tempHand[3],
                five_ = tempHand[4];
            //boolean statements to detect royal flush, straight flush, and flush    
            boolean royalFlush = ((one%13) == 0) && ((two%13) == 1) && ((three%13) == 2) && ((four%13) == 3) && ((five%13) == 4),
                straightFlush = (one + 4) == (two + 3) && (two + 3) == (three + 2) && (three + 2) == (four + 1) && (four + 1) == five,
                straight = (one_ + 4) == (two_ + 3) && (two_ + 3) == (three_ + 2) && (three_ + 2) == (four_ + 1) && (four_ + 1) == (five_),
                flush =  (int)(one / 13) == (int)(two / 13) && (int)(two / 13) == (int)(three / 13) && (int)(three / 13) == (int)(four / 13) && (int)(four / 13) == (int)(five /13);
            
            //if and else if statements for displays the type hands present
            if (royalFlush) {
                System.out.println ("This is a " + winningHands[0] + ".");
            }
            else if (straightFlush) {
                System.out.println ("This is a " + winningHands[1] + ".");
            }
            else if (fourKind) {
                System.out.println ("This is a " + winningHands[2] + ".");
            }
            else if (fullHouse) {
                System.out.println ("This is a " + winningHands[3] + ".");
            }
            else if (flush) {
                System.out.println ("This is a " + winningHands[4] + ".");
            }
            else if (straight) {
                System.out.println ("This is a " + winningHands[5] + ".");
            }
            else if (threeKind) {
                System.out.println ("This is a " + winningHands[6] + ".");
            }
            else if (twoPair) {
                System.out.println ("This is a " + winningHands[7] + ".");
            }
            else if (pair) {
                System.out.println ("This is a " + winningHands[8] + ".");
            }
            else {
                System.out.println ("This is a " + winningHands[9] + ".");
            }
            //create converted hand with -1, -2, ..., -4, inclusive
            for (int i = 0; i < convertedHand.length; i++) {
                convertedHand[i] = -(i + 1);
            }
            //allocate rankFrequency counter array with all zeros
            for(int i = 0; i < rankFrequency.length; i++) {
                for(int j = 0; j < rankFrequency[i].length; j++) {
                    rankFrequency[i][j] = 0;
                }
            }
            System.out.print("Enter 'y' or 'Y'  to enter a(nother) hand: ");
            yOrY = myScanner.next();
        }
        
        
    }
 
    
    
    
}
    
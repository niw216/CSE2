////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//hw09
//Blocked Again Java Program
    //~description of program~
    /*This program uses modular code (in the form of methods) to ask the user to 
    enter an integer between 1 and 9, inclusive, and print out a number stack:
                1
                -
               222
               222
               ---
              33333
              33333
              33333
              -----
                .
                .
                .
    with as many blocks of numbers and dashes, from 1 up to 9 stacks.   */
    
//import scanner
import java.util.Scanner;

//add class
public class BlockedAgain{
    
////////////////////////////////////////////////////////////////////////////////
//                            Module 1 - allBlocks                            //
////////////////////////////////////////////////////////////////////////////////
    
    /*  description: The allBlocks method prints out the number of number stacks,
            according to the number the user enters.    */
    
    public static void allBlocks (int numberFromUser) {
        //This for loop, loops until the number of blocks printed is equal to the number
        //the user entered.
        for (int numberPrinted = 1; numberPrinted <= numberFromUser; numberPrinted++) {
            //the block method (Module 1a) is called and implemented here
            block(numberPrinted);
        }
    }
////////////////////////////////////////////////////////////////////////////////
//                            Module 1a - block                               //
////////////////////////////////////////////////////////////////////////////////

    /*  description: The block method is responsible for forming each number block
            for a given number.  The given number in this case is determined by the loop
            and its incrementing from the allBlocks method and by the user's inputted
            value   */

    public static void block (int numberPrinted) {
        //initialize variable for the number of rows per block as one
        int numberOfRows = 1;
        //for loop, responsible for printing the correct number of rows
        //this loop will only print out as many rows as what the current number
        //for numberprinted is.
        for (; numberOfRows <= numberPrinted; numberOfRows++) {
        
            //the line method (Module 1b) is called and implemented here.
            //this line method, to start, is responsible for printing out the 
            //number in the number stack/blcok
            line (numberPrinted , numberPrinted);
            
        }
        //this if statement is responsible for printing out the line of dashes after
        //each respective block of numbers
        if (numberOfRows > numberPrinted) {
            //An overloaded line method is called and implemented here & prints
            //out the dashes after each respective number stack
            line (numberPrinted , "-");
        }
        
    }
////////////////////////////////////////////////////////////////////////////////
//                            Module 1a - line                                //
////////////////////////////////////////////////////////////////////////////////    
        
    /*  description: The line method is responsible for printing out the numbers
            or dashes for each line. This method requires two input integers, 
            currentBlockNumber and whatsPrinted, both of which have values taken
            from the block method. */
    
    //line method for printing numbers
    public static void line (int currentBlockNumber , int whatsPrinted) {
        //initialized and declared string space
        String space = " ";
        //this for loop prints out spaces to create a 17 character row matrix
        for (int spaceCounter = 1; spaceCounter <= 17 ; spaceCounter++) {
            //prints out a space
            System.out.print(space);
            //this integer determines the position of the number printed for current
            //number of the number blocks
            int printedNumberPosition = currentBlockNumber - 1;
            //this for loop interrupts the printing of the spaces and "inserts"
            //the correct number of numbers for a given row
            for (; spaceCounter >= 9 - printedNumberPosition && spaceCounter <= 9 + printedNumberPosition;
                spaceCounter++) {
                    //prints out the given number
                    System.out.print(whatsPrinted);
            }
            //increments this variable to make sure correct number of numbers are
            //printed per line
            printedNumberPosition++;    
        }
        //returns to the start of the next line
        System.out.println();
    }
    //line method for printing dashes
    public static void line (int currentBlockNumber , String whatsPrinted) {
        //initialized and declared string space
        String space = " ";
        //this for loop prints out spaces to create a 17 character row matrix
        for (int spaceCounter = 1; spaceCounter <= 17 ; spaceCounter++) {
            //prints out a space
            System.out.print(space);
            //this integer determines the position of the number printed for current
            //number of the number blocks
            int printedNumberPosition = currentBlockNumber - 1;
            //this for loop interrupts the printing of the spaces and "inserts"
            //the correct number of dashes for a given row
            for (; spaceCounter >= 9 - printedNumberPosition && spaceCounter <= 9 + printedNumberPosition;
                spaceCounter++) {
                    //prints out the dashes or whatever string whatsPrinted represents
                    System.out.print(whatsPrinted);
            }
            //increments this variable to make sure correct number of dashes are
            //printed per line
            printedNumberPosition++;    
        }
        //returns to the start of the next line
        System.out.println();
    }
    
////////////////////////////////////////////////////////////////////////////////
//                           Module 2 - checkInt                              //
////////////////////////////////////////////////////////////////////////////////
    
    /*  description: this method allows a string to be entered and tested for
            whether or not it is an integer, returning a true or false value
            depending on the result of the test.    */

    public static boolean checkInt (String input) {
        //try attempts to change the string into an integer
        try {
            //attempt to take input and cast it into an int
            Integer.parseInt( input );
            //if successful, the value true is returned to the main method
            return true;
        }
        //if parsing is not successful, the exception will be caught
        catch ( Exception trying_To_Parse_A_NonInteger ) {
            //the value false is returned to the main method, when the string can't
            //be parsed into an integer
            return false;
        }
    }
    
    
////////////////////////////////////////////////////////////////////////////////
//                          Module 2 - checkRange                             //
////////////////////////////////////////////////////////////////////////////////    
    
    /*  description: The checkRange method tests for whether an entered integer
            is within the range of integers, dictated by the programmer.    */
    
    public static int checkRange (int integer , int lowerBound , int upperBound) {
        //add scanner to method
        Scanner myScanner = new Scanner(System.in);
        //initialize junkChecker
        String junkChecker = "";
        //test statement for whether integer is or isn't within the given bounds
        boolean intRangeValidation = (integer >= lowerBound) && (integer <= upperBound);
        //while loop that runs when entered integer is not within the dictated bounds
        while (!intRangeValidation) {
            //displays the following quotes, with the bounds "inserted" between each string, 
            //and prompts user to enter a correct value
            System.out.println("You did not enter an integer between "+lowerBound+" and "+upperBound+", inclusive.");
            System.out.print("Enter an integer between "+lowerBound+" and "+upperBound+", inclusive: ");
            //scans & stores then next inputted value
            junkChecker = myScanner.next();
            //if statement for when the next inputted value is an integer
            if (checkInt(junkChecker)) {
                //the scanned string is parsed into an integer
                integer = Integer.parseInt(junkChecker);
            }
            //while loop for when an int was not entered for junkChecker by user
            while (!checkInt(junkChecker)) {
                //displays the following quotes, with the bounds "inserted" between each string
                //and prompts user to enter a correct value
                System.out.println("You did not enter an integer.");
                System.out.print("Enter an integer between "+lowerBound+" and "+upperBound+", inclusive: ");
                //scans & stores then next inputted value
                junkChecker = myScanner.next();
                //if statement for when the next inputted value is an integer
                if (checkInt(junkChecker)) {
                     //the scanned string is parsed into an integer
                    integer = Integer.parseInt(junkChecker);
                }
            }
            //this statement reevalulates the newly entered number, to see if it
            //is in the correct bounds
            intRangeValidation = (integer >= lowerBound) && (integer <= upperBound);
        }
        //the correct integer is returned to the getInt method
        return integer;
    }
    
////////////////////////////////////////////////////////////////////////////////
//                            Module 3 - getInt                               //
////////////////////////////////////////////////////////////////////////////////    
    
    /*  description: The getInt method calls and implements the checkInt and
            checkRange methods to get an integer as per the programmers request/code    */
    
    public static int getInt () {
        //add scanner to method
        Scanner myScanner = new Scanner(System.in);
        //initialize junkChecker
        String junkChecker = "";
        //integers to intialize and/or declare values for the given variable names
        int lowerBound = 1,
            upperBound = 9,
            correctInt = 0;
        //while loop prompting the user to enter a correct integer
        while (true) {
            //displays the prompt and conditions of integer to be entered to user
            System.out.print("Enter an integer between "+lowerBound+" and "+upperBound+", inclusive: ");
            //scans and stores the user's input
            String input = myScanner.next();
            //uses checkInt method for determining if entry is an integer
            boolean intChecking = checkInt(input);
            //if statement for when input is an integer
            if (intChecking) {
                //input is parsed into an integer
                correctInt = Integer.parseInt(input);
                //breaks out of the while loop to prevent repeat
                break;
            }
            //else statement for when integer is not entered
            else {
                //prints out the following statement in quotes
                System.out.println("You did not enter an integer.");
            }
        }
        //the outputted integer is tests by the checkRange method for the given
        //bounds in the method
        int outputtedInt = checkRange (correctInt , lowerBound , upperBound);
        //sends the outputted integer to the main method
        return outputtedInt;  
    }
    //add main method
    public static void main(String [] args) {
        //initialize int m for storing user inputted integer
        int m;
        //force user to enter int in range 1–9, inclusive.
        m = getInt();
        //uses the allBlocks method to print out the number of number stacks/blocks
        //equivalent to the number m.
        allBlocks(m);
    }
    
}
/////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//hw07
//Number Stack Java Program
    //~description of program~
    /* This program prints out a pyramid of numbers starting at one up until the 
        user's inputted value, up to a value of 9.  The program prints outputs x rows of the 
        number x (x = user's inputted number from 1 to 9, inclusive), followed by 
        x number of dashes under each stack of numbers.  Each row consists of 2x - 1
        iterations of the number x or a dash.*/

//import scanner
import java.util.Scanner;

//define class
public class NumberStack {

    //define main method
    public static void main(String arg[]) {

        //add scanner to main method as myScanner
        Scanner myScanner = new Scanner(System.in);

        //intialized variable for storing the user's inputted value
        int inputtedNumber = -10,
            stackNumberCounter = 1;
        //while loop for forcing user to enter correct input
        while (!(inputtedNumber <= 9 && inputtedNumber >= 1)) {
            //string variable to use later when noninteger value is inputted
            String junkScanner = "";
            //displays prompt for user to enter integer between 1 and 9, inclusive
            System.out.print("Please enter an integer between 1 and 9, inclusive: ");
            //while loop for detecting non integer inputs
            while (!(myScanner.hasNextInt())) {
                //displays prompt for entering a non integer
                System.out.print("You did not enter an integer. Please enter an integeter between 1 and 9, inclusive: ");
                //scanner to read what next inputted value is
                junkScanner = myScanner.next();
            } //end of while loop for detecting non integer inputs
            //stores inputted value into variable
            inputtedNumber = myScanner.nextInt();
            //if statement for detecting inputted integer outside of designated range
            if (!(inputtedNumber <= 9 && inputtedNumber >= 1)) {
                System.out.println("You did not enter an integer between 1 and 9, inclusive.");
            } //end if statement integer too big or too small
        } //end correct prompt loop
        
//~~~~~~~~~~~~~~~~~~~~~~~~~~~using for loops~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        
        //variables for counting rows and for printing spaces
        int rowCounter;
        String space = " ";
    
        //displays the following statement
        System.out.println("Using for loops:");
        //for loop for each number stack
        for (stackNumberCounter = 1; stackNumberCounter <= inputtedNumber; stackNumberCounter++) {
            //for loop for printing each row    
            for (int rowsPrinted = 1; rowsPrinted <= stackNumberCounter; rowsPrinted++) {
                //for loop for getting the correct matrix width
                for (int spaceCounter = 1; spaceCounter <= 17; spaceCounter++) {
                    System.out.print(space);
                    int numberPrinted = 1;
                    //for loop for printing the numbers in the appropriate location
                    for (numberPrinted = stackNumberCounter - 1; (((9 - numberPrinted) <= spaceCounter) && (spaceCounter <= (9 + numberPrinted))); spaceCounter++) {
                        System.out.print(stackNumberCounter);
                    }   //end for loop for number printing numbers
                        numberPrinted++;
                }   //end for loop for printing correct matrix width
                System.out.println("");
            }   //end of for loop for printing each row
            
            //for loop for printing dashes
            for (int spaceCounter = 1; spaceCounter <= 17; spaceCounter++) {
                //prints out the spaces
                System.out.print(space);
                //reset numberPrinted to 1 to allow for correct dash placement
                int numberPrinted = 1;
                    //for loop for printing appropriate number of dashes for each number stack
                    for (numberPrinted = stackNumberCounter - 1; (((9 - numberPrinted) <= spaceCounter) && (spaceCounter <= (9 + numberPrinted))); spaceCounter++) {
                        System.out.print('-');
                    }   //end for loop for appropriate number of dashes
                    numberPrinted++;    //increments variable to allow for correct number of numbers printed per line
            }   //end for loop for printing dashes
            System.out.println(""); //returns to next line
        }   //end for loop for number stack
            System.out.println(""); //puts space between the two number stack series

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~using while loops~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~            
        //displays    
        System.out.println("Using while loops:");
        
        //reset variable to one from previous loop for this loop
        stackNumberCounter = 1;
        
        //while loop for number stack
        while (stackNumberCounter <= inputtedNumber) {
            //reset variable to one for correct number of rows to print
            int rowsPrinted = 1;    
            
            //whiel loop for printing correct number of rows of numbers
            while (rowsPrinted <= stackNumberCounter) {
                //reset spaceCounter to 1 to allow for correct number of spaces to be printed
                int spaceCounter = 1;
                //while loop for the correct number of spaces
                while (spaceCounter <= 17) {
                    System.out.print(space);
                    //variable for printing the correct number of numbers per row
                    int numberPrinted = stackNumberCounter - 1;
                    //while loop for printing correct number of numbers
                    while (((9 - numberPrinted) <= spaceCounter) && (spaceCounter <= (9 + numberPrinted))) {
                        System.out.print(stackNumberCounter);   //prints the number
                        spaceCounter++; //prevents loop from priting too many numbers per row
                    }
                    numberPrinted++;    //increment allow for correct number of characters per row
                    spaceCounter++;     //increases spacecounter to c
                }
                System.out.println(""); //returns end of previous line to next line
                rowsPrinted++;  //
            }
            //FOR DASHES
            int spaceCounter = 1;
            while (spaceCounter <= 17) {
                System.out.print(space);
                int numberPrinted = stackNumberCounter - 1;
                    while (((9 - numberPrinted) <= spaceCounter) && (spaceCounter <= (9 + numberPrinted))) {
                        System.out.print('-');
                        spaceCounter++;
                    }
                numberPrinted++;
                spaceCounter++;
            }
            System.out.println("");
            stackNumberCounter++;
        }   //end while loop
        
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 

        System.out.println("Using do-while loops:");
        
        stackNumberCounter = 1;
        
        do {
            int rowsPrinted = 0;
            do {
                int spaceCounter = 0; //??? maybe?????
                int numberPrinted = stackNumberCounter - 1;
                
                    //spacing do while loop
                    do {
                        System.out.print(space);
                        spaceCounter++;
                    } while (!((9 - numberPrinted) <= spaceCounter) && (spaceCounter <= (9 + numberPrinted))); 
                        //number printing do while loop
                        do {
                            System.out.print(stackNumberCounter);
                            spaceCounter++;
                            //boolean printednumbersrange = (!((9 - numberPrinted) > spaceCounter) && (spaceCounter > (9 + numberPrinted)));
                            //System.out.print(printednumbersrange);
                            
                        }  while ((((9 - numberPrinted) <= spaceCounter) && (spaceCounter <= (9 + numberPrinted))));
                    //spaceCounter++;
                    //System.out.println("");
                    numberPrinted++;
                    spaceCounter++;
                    System.out.println("");
                    //System.out.println("shit");
            rowsPrinted++;
            } while (rowsPrinted < stackNumberCounter);
        //FOR DASHES
            int spaceCounter = 0;
            int numberPrinted = stackNumberCounter - 1;
            do {
                System.out.print(space);
                spaceCounter++;
            } while (!((9 - numberPrinted) <= spaceCounter) && (spaceCounter <= (9 + numberPrinted)));
                do {
                    System.out.print('-');
                    spaceCounter++;
                } while (((9 - numberPrinted) <= spaceCounter) && (spaceCounter <= (9 + numberPrinted)));
            System.out.println("");
            numberPrinted++;
            spaceCounter++;
            stackNumberCounter++;
        } while (stackNumberCounter <= inputtedNumber);

    } //end main method



} //end of class
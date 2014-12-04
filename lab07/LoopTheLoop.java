/////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//lab07
//Loop the Loop Java Program
    //~description of program~
    /*This program prompts the user to enter a integer value between 1 and 15,
    incluseive and will print out the number of stars entered in one row,
    followed by x number of rows of one star, two stars, three starts, and etc. 
    all the way up to x numbers of stars, where x is the value entered.  The
    user will then be asked if they want to run the simulation again, which
    repeat the same process outlined above.*/
    
//import scanner class
import java.util.Scanner;


//defined class as LoopTheLoop
public class LoopTheLoop {

    
    //defined main method
    public static void main (String[ ] args) {
        
        //add scanner to main method
        Scanner myScanner = new Scanner(System.in);
            
        
        
        
            
        //infinte loop used to trigger the star output    
        while (true) {
        
        
        int nStars = -10,    //declared & defined variable for sentinel for while loop
        nStarsChangeable = 1, //define variable counting number of loops/stars for rows of increasing numbers of stars
            counter = 1; //comparison and counter variable for loops
        
        //String variable for while loops
        String stars = "*";
        
        
        //while loop used to force user to enter value between 1 and 15
        while ((nStars > 15) || (nStars < 1)) {
            
            //declared variable uglyJunk
            String uglyJunk = "";
            
            //displays prompt for user to enter correct value
            System.out.print("Please enter an integer between 1 and 15, inclusive: ");
            
            //while loop for detecting value that is not an integer
            while (!myScanner.hasNextInt()) {
                
                //displays prompt for reentering a corect integer
                System.out.println("You did not enter an integer.");
                System.out.print("Please enter an integer between 1 and 15, inclusive: ");
                
                //scanner for detecting next inputted value
                uglyJunk = myScanner.next();
                
            }   //end while loop or integer detections
            
            //this variable stores the correct inputted value of [1,15]
            nStars = myScanner.nextInt();
            
        }   //end while loop for entering correct value
        
        
        
        //while loop to print out a row of nStars stars
        while (counter <= nStars) {
            
            //displays the string stars on one row                    
            System.out.print(stars);
            counter++;  //increases value of counter by 1
            
        }   //end while loop for a row of nStars stars

        System.out.println(""); //put an empty line after the stars are printed
        //reset counter to 1
        counter = 1;
        
        //while loop for stars with increasing rows
        while (counter <= nStars) {
            
            //while loop for ten stars with increasing row lengths of stars
            while (nStarsChangeable <= counter) {
                
                //displays the string stars on one row
                System.out.print(stars);
                nStarsChangeable++; //increases value of nStarsChangeable by 1
            
            }   //end while loop for star rows of increasing length
            
            System.out.println(""); //put an empty line after the stars are printed
            nStarsChangeable = 1;   //reset this value to 1
            counter++;  //increment counter by 1
            
        }   //end while loop for stars with increasing rows 
        
        //displays the prompt for user to rerun program
        System.out.print("Would you like to run the program again (enter Y or y): ");
        
        //declare string checking
        String checking = "hi";
        //scanner to ask user to enter correct input to rerun the program
        checking = myScanner.next();
        
            //if statement for whether program is rerun or not
            if ((checking.equals("Y"))||(checking.equals("y"))){
            }   //end if statement
            
            //else statement for stopping the program
            else {
                
                break;  //exits the infinite while loop to stop program
                
            }   //end else statement

        }   //end while true loop
        
    }   //end main method
    
}   //end class

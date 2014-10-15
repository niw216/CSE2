////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//hw 06
//Root Java Program
    //~description of program~
    /*This program calculates and displays the square root for a rational number
    greater than zero for a user's given input to the program.*/
    
//import scanner
import java.util.Scanner;


//defined class as Root
public class Root {
    
    //defined main method
    public static void main (String args []) {
        
        //add scanner to main method
        Scanner myScanner = new Scanner(System.in);

        //define variables
        double x = -1;
        String generalChecking = "";
           
        //while loop for forcing double greater than 0
        while (x < 0) { 
             
            //displays prompt to user
            System.out.print("Please enter a number greater than zero: ");
            
            //squareRootof_x = x; 
            while (!myScanner.hasNextDouble()) {
                
                //displays prompt for user to enter a double greater than zero
                System.out.print("You did not enter a number. Please enter a number greater than zero: ");
                
                //scanner used to make sure double greater than zero is entered
                generalChecking = myScanner.next();
                    
            }   //end while loop for triggering user to enter double greater than zero    
            
            //scanner that store the inputted value in the x variable
            x = myScanner.nextDouble();
        }   //end while loop for prompting user to enter correct value
        
        //define variables for use with determining the square root
        double low = 0, //sets a low boundary for the possible value of the square root of the number
            high = 1 + x,   //sets a high boundary for the possible value of the square root of the number
            middle = (high + low) / 2,  //the avegrage of the two boundaries and, incidentally, the calculated 
                                        //square root for this program
            square_of_the_middle = Math.pow(middle, 2); //the square of the square root value used to determine
                                                        //the high and low boundaries
        
        //while loop to determine the square root value of the inputted number
        while (middle > (0.0000001*(1+x))) {
            
            //if statement for setting high boundary
            if (square_of_the_middle > x) {
                
                //reset the high value to the middle value
                high = middle;
            }   //end if statement for setting high boundary
            
            //else statement for setting low boundary
            else {
                
                //reset low value to the middle value
                low = middle;
            }   //end else statement for setting low boundary
            
            //adjustment equations used to calculate the new values for the middle and middle squared
            middle = (high + low) / 2;
            square_of_the_middle = Math.pow(middle, 2);
           
           //if statement used to break out of loop, once the given error/accuracy is reached
            if ((high-low) < (0.0000001*(1+x))) {
                break;
            }   //end of if statement for stopping loop
            
        }   //end of square root determining loop
        
        //displays the results of the program
        System.out.print("The square root of "+x+" is ");
        System.out.printf("%7.7f",middle);  //formatted display of double is to account, roughly, for the
                                            //intrinsic error in the calculation, ±0.0000001
        System.out.println('.');
        
    }   //end main method
    
}   //end of class
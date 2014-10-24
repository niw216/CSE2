////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//lab09
//Methods Java Program
    //~description of program
    /*This program asks the user to enter three integers, will compare the first
    two to find the greater number, find the greatest integer out of all three, and
    tell the user if the numbers are in ascending order or not.
    */

//import scanner
import java.util.Scanner;

//define class as Methods
public class Methods {

//~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ method for forcing the user to enter an int ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~    
    public static int forcedIntegerEntry (Scanner myScanner, int entry) {
        
        //add scanner to method
        myScanner = new Scanner(System.in);
        
        //loop used for forcing user to enter an int
        while (!(myScanner.hasNextInt())) {
            
            //displays what happens when int not enterted
            System.out.print("You did not enter an integer.  Please enter an integer: ");
            //checks for entered int
            String reEntry = myScanner.next();
        }
        //stores value of int here
        entry = myScanner.nextInt();
        //returns value of entered int when called upon
        return entry;
    }
//~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~method for integer comparisons~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    public static int integerComparisons (int first, int second, int greaterInt) {
        
        //if statement for comparing two integers
        if (first > second) {
            greaterInt = first; //greaterInt if first is bigger
        }
        else {
            greaterInt = second;    //greaterInt if second is bigger
        }
        //returns value of greater int when called upon
        return greaterInt;
    }
//~ ~ ~ ~ ~ ~ method for determining ascending order of numbers entered~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~

    public static boolean ascendingOrder (int first, int second, int third, boolean ascendingNumbers) {
        
        ascendingNumbers = first < second && second < third;    //determines if numbers are in ascending order
        
        //returns value of true/false for whether condition above is met or not
        return ascendingNumbers;
        
        
    }
//~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~main method ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
    public static void main (String [] args) {
        
        //add scanner to main method
        Scanner myScanner = new Scanner(System.in);
        
        //define variables for use in main method
        int entry = 0,
            $1 , $2 , $3, 
            greaterNumber = -10,
            greatestInt = 0;
        boolean ascending = false;
        
        //displays prompt for entering an integer and stores the value in the appropriate variable
        System.out.print("Please enter an integer: ");
        $1 = forcedIntegerEntry (myScanner , entry);    //calls upon forcedIntegerEntry method to get int
        System.out.print("Please enter a second integer: ");
        $2 = forcedIntegerEntry (myScanner , entry);    //calls upon forcedIntegerEntry method to get int
        System.out.print("Please enter a third integer: ");
        $3 = forcedIntegerEntry (myScanner , entry);    //calls upon forcedIntegerEntry method to get int
        
        
        //compares $1 to $2
        int greaterNumber_$1and$2 = integerComparisons($1 , $2 , greaterNumber);
        //compares $1, $2, and $3
        int greatestNumber = integerComparisons ($3 , greaterNumber_$1and$2 , greatestInt);
        //determines if numbers were entered in ascending order
        boolean ascendingNumberOrder = ascendingOrder ($1 , $2 , $3 , ascending);
        
        //string for displaying result for ascending order
        String answer = "";
        if(ascendingNumberOrder) {
            answer = "Yes!";    //if they are in ascending order
        }
        else {
            answer = "No.";     //if they are not in ascending order
        }
        
        
        //displays the results of the analysis by the program
        System.out.println("The larger of " + $1 + " and " + $2 + " is " + greaterNumber_$1and$2 + '.');
        System.out.println("The larger of " + $1 + " , " + $2 + " , and " + $3 + " is " + greatestNumber + '.');
        System.out.println("Are the numbers in ascending order? \t" + answer);
    }
    
}
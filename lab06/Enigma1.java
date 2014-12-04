////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//lab06
//Enigma1 program
//description: debug program & comment on diagnosis at end of program



/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent = 0, //; //initialize x & percent outside of if statement
        x = 0;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    
    //need to account for when user doesn't enter double, so
    //add scanner to main method
    Scanner a = new Scanner (System.in);
    if(a.hasNextDouble()) {
        /*double*/ x=/*((new Scanner(System.in))*/a.nextDouble();//);
        /*commented out the now unecessary parts in the line/statement*/
        //removes decimal numbers from being processed
        if (x - (int)x != 0) {
            System.out.println("You did not enter a value for the percent (0, 1, ..., 99).");
        }
        else {
            System.out.println("You entered "+x+"%");
        }
        //end of if and else statements removing decimal numbers from being processed
    }
    else {
        System.out.println("You did not enter a value for the percent (0, 1, ..., 99).");
    }
    //print out the proportion remaining for select percentages
   
   //store value derived from entered value in percent to allow comparison to be made
   //in the if and else if statements
   percent = (100 - x) / 100; //made the subtraction occur first before the conversion to a decimal to 
                                //prevent loss of precision error
   
   if(percent==0.93)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if(percent==0.59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(percent==0.86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(percent==0.67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(percent==0.4)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *   First, the program did not account for non doubles entered, which was fixed
 *   by adding an if and else statement and the method hasNextDouble.  Second,
 *   the wrong format for making comparisons in the if and else if statements were
 *   used, so the value of 1 - x/100 was stored into the percent variable and that
 *   value was used as a comparison in the if and else if statements.  Third, the
 *   way the percent equation was formatted lead to loss of precision, so the equation
 *   was rewritten to prevent that.  Fourth, an if and else statement were added to 
 *   prevent decimal numbers from being processed, such that only integers can be entered
 *   for further processing.
 */


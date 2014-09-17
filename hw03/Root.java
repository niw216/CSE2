////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//HW03
//Root Java Program
    //~description of program~
    /*This program allows a user to enter a value, x, for which the cube root
    will be estimated.  The cube root number is then cubed to compare to the 
    original number to determine the accuracy of the calculation.
    */
    
    
//import scanner
import java.util.Scanner;

//define class as Root
public class Root{
     //added main method
    public static void main(String [ ] args) {
        
        //added scanner to system     
        Scanner myScanner = new Scanner(System.in);
        
        //display prompt to enter the number to be analyzed
        System.out.print("Enter Value, x, (as double) of number to be analyzed: ");
        
        //defined variable for x for number to be calculated
        double x =myScanner.nextDouble( );
        
        
        //~the equations/analysis/computation section~
        
       //the cube root section
       double guess,
        guess1,
        guess2,
        guess3,
        guess4,
        guess5;    /*defined variables for all of guessing analysis/computatiion
                        done*/
        guess= x/3;
        guess1=(2*guess*guess*guess+x)/(3*guess*guess);
        guess2=(2*guess1*guess1*guess1+x)/(3*guess1*guess1);
        guess3=(2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        guess4=(2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        guess5=(2*guess4*guess4*guess4+x)/(3*guess4*guess4);
        
        /*double guess6=(2*guess5*guess5*guess5+x)/(3*guess5*guess5);
        the line above really increases the precision of the calculation;
        however, the assignment only asks for 4 additional guesses after doing
        "guess1".  :( */
        
        
        //the cube section
        double cube;
        cube=guess5*guess5*guess5;
       
        
        //the results display
        System.out.println("The cube root of "+x+" is equal to "+guess5+
            " and the cube of "+guess5+" is: "+guess5+'*'+guess5+'*'+guess5+
            " = "+cube+'.');
        
        
   
    }   //end main method
    
}   //end of class
    


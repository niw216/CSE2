/////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//Lab03
//Big Mac Java Program
//~description of program~
    /*this program calculates the cost of a big mac along with tax, 
    based on values inputted by the program user. The scanner class is
    used here allowing the program user to enter said values.*/
    
    
//first must import scanner to program
import java.util.Scanner;


/* >>once scanner imported now can use it in program,
     now add class and main method!<< */
    
    
//defined class as BigMac
public class BigMac {
      
    //added main method
    public static void main(String[ ] args) {
    
    //created a scanner in the program, AFTER importing the 
    //necessary "tools" to have scanner available
    Scanner myScanner = new Scanner(System.in);
    
    
    //displays text between quotes without cursor returning to next line
    System.out.print("Enter number of Big Macs (an integer > 0): ");
    
    //defined integer (literally an integer in the mathematical sense) as 
    //number of big macs, where user can dictate number
    int nBigMacs = myScanner.nextInt ( );
    
    // displays text in quotations
    System.out.print("Enter the cost per Big Mac as " 
        + " a double (in the form of xx.xx):" );
    
    //define double variable for Big Mac price
    double bigMac$ = myScanner.nextDouble( );
    
    //displays text in quotations
    System.out.print("Enter the percent tax as a whole number (xx): ");
    
    //define double for tax rate of area where Big mac is bought
    double taxRate = myScanner.nextDouble( );
    taxRate/=100; //user will enter tax rate as whole number, so this
                  //accounts for the decimal/percentage
    
    //define variable for grand total cost
    double cost$;
    int dollars,    //whole dollar amount of cost
        dimes, pennies; /*for storing digits to the right of the decimal
                        for the cost */
    
    //equation to calculate grand total
    cost$ = nBigMacs*bigMac$*(1+taxRate); //POSSIBLE PROBLEM????
    
    //cast dollars double into integer
    dollars = (int)cost$;
    
    //multiplies the grand total by 10, divides the number by 10, and takes the 
    //remainder from the operation as the value for what dimes is equal to
    dimes=(int)(cost$*10)%10;
    
    //same function occurs for pennies here, except grand total multiplied by
    //100 to get the value for number of pennies in the grand total
    pennies=(int)(cost$*100)%10;
    
    
    //displays the number, value per, and total cost of the big mac(s) bought 
    //along with the sales taxed incurred
    System.out.println("The total cost of "+nBigMacs+" Big Mac(s), at $"+bigMac$+
    " per Big Mac, with a sales tax of " +(int)(taxRate*100)+ "%, is $"
    +dollars+ '.'/*should this be double quotes??*/ +dimes+pennies);

    }   //end main method
    
}   //end class

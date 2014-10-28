////////////////////////////////////////////////////////////////////////////////
//Nicholas Watanabe
//HW08
//Driver Java Program
    //~description of program
    /*This program takes a series of (overloaded) methods and tweaks them to do slightly
    different actions, with the main function of each forcing the user to enter
    a value from a list of values dictated by the programmer.  Those methods are then called
    to the main method, where they are tested out for functionality, where ultimately,
    they will be used for other applications.*/

//import scanner
import java.util.Scanner;

//add class
public class HW8 {

    //method for getting user to enter one character from a list of two possible characters 
    public static String getInput(Scanner myScanner, String prompt) {
            //add scanner to method
            myScanner = new Scanner(System.in);
            //isolate each character in the two character string to each own variable
            char firstChara = prompt.charAt(0),
                secondChara = prompt.charAt(1);
            //convert each character into a string to allow comparison later
            String firstChar = "" + firstChara,
                secondChar = "" + secondChara;
            //inputted value by the user
            String input = myScanner.next();
            //while loop for reprompting user when neither one character nor a correct character is entered
            while (!((input.equals(firstChar)) || (input.equals(secondChar)))) {
                //if statement for when user's input is 1 character, but not a correct one
                if (input.length() == 1) {
                    //displays the following statements in quotes to user
                    System.out.println("You did not enter a character from the list '" + prompt + "'.");
                    System.out.print("Enter a character from the list: '"+prompt+"': ");
                    //reprompts user to enter correct value
                    input = myScanner.next();
                }
                //else statement for when user does not enter only 1 character
                else {
                //displays following statement in quotes
                System.out.print("Please enter exactly one character: ");
                //reprompts user to enter a correct value
                input = myScanner.next();
                }
        }
        //returns/spits out the value stored in the variable input
        return input;
    }
    
    
    //method for getting user to enter one character from a list of possible characters for a given number of chances to input the correct
        //value
    public static String getInput (Scanner myScanner , String prompt, int numberTimesPrompted) {
        //scanner added to method
        myScanner = new Scanner(System.in);
        //inputted value by the user
        String input = myScanner.next();
        //boolean statement to determine if input was only one character and is a "member" of 
            //the String prompt (dictated by programmer later)
        boolean correctChar = (prompt.indexOf(input) >= 0) && (input.length() == 1);
        //store int value outside of for loop
        int counter = 1;
        //for loop to reprompt user enter a correct value, up to the number "numberTimesPrompted" times
        for (counter = 1; (counter <= numberTimesPrompted) && (correctChar == false); counter++) {
            //displays following statement in quotes
            System.out.print("You did not enter one character from the list '"+prompt+"'.Enter a proper character: ");
            //allows user it reinput value
            input  = myScanner.next();
        }
        //if statement for when user does not enter appropriate value after a given number of times
        if (counter > numberTimesPrompted) {
            //displays following statement in quotes
            System.out.println("You failed to enter '"+prompt+"'after "+numberTimesPrompted+" tries.");
            //sets the input to the value of " ".
            input = " ";
        }
        //returns/spits out the value stored in the variable input
        return input;
    }
    
    //method for forcing user to enter one character from a given list of characters
    public static String getInput (Scanner myScanner , String prompt, String possibleInputs) {
        //add scanner to method
        myScanner = new Scanner(System.in);
        //boolean variable used to stop while loop once appropriate value is entered
        boolean gateForWhileLoop = true;
        //initialized input outside of while loop to store value out of the while loop's scope
        String input = "";
        //while loop for prompting user to enter the correct value
        while (gateForWhileLoop) {
            //displays the string prompt as defined by the programmer
            System.out.println(prompt);
            //displays the prompt to the user to enter a character from a given list
            System.out.print("Enter one of: \"" + possibleInputs + "\"- ");
            //inputted value by the user
            input = myScanner.next();
            //boolean statement to determine if input was only one character and is a "member" 
                //of the String prompt (dictated by programmer later)
            boolean correctChar = (possibleInputs.indexOf(input) >= 0) && (input.length() == 1);
            //if statement for when user enters value longer than one character
            if (!(input.length() == 1)) {
                //displays following statement in quotes
                System.out.println("Enter exactly one character.");
            }
            //else if statement for when user enters value 1 character in length, but not on the given list
            else if ((input.length() == 1) && correctChar == false) {
                //displays following statement in quotes
                System.out.println("You did not enter an appropriate character.");
            }
            //else if statemetn for when user enters one appropriate character
            else if ((input.length() == 1) && correctChar) {
                //stops the loop from continuing to run
                gateForWhileLoop = false; 
            }
        }
        //returns/spits out the value stored in the variable input
        return input;
    }
    //added main method
    public static void main(String []arg) {
        //declared variable input
        String input;
        //added scanner to method
        Scanner myScanner=new Scanner(System.in);
        //displays prompt to user
        System.out.print("Enter 'C' or 'c' to continue-");// anything else to quit- ");
        //sets input's value to either "C" or "c", using the getInput method for a list of two possible characters
        input=getInput(myScanner,"Cc");
        //displays what the user entered
        System.out.println("You entered '"+input+"'");
        //displays prompt to user
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        //sets input's value to either y, Y, n, or N, if said characters are entered before 5 attempts, inclusive
        input=getInput(myScanner,"yYnN",5); //give up after 5 attempts
        //if statement displaying result when user does not enter appropriate value after 5 attempts
        if(input!=" "){
            //displays following statement in quotes
            System.out.println("You entered '"+input+"'");
        }
        //sets input's value to one charcter from, "0123456789" (the given list)
        input=getInput(myScanner,"Choose a digit.","0123456789");
        //displays result of user's input
        System.out.println("You entered '"+input+"'");
    }  
}
////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//hw05
//Boola Boola Java Program
    //~description of program~
    /*The program randomly creates a sequence of three true/false statements
    with vary "&&" or "||" operators and analyzes that sequence.  The user is
    then prompted to enter true for false to answer the statement.
    asks the user to enter
    */
    
    
//import scanner class to program
import java.util.Scanner; 

//add class
public class BoolaBoola{
    
    //add main method
    public static void main(String[ ] args){
        
        //add scanner to main method
        Scanner myScanner = new Scanner(System.in);
        
        //variables for true and false
        
        //random numbers generated to determine all of the random trues, falses, "&&", and "||"
        int value1 = (int)(Math.random()*10)%2,
            value2 = (int)(Math.random()*10)%2,
            value3 = (int)(Math.random()*10)%2,
            operatorValue = (int)((Math.random()*10)%4);
            
        //introduce the boolean variables used
        boolean value1Boolean = true,   //first true or false variable
            value2Boolean = true,       //second true or false variable
            value3Boolean = true,       //third true or false variable
            switchCaseBoolean = true;   //contains the answer to the sequence of three true/false statements 
        
        
        //define string to allow prompt to be displayed
        String switchCaseString = "";
            
        //if statement for determining value1 as true
        if(value1==0){
            value1Boolean = true;
        }   //end if statement for value1 as true
        
        //else statement for value1 as false
        else {
            value1Boolean = false;
        }   //end else statement for value1 as false
        
        
        //if statement for determining value2 as true
        if(value2==0){
            value2Boolean = true;
        }   //end if statement for value2 as true
        
        //else statement for value2 as false
        else{
            value2Boolean = false;
        }   //end else statement for value2 as false
        
        //if statement for determining value3 as true
        if(value3==0){
            value3Boolean = true;
        }   //end if statement for value2 as true
        
        //else statement for value3 as false
        else{
            value3Boolean = false;
        }   //end else statement for value3 as false
        
        
        //switch statement that calculates true/false for the overall expression
        switch(operatorValue){
            
            //case for when there are two &&
            case 0: 
                switchCaseBoolean = (value1Boolean)&&(value2Boolean)&&(value3Boolean);
                switchCaseString = value1Boolean+" && "+value2Boolean+" && "+value3Boolean;
                break;  //end case for when there are two &&
              
                
            //case for when first is || and second is &&
            case 1:
                switchCaseBoolean = (value1Boolean)||(value2Boolean)&&(value3Boolean);
                switchCaseString = value1Boolean+" || "+value2Boolean+" && "+value3Boolean;
                break;  //end case for when first is || and second is &&
               
                
            //case for when first is && and second is ||
            case 2:
                switchCaseBoolean = (value1Boolean)&&(value2Boolean)||(value3Boolean);
                switchCaseString = value1Boolean+" && "+value2Boolean+" || "+value3Boolean;
                break;  //end case for when first is && and second is ||
            
            
            //case for when there are two ||
            case 3:
                switchCaseBoolean = (value1Boolean)||(value2Boolean)||(value3Boolean);
                switchCaseString = value1Boolean+" || "+value2Boolean+" || "+value3Boolean;
                break;  //end case for when there are two &&
            
            
        }   //end switch operator value
  
        
        //System.out.println(switchCaseBoolean); //intermediate check on overall computer result
        
        //displays prompt for user to read problem given
        System.out.print("Does \""+switchCaseString+"\" have a value true(T/t) or false(F/f)? ");
       
        //string variable that allows user to enter their answer
        String TtFf = myScanner.nextLine();
        
        //variable saves user's answer
        char typedAnswer = TtFf.charAt(0);
        
        //variable that stores the char into a boolean to allow comparison between 
            //the user and computer boolean
        boolean convertedAnswer;
        
        
        //if statement that converts the character into its corresponding boolean
        if((typedAnswer=='T')||(typedAnswer=='t')){
            convertedAnswer = true;
        }   //end if statement that converts the character into its corresponding boolean
        
        //else if statement that converts the character into its corresponding boolean
        else if((typedAnswer=='F')||(typedAnswer=='f')){
            convertedAnswer = false;
        }   //end else if statement that converts the character into its corresponding boolean
        
        //else statement that accounts for wrong character being entered
        else{
            System.out.println("You did not enter a valid character.");
            return;
        }
        
        
        //this boolean stores the comparison between the user and computer answers
            //to determine if the user was right
        boolean shortenedAnswer = switchCaseBoolean&&convertedAnswer;
        
        //if statement that displays the following text when user is correct
        if(shortenedAnswer==true){
            System.out.println("Right you are!");
            
        }   //end user is correct if statement
        
        //else statement that displays the following text when user is wrong
        else{
            System.out.println("Wrong. Please try again.");
            
        }   //end user is wrong else statement
        
        
        
    }   //end of main method
    
}   //end of class
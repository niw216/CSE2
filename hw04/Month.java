/////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//HW04
//Month Java Program
    //~decription of program~
    /*This program prompts the user to enter an integer from 1 to 12, representing
    each Gregorian month of the year, and will display the number of days in 
    each month according to the year, the latter which may also be prompted.*/
    
//import scanner class
import java.util.Scanner;

//class defined as Month
public class Month{
    
    //main method defined here
    public static void main(String[ ] args){
        
        //added scanner to main method
        Scanner myScanner = new Scanner (System.in);
        
        //displays prompt for entering month
        System.out.print("Enter an integer from 1 to 12, corresponding to a "+
            "month in year: ");
        int month = myScanner.nextInt( );   //variable to enter month
        
       
       
       //using this if statement to separate the months into 2 categories
        if(month<=7){
                
                //since odd months July and before have 31 days the numbered month
                    //plus 1, quantity divided by 2 should have a remainder of 0.
                if((month+1)%2==0){
                    //this displays the number of days in an odd month in or 
                        //before July
                    System.out.println("This month has 31 days.");
                }   //if statement for months w/31 days before 6(June)
                
                    //this else if is used to determine how many days in February
                        //depending on the year
                    else if(month==2){
                        System.out.print("Please specify the year as integer XXXX: ");
                        int year = myScanner.nextInt( );    //variable for prompted year
                        
                        //displays number of days in February if leap year
                        if(year%4==0){
                            System.out.println("The February of "+year+" had 29 days.");
                        }   //end if leap year determination
                            
                            //displays number of days in February if not leap year
                            else{
                                    System.out.println("The February of "+year+" had 28 days.");
                            }   //end else for lear year determination
                            
                    }   //end else if month is February
                    
            }   //end if statement month≥7
            
            
            //this statement separates the months into the second category &
                //prevents people from entering numbers greater than 12
            else if((month>7)&&(month<=12)){
                
                //since even months after July have 31 days, this if statement
                    //determines and displays the number of days in that month.
                if(month%2==0){
                    System.out.println("This month has 31 days.");
                }
                    //this displays the number of days if the month is odd
                    else {
                        System.out.println("This month has 30 days.");
                    }   //end else statement for 30 day odd months
                    
            }   //end else if 7 < month ≤ 12 statement
                
            //this diplays the following quote/string and closes the program
            else{
                System.out.println("You did not enter an integer between 1 and 12");
                return;
                }   //end else statment for month≤6
        

    }   //end main method
    
}   //end class
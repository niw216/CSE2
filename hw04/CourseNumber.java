////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//HW04
//Course Number Java Program
    //~course description~
    /*This program prompts the user to enter a course number at Lehigh University
    and will display what year, and semester or session the course was offered.*/
    
//import Scanner class
import java.util.Scanner;

//class defined as CourseNumber
public class CourseNumber{
    
    //main method defined
    public static void main(String[ ] args){
        
        //add and define scanner as myScanner to main method
        Scanner myScanner = new Scanner(System.in);
        
        //displays information about course number coding/meaning
            //and prompt to enter course number
        System.out.println("Lehigh University uses a 6 digit course numbering "
            +"system, where the first four digits from left to right represent "
            +"the year the course was offered in. The last two digits represent"
            +"the semester or session the course was offered.  Those two digits"
            +"can be the following: 10, 20, 30, or 40.");
        System.out.print("Please enter a six digit number, corresponding to a "
            +"course at Lehigh: ");
        
        //defined variable as integer, courseNumber, as the next inputted number
            //by the user
        int courseNumber = myScanner.nextInt( );
        
        //math used to split the number into its separate parts
        
        //new variable defined to separate the course number
        double courseNumberDivision = (courseNumber/100.00);
        
        //isolates the year in the code
        int yearIsolation = (int)((courseNumberDivision%10000));
        //isolates the semester/session
        int semesterIsolation = (int)(courseNumber%100);
        
        //if statement for displaying the year and semester for a proper course
            //number code
        if((courseNumber>=186510)&&(courseNumber<=201440)){
            
            
            
            //these if and else if statements display the corresponding semester
                //to two digit code
            
            //beginning if year isolation 10
            if(yearIsolation==10){
                System.out.println("This course was offered in the spring"
                    +"semester of "+yearIsolation+'.');
            }   //end if year isolation 10
            
            //beginning else if year islation 20
            else if(yearIsolation==20){
                    System.out.println("This course was offered in the first"
                    +"summer session of "+yearIsolation+'.');
            }   //end else if year isolation 20
            
            //beginning else if year isolation 30
            else if(yearIsolation==30){
                System.out.println("This course was offered in the second"
                    +"summer session of "+yearIsolation+'.');
            }   //end else if year isolation 30
            
            //beginning else if year isolation 40
            else if(yearIsolation==40){
                System.out.println("This course was offered in the fall"
                    +"semester of "+yearIsolation+'.');
            }   //end else if year isolation 40
            
            //beginning else wrong two digit code
            else {
                System.out.println("You did not enter a valid two digit code"
                    +" for a given semester.");
                return;
            }   //end else wrong two digit code
            
            
        }   //end if statement for setting proper range of numbers
        
            
            //the following statements catch erroneous coursenumber codes
                //and identifies what the exact problem is
            
            //beginning else if statement for detecting incorrect years
            else if ((yearIsolation<=1865)||(yearIsolation>=2014)){
                
                
                //beginning if statement for only incorrect years
                if((semesterIsolation==10)||(semesterIsolation==20)||
                     (semesterIsolation==30)||(semesterIsolation)==40){
                //displays what the problem is with the code
                System.out.println("You did not enter a valid year.");
                return;
            
                }
                
                
                //beginning else statement for a wrong year and semester code
                else{
                    System.out.println("You did not enter a valid year nor "
                        +"valid semester code.");
                }   //end else statement for wrong year and semester
           
            }   //end else if for deteceting incorrect years
            
            // beginning else statement for entering a non-integer number
            else {
                System.out.println("You did not enter a valid six digit number"
                    +'.');
            }   //end else statemnt for entering a non-integer number
        
    }   //end main method
    
}   //end class
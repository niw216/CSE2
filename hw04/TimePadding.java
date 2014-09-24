////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//HW04
//Time Padding Java Program
    //~description of program~
    /*This program prompts the user to enter the amount of time elapsed during a
    day in the form of seconds and will convert that number into the
    corresponding time in the conventional AM/PM format.*/
    
//import scanner class
import java.util.Scanner;

//add a class
public class TimePadding{
    
    //field defined to allow variables to work throughout method
    public static int conventionalHoursTime;
    
    //define main method
    public static void main(String[ ] args){
        
        //add scanner to method and define it
        Scanner myScanner = new Scanner(System.in);
        
        //define variables to be used throughout if statement and program
        String meridian = "";
        String adjustedMinutes = "";
        String adjustedSeconds = "";
        
        //displays prompt for user to enter seconds elapsed
        System.out.print("Please enter the amount of seconds elapased for the "
            +"given day: ");
        
        //variable where user enters integer for seconds passeds
        int secondsElapsed = myScanner.nextInt( );
        
        //the math equations that will convert seconds to hours, minutes, and seconds
            //it will also isolate each hours, minutes and seconds 
        int minutesPassed = (secondsElapsed/60)%60;
        int hoursPassed = ((secondsElapsed/3600)%24);
        int secondsPassed = secondsElapsed%60;
        
        //if statement that limits the user to entering a number of seconds to
            //at most 24 hours(86400)
        if((secondsElapsed>=0)&&(secondsElapsed<86400)){
            
            //if statement for PM times
            if((secondsElapsed>=43200)&&(secondsElapsed<=86400)){
                    
                    //PM if statement
                    if(secondsElapsed>43200){
                                conventionalHoursTime = hoursPassed - 12;
                                meridian = "PM";
                    }
                    //else if to determine noon
                    else if(secondsElapsed==43200){
                        System.out.print("It is currently high noon. ");
                        conventionalHoursTime = hoursPassed;
                        meridian = "PM";

                        }
                        
            //else if for determining AM times
            else if(secondsElapsed<43200){
                    conventionalHoursTime = hoursPassed;
                    meridian = "AM";        
                }
           
            
            }
           
           
            //correctional terms to add 0 in front of minutes/seconds if minutes/seconds<10
            if(minutesPassed<10){
                    adjustedMinutes = "0"+minutesPassed;
                    
                }
                    else{
                        adjustedMinutes = ""+minutesPassed;
                    }
                
                if(secondsPassed<10){
                    adjustedSeconds = "0"+secondsPassed;
                }
                    else {
                        adjustedSeconds = ""+secondsPassed;
                    }
            //end of correctional termns

        //this displays the time to the user
        System.out.println("The time is: "+conventionalHoursTime+":"
            +adjustedMinutes+":"+adjustedSeconds+' '+meridian+'.');
        }
        
        //this displays midnight if the user enters 86400seconds (24 hour is equivalent)
        else if(secondsElapsed==86400){
            System.out.println("It is currently midnight. The time is 0:00:00 AM.");
            
        }
            
        //this statement stops the program and tells user that he/she entered too big a number 
        else {
            System.out.println("There are not that many seconds in one day.");
            return;
        }
        
    }   //end of main method
    
}   //end of class
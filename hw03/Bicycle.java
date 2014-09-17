///////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//HW03  
//Bicycle Java Program
    //~description of program~
    /*This program allows users to enter the number of revolutions counted
    (henceforth, counts) for a 27in. diameter bicycle wheel, enter the amount of
    time passed in seconds, and compute & display the distance traveled in miles
    to three decimal places; minutes elapsed during the trip to 2 decimal places;
    and the average speed in miles per hour (mph) to one decimal place.    */
    
    
//import scanner
import java.util.Scanner;


    
//define class as Bicycle
public class Bicycle{
    
    //add main method
    public static void main(String [ ] args) {
        Scanner myScanner = new Scanner (System.in);
        
        //display for prompting user to enter number of counts
        System.out.print("Enter number of counts for trip (integer >0): ");
        
        //inputted data variable - counts
        double counts = myScanner.nextInt ();
        
        //display for prompting user to enter number of seconds elapsed
        System.out.print("Enter amount of time elapsed for trip in seconds: ");
        
        //inputeed data variable - time in seconds
        double time = myScanner.nextInt ();
        
        
        //intermediate data variables (the constants)
        double wheelDiameter=27,   //units are in INCHES!!
            PI=3.141592654,     //value for PI (π)
            inchesPerFoot=12,   //inches to feet conversion factor
            feetPerMile=5280,   //feet to miles conversion factor
            secondsPerMinute=60, //seconds to minutes conversion factor
            minutesPerHour=60;    //minutes to hours conversion factor
        
        
        
        //output variables
        double distanceTraveled;    //distance in miles traveled
        double averageSpeed_ofTrip;  //speed traveled at for duration of trip
        //equation for distance traveled in miles
        distanceTraveled = counts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        
        
       
        //time in minutes elapsed
        double minutesPassed = time/secondsPerMinute;
        double HoursPassed = minutesPassed/minutesPerHour;
    
        //equation for average speed of trip
        averageSpeed_ofTrip=distanceTraveled/HoursPassed;
        
        //~equations to truncate variables~
        
        //truncated distanceTraveled variable
        double augmented_Distance = distanceTraveled*1000;
        int $DistanceCastingConversion = (int) augmented_Distance;
        double corrected_Distance = $DistanceCastingConversion/1000.0;
        
        //truncated minutes variable
        int corrected_Minutes= (int)minutesPassed;
        int minutesTenthsPlace= (int)(minutesPassed*10)%10;
        int minutesHundredthsPlace= (int)(minutesPassed*100)%10;
        
        //truncated average speed variable
        double augmented_Speed= averageSpeed_ofTrip*10;
        int speedCastingConversion= (int) augmented_Speed;
        double corrected_Speed=speedCastingConversion/10.0;
        
        
        //display of results
        System.out.println("The distance traveled was "+corrected_Distance+
            " miles and took "+corrected_Minutes+'.'+minutesTenthsPlace
            +minutesHundredthsPlace+" minutes. "+
            "The average speed was "+corrected_Speed+" mph. ");
    
        
    }   //close main method
    
}   //close class
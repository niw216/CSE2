///////////////////////////////////////////
//Nick Watanabe
//lab02
//Cyclometer
    //displays trip time in minutes
    //displays revolutions of front tire (henceforth, "counts")
    //displays distance traveled in miles
    //displays combined distance of two trips
//


//define class as Cyclometer
public class Cyclometer{
    
    //added main method
    public static void main(String[ ] args) {
        //inputted data variables
        int secsTrip1=480;  //time elapsed Trip 1
        int secsTrip2=3220; //time elapsed Trip 2
        int countsTrip1=1561; //number of counts Trip 1
        int countsTrip2=9037; //number of counts Trip 2
        
        //our intermediate variables and output data
        double wheelDiameter=27.0,  //diameter of bicycle wheel in inches
        PI=3.14159, //value of PI used in calculations
        feetPerMile=5280,   //conversion factor for feet into miles
        inchesPerFoot=12,   //conversion factor for inches into feet
        secondsPerMinute=60;   //conversion factor for seconds into minutes
        double _distanceTrip1, _distanceTrip2, _total_distance;    // define new variables "distanceTrip1" "distanceTrip2" "total distance"
        
        //display time elapsed in minuts and counts during Trip
        System.out.println("Trip1 took "+(secsTrip1/secondsPerMinute)+ " minutes and had "
            +(countsTrip1)+ "counts."); 
        System.out.println("Trip2 took "+(secsTrip2/secondsPerMinute)+ "minutes and had "
            +(countsTrip2)+ "counts."); 
            
        //run calculations; store the values.  
        _distanceTrip1=countsTrip1*wheelDiameter*PI;
        /* above gives distance in inches (for each count, one revolution of the wheel is equal
        to the diameter in inches time PI)*/
        (_distanceTrip1)/=inchesPerFoot*feetPerMile;    //gives distance in miles for Trip1
        _distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;   //distance in miles for Trip2
        _total_distance=_distanceTrip1+_distanceTrip2;   //gives combined distance traveled of Trip1 & Trip2
        
        //display distance traveled for "distanceTrip1" "distanceTrip2" "total distance"
        System.out.println("Trip 1 was "+(_distanceTrip1)+ "miles");
        System.out.println("Trip 2 was "+(_distanceTrip2)+ "miles");
        System.out.println("The total distance was "+_total_distance+" miles");
        
    }   //end of main method
}   //end of class
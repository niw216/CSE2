////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//HW03
//Four Digits Java Program
    //~description of program~
    /*This program takes a double in the form of XXXX.XXXX and displays
    the first four digits to the right of the decimal point.*/
  
  
    
//import scanner to program

import java.util.Scanner;

//define class as FourDigits
public class FourDigits{
    
    //added main method
    public static void main(String[ ] args) {
        
        //added Scanner to program
        Scanner myScanner = new Scanner(System.in);
        
        //display prompt for user to enter double in form of XXXX.XXXX
        System.out.print("Enter double in the form of XXXX.XXXX: ");
        
        //define variable for entered double
        double _double = myScanner.nextDouble ( );
        
        
        //the extraction & isolation of the numbers to the right of the decimal
        int integerDouble,
            augmentedDouble,
            correctedDouble,
            tenthsDouble,
            hundredthsDouble,
            thousandthsDouble,
            tenthousandthsDouble;
        double decimalDouble;   //defined variables to get four digits isolated
        
        integerDouble=(int)_double;
        decimalDouble=(double)(_double-integerDouble);
        tenthsDouble=(int)(decimalDouble*10)%10;
        hundredthsDouble=(int)(decimalDouble*100)%10;
        thousandthsDouble=(int)(decimalDouble*1000)%10;
        tenthousandthsDouble=(int)(decimalDouble*10000)%10;
        augmentedDouble= (int)(decimalDouble*10000);
        
        
        
        //the display of the double's first four digits to the right of the
        //decimal place.
        System.out.println("The four digits are "+tenthsDouble+hundredthsDouble
            +thousandthsDouble+tenthousandthsDouble+/*augmentedDouble+*/'.');
        
        
        
        
    }   //end of main method
}   //end of class
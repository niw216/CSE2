////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//lab11
//Arrays
//description of program
    /*This program prompts the user to enter ten integers and stores them in an
    array.  The program then finds the lowest and highest integer entered, and 
    displays the array in a 1 x 10 matrix, along with the reverse of the matrix.
    */
    
    
//import scanner to program
import java.util.Scanner;


//add class
public class Arrays {
    
    //add main method
    public static void main (String args []) {
        //add scanner to main method
        Scanner myScanner = new Scanner(System.in);
        
        //declare initialize and allocate memory to array
        final int arraySize = 10;
        int [] myArray = new int [arraySize];
        int [] temp = new int[arraySize];
        
        
        //displays prompt
        System.out.print("Enter 10 integers: ");
        //for loop for entering integers into array
        for (int arrayEntry = 0; arrayEntry < arraySize; arrayEntry++) {
            //stores integers into arary
            myArray[arrayEntry] = myScanner.nextInt();
        }
        //arbitrary values for finding low and high of the array
        int lowestInt = myArray[0],
            highestInt = myArray[1];
    
        //for loop for lowest & highest int in array
        for (int arrayEntry = 0; arrayEntry < arraySize - 1; arrayEntry++) {
            //extra variables for comparing the different array members
            int arrayPlusOneNumber = arrayEntry + 1,
                arrayPlusOne = myArray[arrayPlusOneNumber],
                array = myArray[arrayEntry];
            //given two consecutive entries...
            if(array < arrayPlusOne) {
                //is the first entry lower than the set value?
                if (array < lowestInt) {
                    //if yes, first entry is now lowest value
                    lowestInt = array;
                }
                //is the second entry higher than the set value?
                if (arrayPlusOne > highestInt) {
                    //if yes, second entray is now highest value
                    highestInt = arrayPlusOne;
                }
            }
            //if the first entry is not lower than the second
            else {
                //is the second entry lower than the set value?
                if (lowestInt > arrayPlusOne) {
                    //if yes, second entry is now lowest value
                    lowestInt = arrayPlusOne;
                }
                //is the first entry higher than the set value?
                if (array > highestInt) {
                    //if yes, first entray is now highest value
                    highestInt = array;
                }
            }
        }
        //displays the highest and lowest int
        System.out.println("The highest integer is: "+highestInt);
        System.out.println("The lowest intger is: "+lowestInt);
        //intialize arraySum to zero
        int arraySum = 0;
        
        //summing up ints in the array
        for (int arrayEntry = 0; arrayEntry < arraySize; arrayEntry++) {
            //add each entry to arraySum to get the total sum of the members
            arraySum += myArray[arrayEntry];
        }
        //displays the sum of the members
        System.out.println("The sum is: "+arraySum);
        
        //for loop for copying array over to temp array in reverse order
        for (int arrayEntry = 0; arrayEntry < arraySize; arrayEntry++) {
            //sends each value in myArray to temp array in reverse order
            temp[arrayEntry] = myArray[9 - arrayEntry];
        }
        
        //for loop for displaying each member of both arrays in a vertical format
        for (int arrayEntry = 0; arrayEntry < arraySize; arrayEntry++) {
            //displays each member of both arrays in a vertical format
            System.out.printf("\t" + myArray[arrayEntry] + "\t" + temp[arrayEntry]);
            //returns to the next line
            System.out.println();
        }
    }
}
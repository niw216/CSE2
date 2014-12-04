////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//lab13
//Ragged Arrays Java Program
//description of program
    /*This program generates a ragged array and calls on two methods that will
    display and sort the array in ascending order.
    */
    
//import Scanner and Random
import java.util.Scanner;
import java.util.Random;

    
//add class
public class raggedArrays {
    
    //display ragged array method
    public static void display (int[][] array) {
        //string for which array display will be stored
        String output = "{ \n";
        //for loop to choose main array member for display
        for (int i = 0; i < array.length; i++) {
            //add "{ " to output string
            output += "{ ";
            //for loop for adding subarray members to string
            for (int j = 0; j < array[i].length; j++) {
                //add subarray member to string
                output += array[i][j];    
                //puts ", " in appropriate places
                if (j < array[i].length - 1) {
                    output += ", ";
                }
            }
            //closes off the end of subarray with " }" and returns to next line
            output += " }\n";
        }
        //closes the multidimensional array with "}"
        output+= "}";
        //displays the array
        System.out.println(output);
    }
    
    //selection sort for each subarray of the 2d array
    public static int[][] selectionSort (int[][] A) {
        //for loop for automating sort for a given main array member
        for (int i = 0; i < A.length; i++) {
            //for loop sequentially setting each array value as a reference value & for determining the farthest left
            //value in the array that hasn't been already checked/swapped/modified.
            for(int j = 0; j < A[i].length - 1; j++){ 
                //stores the index of the min value as integer
                int minValIndex = j;
                //for loop sequentially comparing the next value after the reference value to the reference value
                for (int k  = j + 1; k < A[i].length; k++) {
                    //if statement that's entered, when the compared value is less than the reference value
                    if (A[i][k] < A[i][minValIndex]) {
                        //change the min value index to that from the new smaller value
                        minValIndex = k;
                    }
                }
                //statement that prevents the swap if the current reference value is the lowest value in the array
                //starting from array index at j
                if (j != minValIndex) {
                    //store value at index j in another int
                    int temp = A[i][j];
                    //set value at index j equal to the min value
                    A[i][j] = A[i][minValIndex];
                    //finish the swap -- replace value where min value is with the previous value at index j
                    A[i][minValIndex] = temp;
                }
            }
        }
        //return the sorted matrix to another method
        return A;
    }
    
    //add main method
    public static void main (String args []) {
        //add new random to main method
        Random myRandom = new Random();
        //declare myRaggedArray
        int [][] myRaggedArray;
        //set LENGTH of main array to 5
        final int LENGTH = 5;
        myRaggedArray = new int [LENGTH][];
        //generate ragged subarray using for loop
        for (int i = 0; i <  LENGTH; i++){
            myRaggedArray[i] = new int [i*3 + 5];
        }
        //for loop used for filling up each array in the main array with filled arrays
        for (int i = 0; i < myRaggedArray.length; i++) {
            //for loop used for filling up each array in subarray with numbers
            for (int j = 0; j < myRaggedArray[i].length; j++) {
                //generate a random number, [0,39], and store it
                int random = myRandom.nextInt(39);
                //assign that random number as member in one spot in one subarray
                myRaggedArray[i][j] = random;
            }
        }
        //displays the following quoted statement
        System.out.println("The array before sorting:");
        //displays the generated multidimensional array
        display(myRaggedArray);
        //puts space between the generated array and the sorted array
        System.out.println();
        
        //displays the following quoted statement
        System.out.println("The array after sorting;");
        //sort the generated array  and store stored array in another array 
        int [][]sorted = selectionSort(myRaggedArray);
        //display the sorted array
        display(sorted);
        

    }
    
}
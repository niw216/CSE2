////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//hw11
//Matrix Sorter Java Program
//description of program
    /*This program generates and displays a 3D array from random numbers, [0,99].
    It also sorts the 3rd slab's numbers in each row via ascending order via selection sort.
    It also sorts each column of the third slab via ascending order based on the first
    value in each row via insertion sort.
    */
    
//import random class to program    
import java.util.Random;


//add class
public class MatrixSorter{
    //build Mat 3d will initialize and fill 3d array with random numbers from 1 to 99, inclusive
    public static int[][][] buildMat3d () {
        Random myRandom = new Random();
        int [][][] A = new int [3][][];
        for (int i = 0; i < A.length; i++) {
            //for (int j = 0; j < A[i].length; j++) {
            A[i] = new int [2*i + 3][];
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = new int [i + j + 1];
            }
        }
        for (int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                for (int k = 0; k < A[i][j].length; k++) {
                    int random = myRandom.nextInt(99);
                    A[i][j][k] = random;
                }
            }
        }
        return A;
    }
    public static void show (int[][][] A) {
        String output = "";
        
        for (int i = 0; i < A.length; i++) {
            output += "–––––––––– ~Slab " + (i + 1) + "~ ––––––––––" + "\n";
            for (int j = 0; j <  A[i].length; j++) {
                for (int k = 0; k < A[i][j].length; k++) {
                    output += A[i][j][k] + " ";
                    
                }
                output += "\n";
            }
        }
        System.out.println(output);
    }
    public static int findMin (int[][][] A) {
        int min = A[0][0][0];
        
        for (int i = 0; i < A.length; i++) {
            //min = A[i][0][0];
            for (int j = 0; j < A[i].length; j++) {
                //min = A[i][j][0];
                for (int k = 0; k < A[i][j].length - 1; k++) {
                    for (int l = k + 1; l < A[i][j].length; l++) {
                        if (A[i][j][l] < min) {
                            min = A[i][j][l];
                        }
                    }
                }
            }
        }
        return min;
    }
    public static int[][] sort (int[][] A) {
        //~~~~~~~~~~~~~~~~Selection Sort~~~~~~~~~~~~~~~~~
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
        return A;
    }
    /* could not get insertion sort to work...
    
    
    public static int[][] insertionSort (int[][] A) {
        //~~~~~~~~~~~~~~~~Insertion Sort~~~~~~~~~~~~~~~~~~~~~~~~~~
        
        for (int k = 0; k < A.length; k ++) {
            for (int j = 1; j < A.length ; j++) {
                
                int key = A[j][0];
                
                int i;
                for (i = j - 1; (i > -1) && ( A[i][0] > key ); i--) {
                    int[] temp = new int [A[i + 1].length];
                    for (int z = 0; z < A[i + 1].length; z++) {
                        temp[z] = A[z];
                    }
                    A[i + 1] = A[i];
                }
                A[i + 1] = temp;
            }
        }
        
        
        
        
        //return the sorted matrix to another method
        return A;
    } */
    
    //add main method
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+ 
            findMin(mat3d)); 
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
        //insertionSort(mat3d[2]);
        //show(mat3d);
        
        
    }
}
////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//hw10
//Find Duplicates Java Program
//description of program
    /*This program asks the user to enter 10 integers into an array and uses two
    methods to determine if duplicates are present in the array and if the array
    only has one integer that is duplicated.
    */

//import scanner to program    
import java.util.Scanner;

//add class
public class FindDuplicates {
    //add main method
    public static void main(String [] arg){
        //add scanner to main method
        Scanner scan=new Scanner(System.in);
        //initialize and allocate memory for num matrix
        int num[]=new int[10];
        //initialize answer string
        String answer="";
        //start of do while loop for asking user to enter 10 ints
        do{
            //displays the statement below
            System.out.print("Enter 10 ints- ");
            //for loop for having user input 10 integers
            for(int j=0;j<10;j++){
                //stores each inputted integer into an index of the num array
                num[j]=scan.nextInt();
            }
            //intialize out string with the following quoted statement
            String out="The array ";
            //adds onto out the entered array in a single row
            out+=listArray(num); //return a string of the form "{2, 3, -9}"   
            //when duplicates are present...
            if(hasDups(num)){
                //..."has" is added to out string
                out+="has ";
            }
            //when duplicates are not present...
            else{
                //..."does not have" is added to the string
                out+="does not have ";
            }
            //adds duplicates to the string
            out+="duplicates.";
            //displays the out string
            System.out.println(out);
            //resent out string to "The array "
            out="The array ";
            //adds onto out the entered array in a single row
            out+=listArray(num); 
            //when exactly one duplicate of one number is present...
            if(exactlyOneDup(num)){
                //..."has" is added to out string
                out+="has ";
            }
            //when explicitly one duplicate of one number is not present...
            else{
                //..."does not have" is added to the string
                out+="does not have ";
            }
            //"exactly one duplicate" is added to out string
            out+="exactly one duplicate.";
            //displays to user out string
            System.out.println(out);
            //displays prompt for user to run program again
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            //accepts the value the user chooses to enter
            answer=scan.next();
        } while(answer.equals("Y") || answer.equals("y"));  //loop will run again if "Y" or "y" are inputted
    }

    //listArray method stores the array of the inputted ints into a single row of integers
    public static String listArray(int num[]){
        //initialize the String out with "{"
        String out="{";
        //for loop for adding the numbers, separated by commas, into the out String
        for(int j=0;j<num.length;j++){
            //if statement for putting a comma after each number
            if(j>0){
                //adds a ", " to the end of out String
                out+=", ";
            }
            //adds the member of the array at the index j to the out String
            out+=num[j];
        }
        //adds "} " to the end of the out String
        out+="} ";
        //sends/spits out the out String to another method
        return out;
    }
    
    //hasDups detects whether or not duplicate numbers are present
    public static boolean hasDups (int num []) {
        //set the test value for duplicates to 0
        int positiveTestValue = 0;
        //for loop for initializing each search for a given index number
        for (int index = 0; index < num.length; index++) {
            //comparison number that is set to the next number to prevent redundant comparisons
            int comparisonArrayNumber = index + 1;
            //System.out.println(index + '+' + comparisonArrayNumber);
            //for loop for scanning through the rest of the members of the array that come after the given index number/member
            for (; comparisonArrayNumber < num.length; comparisonArrayNumber++) {
                //when the two numbers are equal, i.e., are duplicates...
                if (num[index] == num[comparisonArrayNumber]) {
                    //...the test value is incremented by one.
                    positiveTestValue++;
                }
            }
            /*needed to reset comparison array number to index+1 for next loop 
                because increment of comparisonArrayNumber in the nested loop is 
                stored into the outer loop!*/
            comparisonArrayNumber = index + 1;  
        }
        //if duplicates were present...
        if (positiveTestValue > 0){
            //...true is sent out from this method
            return true;
        }
        //if no duplicates were present...
        else {
            //...false is sent out from this method
            return false;
        }
    }
    //exactylOneDup detects whether or not exactly one number has one duplicate in the array
    public static boolean exactlyOneDup (int [] num) {
        //set the test value for duplicates to 0
        int positiveTestValue = 0;
        //for loop for initializing each search for a given index number
        for (int index = 0; index < num.length; index++) {
            //comparison number that is set to the next number to prevent redundant comparisons
            int comparisonArrayNumber = index + 1;
            //for loop for scanning through the rest of the members of the array that come after the given index number/member
            for (; comparisonArrayNumber < num.length; comparisonArrayNumber++) {
                //when the two numbers are equal, i.e., are duplicates...
                if (num[index] == num[comparisonArrayNumber]) {
                    //...the test value is incremented by one.
                    positiveTestValue++;
                }
            }
            /*needed to reset comparison array number to index+1 for next loop 
                because increment of comparisonArrayNumber in the nested loop is 
                stored into the outer loop!*/            
                comparisonArrayNumber = index + 1;  
        }
        //if exactly one duplicate of any number in the array is present (i.e., positiveTestValue should be only equal to 1!)...
        if (positiveTestValue == 1){
            //...true is sent out from this method
            return true;
        }
        //if not exactly one duplicate of any number in the array is present...
        else {
            //...false is sent out from this method
            return false;
        }
        
    }
    
}

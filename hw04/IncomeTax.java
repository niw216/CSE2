////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//HW04
//Income Tax Java Program
    //~description of program~
    /*This program prompts the user to input their thousands of dollars of 
    income and will output the amount of money due in progressive income tax
    by using the scanner class for a prompted input and if statements to
    determine the amount of money taxed at a given rate per bracket of income.*/
    
//import scanner class
import java.util.Scanner;


//class defined as IncomeTax
public class IncomeTax{
        
    
    //main method defined
    public static void main (String[ ] args){
        
        //add scanner to method
        Scanner myScanner = new Scanner(System.in);
        
        //define constants
        
        //tax bracket rates
        final double atMost20K = 5,
            between20Kand40K = 7,
            between40Kand78K = 12,
            atleast78K = 14;
            
        //variables for summing up all tax incurred for different brackets
        double fromAtMost20K,
        fromBetwixt20Kand40K,
        fromBetwixt40Kand78K,
        fromAtLeast78K;
            
        //display prompt for entering income
        System.out.print("Please enter your income in thousands of dollars: ");
        int grossIncome = myScanner.nextInt( );
        //int expandedGrossIncome = grossIncome*1000;
        
        
        
        //beginning of if statement analysis of gross income
        
        //define boolean variables to be used
        boolean incomeIntegerTest = (grossIncome>=0),
            first20K = (grossIncome>=20),//&(grossIncome<20),     //first test for income
            first40K = (grossIncome>=40),
            first78K = (grossIncome>=78),
            ifBetween20Kand40K = (grossIncome>=20)&(grossIncome<40),
            ifBetween40Kand78K = (grossIncome>=40)&(grossIncome<78),
            ifAtleast78K = (grossIncome>=78);
            
        //beginning grossIncome if statement
        
        //1st if statement is an INT TEST!!!
        if(incomeIntegerTest){        //use this if to determine whether or not the value entered is an int of the right type!!!
            //if analysis for whether or not income≥20k
            
            //statement to determine tax for income≥78
            if(first78K){
                fromAtLeast78K = (grossIncome)*(atleast78K/100)*1000;   //equation to calculate tax
                //decimal truncation
                double fromAtLeast78KtypeCasting = (int)(fromAtLeast78K*100);
                double fromAtLeast78Kcorrected  = fromAtLeast78KtypeCasting/100.00;
                
                //displays gross income, tax rate and tax due to user
                System.out.println("The tax rate on your $"+grossIncome+",000 is "
                    +atleast78K+"%. The total tax due is $"+fromAtLeast78Kcorrected+'.');
            }   //end if income≥78
            
            //statement to determine tax for 40≤income<78
            else if(first40K){
                
                fromBetwixt40Kand78K = (grossIncome)*(between40Kand78K/100)*1000;
                 //decimal truncation
                double fromBetwixt40Kand78KtypeCasting = (int)(fromBetwixt40Kand78K*100);   //equation to calculate tax
                double fromBetwixt40Kand78Kcorrected  = fromBetwixt40Kand78KtypeCasting/100.00;
                
                //displays gross income, tax rate and tax due to user
                System.out.println("The tax rate on your $"+grossIncome+",000 is "
                    +between40Kand78K+"%. The total tax due is $"+fromBetwixt40Kand78Kcorrected+'.');
                    
            }   //end else if 40 ≤ income < 78
            
            //statement to determine tax for 20≤income<40    
            else if(first20K){
                fromBetwixt20Kand40K = (grossIncome)*(between20Kand40K/100)*1000;   //equation to calculate tax
                       //decimal truncation
                double fromBetwixt20Kand40KtypeCasting = (int)(fromBetwixt20Kand40K*100);
                double fromBetwixt20Kand40Kcorrected  = fromBetwixt20Kand40KtypeCasting/100.00;

                //displays gross income, tax rate and tax due to user
                System.out.println("The tax rate on your $"+grossIncome+",000 is "
                +between20Kand40K+"%. The total tax due is $"+fromBetwixt20Kand40Kcorrected+'.');
                
            }   //end else if 20 ≤ incme < 40
            
            //statement to determine tax for income≤20
            else if(grossIncome<=20){   
                fromAtMost20K = (grossIncome)*(atMost20K/100)*1000;   //equation to calculate tax
                
                //decimal truncation
                double fromAtMost20KtypeCasting = (int)(fromAtMost20K*100);
                double fromAtMost20Kcorrected  = fromAtMost20KtypeCasting/100.00;
                
                //displays gross income, tax rate and tax due to user
                System.out.println("The tax rate on your $"+grossIncome+" is "
                +atMost20K+"%. The total tax due is $"+fromAtMost20Kcorrected+'.');            
                
            }   //end else if grossIncome < 20
     
        }   //end income integer test
        
        else if(grossIncome<=0){
            
            System.out.println("You did not enter positive, non-zero integer.");
            return;
        }
        else{
            System.out.println("You did not enter an integer.");
            return;
        }
        
        
    }   //end main method
    
}   //end class
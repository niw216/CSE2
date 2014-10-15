////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//hw 06
//Roulette Java Program
    //~description of program~
    /*This program runs through a roulette simulation where a person would bet one
    dollar on one number for a 100 spin session, and simulates that session 1000 times.
    The amount of money won or lost, the number of times won, the number of sessions where
    the "player" was profitable, and the number of times a player loses every single
    spin in one session are displayed at the end of the analysis.
    */
    
    
//import scanner class
import java.util.Scanner;

//created class
public class Roulette {
    
    //created main method
    public static void main(String args []) {
        
        Scanner myScanner = new Scanner(System.in);
        
        //System.out.println("Welcome the roulette table! Place your bet on number!"); 
        //System.out.print("(Enter a number between 0 and 36, or 37 if you want to bet on 00: ");
        
        //constants used in program
        final int NUMBER_OF_SPINS = 100,
            NUMBER_OF_SIMULATIONS = 1000,
            INTIAL_AMOUNT_OF_MONEY = 100,
            MONEY_WON_PER_SPIN = 36;
            
        //counters and sentinel variables for while loop
        double counterSpins = 1,
            counterSimulations = 1,
            numberOfTimesWonCounter = 0,
            numberOfTimesWon = 0,
            numberOfTimesLost = 0,
            numberofTimesIlostEverything = 0,
            //random number variables used to decide if the player wins or not
            inputtedNumber,
            rouletteWheelNumber;
        
        //another counter for the number of profitable sessions    
        int numberOfProfitableSessions = 0;
        
        //loop for simulating 1000 simulations
        while (counterSimulations <= NUMBER_OF_SIMULATIONS) {
            
            //boolean variable for gating off one profitable session
            boolean gateForProfitableSession = true;
            
            //variable for reseting number of profitable sessions for each new session
            numberOfTimesWonCounter = 0;
            
            //while loop for one round of simulations
            while (counterSpins <= NUMBER_OF_SPINS) {
                
                //the two random numbers generated for determined if the player wins or not
                inputtedNumber = (int)(((Math.random()*100)%38));
                rouletteWheelNumber = (int)(((Math.random()*100)%38));
                
                //if statement for when player wins
                if (inputtedNumber == rouletteWheelNumber) {
                    numberOfTimesWon++;
                    numberOfTimesWonCounter++;
                    
                    //if statement for marking/counting a profitable session
                    if ((numberOfTimesWonCounter >= 3) && (gateForProfitableSession)) {
                        numberOfProfitableSessions++;
                        gateForProfitableSession = false;
                    }   //end if statement for profitable session
                    
                }   //end if statement for when player wins
                
                //else statement for when player loses
                else {
                    numberOfTimesLost++;
                }   //end else statement for when player loses
                
                //if statement for counting the number times a player loses all 100 spins in a session
                if (numberOfTimesLost == NUMBER_OF_SPINS) {
                    numberofTimesIlostEverything++;
                }   //end if statement
                
                counterSpins++; //counts the spins for each session
            }   //end while loop for one round of simulations
            
            counterSpins = 1;   //resets the spin count for each simulation
            
            
            counterSimulations++;   //counts the number of simulations done
        }   //end while loop for performing 1000 simulations
    
    
        //equations for determining the gross and net amount of money made
        double profitPersimulation = MONEY_WON_PER_SPIN * numberOfTimesWon - INTIAL_AMOUNT_OF_MONEY;
        double totalProfit = (profitPersimulation * NUMBER_OF_SIMULATIONS);
    
   
        //if statement for displaying the outcome of the results
        System.out.printf("The number of time(s) I lose all my money per 100 spin session: %.0f \n",numberofTimesIlostEverything);
        System.out.printf("The number of time(s) I win: %5.0f \n",numberOfTimesWon);
        
        //if statement for displaying if the player if profitable
        if (profitPersimulation > 0) {
            
            System.out.printf("The total profit is: $%6.0f \n",totalProfit);
            System.out.println("The total number of time(s) I made money per 100 spin session: "+numberOfProfitableSessions+'.');
        }   //end if statement for profitable outcome
        
        //else if for displaying if player does not make or lose money
        else if (profitPersimulation == 0) {
            System.out.println("You did not win any money.");
            
        }   //end else if statement for no net gain
        
        //else statement for losing money
        else {
            double totalLoss = -totalProfit;
            System.out.println("The total amount of money LOST is: $"+totalLoss);
            
        }   //end else statement for loss of money
    
    }   //end main method
    
}   //end class
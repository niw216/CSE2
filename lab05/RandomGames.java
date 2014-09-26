////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//lab 05
//Random Games Java Program
    //~description of program~
    /*This program
    */
    
    
//import scanner class
import java.util.Scanner;

//add class
public class RandomGames{

    
    //add main method
    public static void main(String[ ] args){
        
        //add scanner to main method
        Scanner myScanner = new Scanner(System.in);
        
        //display prompt to enter the correct code for the game
        System.out.print("Please enter R or r for Roulette, C or c for Craps,"
            +"or P or p for picking a card: ");
        
        
        
            
        //define variable for prompted entry
        String promptedCharacter = myScanner.nextLine();
       
        //defined character to store/choose/check for the correct single character
        char inputtedCharacter = promptedCharacter.charAt(0);
        
        //if statement that returns program if more than one character is entered
        if(promptedCharacter.length()==1){
            

            //this switch dictates the actions/results of the inputted single character
            switch(inputtedCharacter) {
            
            
            //case for roulette wheel (R or r); the following is executed when the
                //correct conditions are met
            case 'R':
            case 'r':
                
                //this integer randomly generates a number from 0 to 38
                int rouletteWheelNumber = (int)(((Math.random()*100)%38));
            
                    //this string is present to intialize/define the variable numberColor
                    String numberColor = "";
                    
                    //if statement determin numbers that are black on the roulette wheel
                    if((rouletteWheelNumber%2==0)&&(rouletteWheelNumber!=0)){
                        numberColor = "Black";
                    }   //end if statement for black numbers
                    
                    //else if statement or blue numbers on roulette wheel
                    else if ((rouletteWheelNumber==37)||(rouletteWheelNumber==0)){
                        numberColor = "Blue";
                    }   //end else if statement for blue numbers
                    
                    //else statement to deal with all other numbers (which are red)
                    else {numberColor = "Red";
                        
                    }   //end else statement for red numbers on roulette wheel
                    
                    //this switch generates the outputted number based on the random
                        //number generated
                    switch(rouletteWheelNumber){
                        
                        //this case defines the case for generating the 00 number
                        case 37: System.out.println("And the number is "+numberColor+" 00!");
                            break;  //end of case 37
                        
                        //the default case generates the outputted number for numbers 0 to 36
                        default: System.out.println("And the number is "+numberColor+' '+rouletteWheelNumber+'!');
                        
                    }   //end switch statement for generating roulette number
                    
                                
                break;  //end of case for roulette option (R or r)

            //the case for craps (C or c) and what happens for this case
            case 'C':
            case 'c':
                
                //variables for the dice and to generate random numbers for a 
                    //simulated dice roll
                int die1 = (int)(((Math.random()*10)%6)+1),
                    die2 = (int)(((Math.random()*10)%6)+1),
                    diceSum = die2+die1;    //sum of the values of the two dice
                
                
                //displays the appropriate text for the craps condition and 
                    //rolling of the dice
                System.out.println("Everyone place your bets!");
                System.out.println("The dice have been thrown and the result is "
                    +die1+" and "+die2+", a total of "+diceSum+'!');
                
                            
                break;  //end of craps (C or c) condition
            
            //case for picking a card (P or p) and for what happnen in this scenario
            case 'P':
            case 'p':
                
                
                int cardNumber = (int)((Math.random()*100)%13); /*this generates
                    one of the 13 face values on a playing card*/
                    
                //this determines the suit of the given randomly selected card    
                int suitDetermination = cardNumber%4;
                
                //defined variables to generate the face value and suit of card
                String cardFaceValue = "",
                    suit = "";
                
                //this switch determines the suit of the card
                switch(suitDetermination){
                    case 0: suit = "Hearts";    //case for hearts suit
                        break;  //end case for hearts suit
                        
                    case 1: suit = "Spades";    //case for spades suit
                        break;  //end case for spades suit
                        
                    case 2: suit = "Clubs";     //case for clubs suit
                        break;  //end case for clubs suit
                        
                    case 3: suit = "Diamonds";  //case for diamonds suit
                        break;   //end case for diamonds suit
                    
                }   //end switch statement to determine suit
                
                //this switch turns the random card number generated and turns it
                    //into an appropriate card face value
                switch(cardNumber){
                    
                    //this number will generate the facevalue of a King
                    case 0: cardFaceValue = "King";
                        break;  //end of King facevalue
                        
                    //this number will generate the facevalue of an Ace    
                    case 1: cardFaceValue = "Ace";
                        break;  //end of Ace facevalue
                        
                    //this number will generate the facevalue of a Knave/Jack
                    case 11: cardFaceValue = "Knave";
                        break;  //end of Knave facevalue
                        
                    //this number will generate the facevalue of a Queen
                    case 12: cardFaceValue = "Queen";
                        break;  //end of Queen facevalue
                        
                    //this number will generate the facevalue of a number card    
                    default: cardFaceValue = cardNumber + "";
                        break;  //end of numer facevalue
                    
                }   //end switch statement to determine face value
                
                //displays the result of the card you drew
                System.out.println("You drew the "+cardFaceValue+" of "+suit+'!');

                //System.out.println("That's for picking a card!");
                            
                break;  //end of picking a card case
                
            //displays the result if a person did not input a valide one letter code  
            default: System.out.println("You did not input a valid one letter code.");
                
        }   //end promptedCharacter switch
        
        }   //end if statement for detecting 1 character
        else{
            System.out.println("You did not enter one character.");
            return;
            
        }   //end else statement for detecting one character
        
        
        
        
        
        
    }   //end main method
    
}   //end class
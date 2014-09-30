////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//hw05
//Burger King Java Program
    //~description of program~
    /*This program prompts the user to enter a characters from given lists to 
    successfully order a burger, drink, or fries.
    */
    
//import scanner to program
import java.util.Scanner;

//add class
public class BurgerKing{
    
    //add main method
    public static void main(String[ ] args){
        
        //add scanner to main method
        Scanner myScanner = new Scanner(System.in);
        
        
        
        //display prompt for user to enter value
        System.out.println("Welcome to Burger King! Our menu is as follows:");
        System.out.println("\t Burger (B or b)");
        System.out.println("\t Soda (S or s)");
        System.out.println("\t French Fries (F or f)");
        System.out.print("Please enter a corresponding character for what you desire: ");
        
        //variable containing the prompted entry
        String firstItemChosen = myScanner.nextLine();
        
        //variable determining correct or incorrect prompted entry
        char BbSsFf = firstItemChosen.charAt(0);
        
        
        //if statement that detects whether or not input is greater than one character
        if(firstItemChosen.length()==1){
            
            //switch statement for when one character is inputted
            switch(BbSsFf) {
                
                //if B or b is entered:
                case 'B':
                case 'b':
                    
                    //display of prompt for what to put into burger
                    System.out.println("What would you like in your burger?");
                    System.out.println("\t -cheese (enter C or c)");
                    System.out.println("\t -bacon (enter N or n)");
                    System.out.println("\t -onions (enter O or o)");
                    System.out.println("\t -tomatoes (enter T or t)");
                    System.out.println("\t -lettuce (enter L or l)");
                    System.out.println("\t -pickles (enter P or p)");
                    System.out.println("\t -all of the above (enter A or a)");
                    System.out.println("\t -nothing (enter X or x)");
                    System.out.print("Please enter a corresponding character(s) for what you desire: ");
                    
                    //variable for user to enter what they want in their burger
                    String fixIns = myScanner.nextLine();
                   
                    //this variable stores the character entered
                    char multFixIns = fixIns.charAt(0);
                  
                    //defined chosenFixIn for use in the switch    
                    String chosenFixIn = "";
                    
                    //switch to determine fix in in sandwich
                    switch(multFixIns){
                        
                        //case if A or a is entered
                        case 'A':
                        case 'a':
                            chosenFixIn = "everything in it";
                            break;
                        
                        //case if X or x is entered
                        case 'X':
                        case 'x':
                            chosenFixIn = "nothing extra";
                            break;
                        
                        //case if C or c is entered
                        case 'C':
                        case 'c':
                            chosenFixIn = "cheese";
                            
                            break;
                        
                        //case if N or n is entered    
                        case 'N':
                        case 'n':
                            chosenFixIn = "bacon";
                            
                            break;
                        
                        //case if O or o is entered    
                        case 'O':
                        case 'o':
                            chosenFixIn = "onions";
                            break;
                       
                        //case if T or t is entered    
                        case 'T':
                        case 't':
                            chosenFixIn = "tomatoes";
                            break;
                        
                        //case if L or l is entered    
                        case 'L':
                        case 'l':
                            chosenFixIn = "lettuce";
                            break;
                        
                        ////case if P or p is entered    
                        case 'P':
                        case 'p':
                            chosenFixIn = "pickles";
                            break;
                        
                        //what happens if the previous letters are not detected    
                        default:
                            System.out.println("You did not enter a valid fix-in character.");
                            return;
               
                    }   //end for fix in switch
                    
                    //displays to user the burger and fix in(s) they entered
                    System.out.println("You ordered a burger with "+chosenFixIn+'.');
      
                    break;  //break for burger condition
                
                //if S or s is entered:    
                case 'S':
                case 's':
                    
                    //display of prompt for what soda the user wants
                    System.out.println("What soda would you like?");
                    System.out.println("\t -Barq's Root Beer (enter B or b)");
                    System.out.println("\t -Coca-Cola (enter C or c)");
                    System.out.println("\t -Diet Coke (enter D or d)");
                    System.out.println("\t -Orange Fanta (enter O or o)");
                    System.out.print("Please enter a corresponding character(s) for what you desire: ");
                    
                    //variable for user to enter what they want in their burger
                    String soda = myScanner.nextLine();
                   
                   
                    //variable determining correct or incorrect prompted entry
                    char chosenSoda = soda.charAt(0);
                  
                    //defined mySoda for later use in switch    
                    String mySoda = "";
                    
                    //switch to determine soda
                    switch(chosenSoda){
                        
                        
                        //case if B or b is entered
                        case 'B':
                        case 'b':
                            mySoda = "Barq's Root Beer";
                            break;
                        
                        
                        //case if D or d is entered
                        case 'D':
                        case 'd':
                            mySoda = "Diet Coke";
                            break;
                        
                        //case if C or c is entered
                        case 'C':
                        case 'c':
                            mySoda = "Coca-Cola";
                            
                            break;
                        
                        //case if O or o is entered    
                        case 'O':
                        case 'o':
                            mySoda = "Orange Fanta";
                            break;

                        //case if none of the above in the switch are entered   
                        default:
                            System.out.println("You did not enter a valid soda character.");
                            return;
                            
                    }   //end swtich for determined soda
                    
                    
                    //displays prompt for user to select size
                    System.out.println("What size would you like?");
                    System.out.println("\t -small (enter S or s)");
                    System.out.println("\t -medium (enter M or m)");
                    System.out.println("\t -large (enter L or l)");
                    System.out.println("\t -extra large (enter X or x)");
                    System.out.print("Please enter a corresponding character(s) for what you desire: ");
                    
                     //variable for user to enter what they want in their burger
                    String sodaSize = myScanner.nextLine();
                   
                    //variable to detect letter/soda for switch
                    char chosenSize = sodaSize.charAt(0);
                  
                  
                    //defined mySodaSize for later use in the switch    
                    String mySodaSize = "";
                    
                    //switch for choosing size of soda
                    switch(chosenSize){
                        
                        //case after S or s is entered
                        case 'S':
                        case 's':
                            mySodaSize = "small";
                            break;
                        
                        //case after M or m is entered
                        case 'M':
                        case 'm':
                            mySodaSize = "medium";
                            break;
                        
                        //case after L or l is entered
                        case 'L':
                        case 'l':
                            mySodaSize = "large";
                            
                            break; 
                        
                        //case after X or x is entered    
                        case 'X':
                        case 'x':
                            mySodaSize = "extra large";
                            break;

                        //case if none of the above is entered   
                        default:
                            System.out.println("You did not enter a valid soda character.");
                            return;
                            
                    }   //end switch for soda size
                    
                    //displays to user the soda and its size they ordered
                    System.out.println("You ordered the "+mySodaSize+' '+mySoda+'.');
                    
    
                    break;  //break for soda cases
                
                //if F or f is entered:    
                case 'F':
                case 'f':
                    
                    //diplays prompt for user to enter the following fries sizes
                    System.out.println("What size French Fries would you like?");
                    System.out.println("\t -small (enter S or s)");
                    System.out.println("\t -large (enter L or l)");
                    System.out.println("\t -extra large, or \"bucket\" (enter B or b)");
                    System.out.print("Please enter a corresponding character(s) for what you desire: ");
                    
                     //variable for user to enter what they want in their burger
                    String friesSize = myScanner.nextLine();
                   
                    //variable used to detect correct character
                    char friesChosenSize = friesSize.charAt(0);
                  
                  
                    //definted myFriesSize for later use in string    
                    String myFriesSize = "";
                    
                    //switch for choosing size of soda
                    switch(friesChosenSize){
                        
                        //case after S or s is entered
                        case 'S':
                        case 's':
                            myFriesSize = "small";
                            break;
                        
                        //case after M or m is entered
                        case 'M':
                        case 'm':
                            myFriesSize = "medium";
                            break;
                        
                        //case after L or l is entered
                        case 'L':
                        case 'l':
                            myFriesSize = "large";
                            
                            break;
                        
                        //case after B or b is entered    
                        case 'B':
                        case 'b':
                            myFriesSize = "bucket of";
                            break;

                        //case if none of the above is entered    
                        default:
                            System.out.println("You did not enter a valid character.");
                            return;
                            
                    }   //end fries size switch statement
                    
                    //displays the size of fries the user ordered
                    System.out.println("You ordered the "+myFriesSize+" fries.");
                    
                    break;  //end of fries case
                
                //what happens if B,b,S,s,F, or f is not entered.    
                default: System.out.println("You did not enter a valid character.");
                    return;
            }   //end of BbSsFf switch
            
            
            }   //end if statement for character ≥1
            
            //else statement accounts for more than one character being entered
            else{
                System.out.println("You did not enter 1 character.");
                return;
            }   //end else statement
      
     
    }   //end main method
    
    
}   //end class
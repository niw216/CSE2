/////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//Lab04
//Big Mac Again Java Program
//~description of program~
    /*this program calculates the cost of a big mac and French fries with tax
    The scanner class is used to allow the user to enter how many Big Macs he or
    she wants and if the person would like fries with their order.  If statements
    are used here to allow the program to compute the cost, based on the 
    decision of the user.*/
    
    
//first must import scanner to program
import java.util.Scanner;


/* >>once scanner imported now can use it in program,
     now add class and main method!<< */
    
    
//defined class as BigMacAgain
public class BigMacAgain {
    
    //added main method
    public static void main(String[ ] args) {
    
    //created a scanner in the program, AFTER importing the 
    //necessary "tools" to have scanner available
    Scanner myScanner = new Scanner(System.in);
    
    
    //declared variables
    
    //cost of Big Mac and Fries (constants)
    final double bigMacPrice=2.22;
    final double priceOfFries=2.15;
    
    
    
    //displays cost of Big Mac and prompt for user to enter quantity of Big Macs
    System.out.println("Big Macs cost $"+bigMacPrice+ "each.");
    System.out.print("Enter number of Big Macs (an integer > 0): ");
    
    //defined integer (literally an integer in the mathematical sense) as 
    //number of big macs, where user can dictate number
  
    int nBigMacs = myScanner.nextInt ( );
    
    
    //IF STATEMENTS
    
    //number of big macs if statement
    if(nBigMacs>0){     //(beginning nBigMacs if statement) 
        System.out.print("Do you want french fries? (enter Y/y/N/n): ");
        
       
            //defined variable that allows user to enter Y,y,N, or n for response
            String YesNoFf =myScanner.next();  
            
            //displays cost of French fries and adds cost to total bill, given 
            //that the user wants fries
            if ((YesNoFf.equals("Y"))||(YesNoFf.equals("y"))){
                //(beginning of if statment YesNoFf)
                System.out.println("French fries cost $2.15.");
                double frenchFriesCost = priceOfFries;
               
                
            } //end if statement YesNoFf
            
                //displays no fries with order and doesn't include cost of fries
                //given the user doesn't want them
                else if((YesNoFf.equals("N"))||(YesNoFf.equals("n"))){
                    //(beginning else if statement YesNoFf)
                        System.out.println("No fries with order.");
                }   //end else if statement YesNoFf
                
                
                //stops the program if the user enters something besides Y,y,N,n
                else{
                    System.out.println("You did not enter Y/y/N/n");
                    return;
                }   //end YesNoFf else statement            
        
       
        //mathematical equations
        double totalCostBigMac=nBigMacs*bigMacPrice;    //total cost of big macs
        double costOfFries=priceOfFries;                //cost of fries
        double subtotal=totalCostBigMac+costOfFries;    //sum of fries & big mac 
                                                        //cost
        final double tax_rate=6;                    //percent tax rate assumed
        double taxIncurred=subtotal*(tax_rate/100);     //monetary amount of tax
        double grandTotal=subtotal+taxIncurred;     //total cost including tax
        
        
        //truncating decimal points section (new variables defined for the
        //numbers greater than 0, digit in the tenths place, and digit in 
        //hundrdths place.)
        int totalCostBigMacDollars = (int)totalCostBigMac;
        int totalCostBigMacDimes = (int)(totalCostBigMac*10)%10;
        int totalCostBigMacPennies = (int)(totalCostBigMac*100)%10;
        
        int taxIncurredDollars = (int)taxIncurred;
        int taxIncurredDimes = (int)(taxIncurred*10)%10;
        int taxIncurredPennies = (int)(taxIncurred*100)%10;
        
        int subtotalDollars = (int)subtotal;
        int subtotalDimes = (int)(subtotal*10)%10;
        int subtotalPennies = (int)(subtotal*100)%10;
        
        int grandTotalDollars = (int)grandTotal;
        int grandTotalDimes = (int)(grandTotal*10)%10;
        int grandTotalPennies = (int)(grandTotal*100)%10;
        
        
        
        //displays total cost of big macs, subtotal, tax, and grand total
        System.out.println("The total cost of Big Mac(s) is $"
            +totalCostBigMacDollars+'.'+totalCostBigMacDimes+
            totalCostBigMacPennies+'.');
        System.out.println("The total cost of Big Mac(s) and fries is $" 
            +subtotalDollars+'.'+subtotalDimes+subtotalPennies+'.');
        System.out.println("The amount of tax incurred is $" 
            +taxIncurredDollars+'.'+taxIncurredDimes
            +taxIncurredPennies+'.');
        System.out.println("The grand total of your order is $"
            +grandTotalDollars +'.'+grandTotalDimes+grandTotalPennies
            +'.');

     
            
    }   //end big mac if statement
        
        //if user enters 0 for number of big macs, the following message is 
        //displayed and the program quits
        else if(nBigMacs==0){
            //(beginning of else if nBigMacs statement)
            System.out.println("You did not enter an int>0.");
            return;
        }   //end else if nBigMacs statement
        
        /*
        else if(nBigMacs!=0){
            System.out.println("You did not enter an int.");
            return;
        }*/
        
        //stops program if user doesn't enter an integer
        else{
            System.out.println("You did not enter an int");
            return; //leaves the program (program terminates)
        } //end else statement of big mac if


    }   //end main method
    
}   //end class

////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//lab06
//Enigma0 program
//description: debug program & comment on diagnosis at end of program

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{
    
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    //debug problem with n changed here as follows:
    int n = 0;  //initialize n within scope of main method, but outside of everything
                //else to make it accessible for all parts of the program
    if(scan.hasNextInt()){
      /*int*/ n=scan.nextInt();  //eliminate shadow of n
      System.out.println("You entered "+n);
    }
    else{
      /*int*/ n=4; //eliminate shadowing n
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;//,n;eliminate shadowing of n
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them:
        Since n was initialized in the scope of the else statement, 
        it could not be called by any other part outside of the scope.
        The comment above explains the solution.
 */


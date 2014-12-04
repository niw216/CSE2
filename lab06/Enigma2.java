////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//lab06
//Enigma2 program
//description: debug program & comment on diagnosis at end of program

import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;/* /0; The only way to stop this error is to remove the divide by zero*/
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *  
 *      By looking at the error, the compiler tells you that the error is a divide by
 * zero error and in the last line tells you that error occured in the main method at
 * line 15.
 * 
 */


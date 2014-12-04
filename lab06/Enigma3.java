////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//lab06
//Enigma3 program
//description: debug program & comment on diagnosis at end of program

/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    System.out.println(k+" --1");
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3; 
          k-=7; 
    }
    System.out.println(k+" --2");

    if(n*k%12< 12){
      n-=20; 
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45; 
      out+=n+k;
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
    System.out.println(k+" --3");
        break;
      case 97:
        n-=14;
        k-=2;
    System.out.println(k+" --4");
        break;
      case 98:
        n/=5;
        k/=9;
    System.out.println(k+" --5");
      default:
        n-=3;   
        k-=5;   
    System.out.println(k+" --6");
    }
     out+=1/n;// + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 *  I first tested if the runtime error was due to both n and k or just one.
 *  I then found that k is the responsible variable for the divide by zero runtime error.
 *  I have inserted println functions with labelled checkpoints to see where the zero
 *  occurs.  From my investigation the zero comes about at checkpoint 6 or --6.
 *  I have left the 1/k part of the out string commented out to prevent the runtime error
 *  from occuring.  Changes to the program will need to be made if the divide by zero erro
 *  is to be resolved beside complete removal from the algorithm.
 */



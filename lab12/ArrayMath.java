////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//lab12
//Array Math Java Program
//description of program
    /*This program takes double arrays and uses the method addArrays to sum the
    two, equals to see if each array is equal in value and size to each other, and
    display to show the arrays.
    */
    
    
//import scanner
import java.util.Scanner;
//add class
public class ArrayMath {
    public static void main(String[] arg) {
        double x[] = {2.3, 3, 4, -2.1, 82, 23},
            y[] = {2.3, 3, 4, -2.1, 82, 23}, 
            z[] = {2.3, 13, 14},
            w[] = {2.3, 13, 14, 12},
            v[],
            u[] = {2.3, 12, 14};
        v = addArrays(x, y);
        System.out.println(display(x)+" \n + " + display(y) + "\n= " +display(v));
        System.out.println(display(x) + "\n +" + display(z) + "\n =" +display(addArrays(x,z)));
        System.out.println("It is " + equals(x,y) + " that " + display(x) + " == " + display(y));
        System.out.println("It is " + equals(z,w) + " that " + display(z) + " == " + display(w));
        System.out.println("It is " + equals(u,z) + " that " + display(u) + " == " + display(z));
    }
            
        
    public static String display(double[] x) {
        String out = "{";
        for (int j = 0; j < x.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += x[j];
        }
        return out + "}";
    }


    
    public static boolean equals (double[] one, double[] two) {
        //for (double counter: one) {
        boolean test = false;
        int testNum = 0;
        if (one.length != two.length) {
            return false;
        }
        else {
            for (int counter = 0; counter < one.length; counter++) {
                if (one [counter] == two [counter]) {
                    testNum++;
                }
            }
        }
        if (one.length%testNum == 0) {
            test = true;
        }   
        else {
            test = false;
        }
        return test;
    }
    
    public static double[] addArrays (double[] one, double[] two) {
        double[] result = new double [1];
        if (one.length != two.length) {
            if (one.length > two.length) {
                double[] temp = new double [one.length];
                for (int counter = 0; counter < (one.length/* - two.length*/); counter++) {
                    if(counter < two.length) {
                        temp[counter] = two[counter];
                    }
                    else {
                    temp[counter] = 0;
                    }
                }
                double[] sum = new double[one.length];
                result  = new double[one.length];
                for (int counter = 0; counter < temp.length; counter++) {
                    sum[counter] = one[counter] + temp[counter];
                }
                result = sum;
            }
            else if(one.length < two.length) {
                double[] temp = new double [two.length];
                for (int counter = 0; counter < (two.length/* - one.length*/); counter++) {
                    if (counter < one.length) {
                        temp[counter] = one[counter];
                    }
                    else {
                    temp[counter] = 0;
                    }
                }
                double[] sum = new double[two.length];
                result  = new double[two.length];
                for (int counter = 0; counter < two.length; counter++) {
                    sum[counter] = two[counter] + temp[counter];
                }
                result = sum;
            }
        }
        else {
            double[] sum = new double [two.length];
            result = new double [two.length];
            for (int counter = 0; counter < two.length; counter++) {
                    sum[counter] = two[counter] + one[counter];
            }
            result = sum;
        }
        return result;
    }
}
    

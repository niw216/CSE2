////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//lab10
//Method Calls Java program


//add class
public class MethodCalls{
    //addDigit method takes an integer digit and puts it in front of an integer number; negative values
        //are carried through the process (e.g. if putting digit 5 on number -90, you'll get -590.)
    public static int addDigit (int number, int digit) {
        //booleans used to detect negative numbers
        boolean numberNeg = number < 0,
            digitNeg = digit < 0;
        //if statement to remove negative from number
        if (numberNeg) {
            //removes negativity
            number /= -1;
        }
        //if statement to remove negative from digit
        if (digitNeg) {
            //removes negativity
            digit /= -1;
        }
        //casts variables number & digit into a string
        String _number = "" + number,
            _digit = "" + digit;
        //string in which digit is added to number
        String addedDigit = _digit + _number;
        //the string is turned back into an integer
        int _addedDigit = Integer.parseInt(addedDigit);   
        //if statement for accounting for initial negative sign
        if (numberNeg) {
            _addedDigit /= -1;
        }
        //if statement for accounting for inital negative sign
        if (digitNeg) {
            _addedDigit /= -1;
        }
        //spits out/returns _addedDigit
        return _addedDigit;
    }
    //join method takes number1 and puts it infront of number2; negative values are carried
        //through the process similarly to the addDigit method
    public static int join (int number1 , int number2) {
        //use addDigit method to join the two numbers together
        int joinedNumber = addDigit (number2 , number1);
        //spits out the joined number
        return joinedNumber;
    }
    //added main method
    public static void main(String []  arg){
        //values for which the variables are assigned
        int a=784,b=22,c;
        //use addDigit method to add 3 to 3784
        c=addDigit(a,3);
        //displays the result of the method used in the above line
        System.out.println("Add 3 to "+a+" to get "+c);
        //use addDigit method to first add 4 to c, then add 5 to the number formed previously
        c=addDigit(addDigit(c,4),5);
        //displays the results of the line of code above
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        //displays what happens when 3 is added to -98
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        //uses the join method to splice a to b.
        c=join(a,b);
        //displays the results of joining a to b
        System.out.println("Join "+a+" to "+b+" to get "+c);
        //displays the results of joining 87 to 42 to 83
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        //displays the results of joining -9 to -90
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
}  

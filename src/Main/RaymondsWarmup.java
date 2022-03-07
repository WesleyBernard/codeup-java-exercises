package Main;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class RaymondsWarmup {
    public static void main(String[] args) {
//        shouldWakeUp (true, 1);
//
//            shouldWakeUp (false, 2);
//
//            shouldWakeUp (true, 8);
//
//            shouldWakeUp (true, -1);
//        shouldWakeUp(true, 1);
//        shouldWakeUp(false, 2);
//        shouldWakeUp(true, 8);
//        shouldWakeUp(true, -1);
//        shouldWakeUp(true, 0);
//        shouldWakeUp(true, 44);
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));


    }
//    We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
//
//    Write a method shouldWakeUp that has 2 parameters.
//
//1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
//2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
//
//    We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
//
//    In all other cases return false.
//
//    If the hourOfDay parameter is less than 0 or greater than 23 return false.
//
//    Examples of input/output:
//
//            * shouldWakeUp (true, 1); → should return true
//
//            * shouldWakeUp (false, 2); → should return false since the dog is not barking.
//
//            * shouldWakeUp (true, 8); → should return false, since it's not before 8.
//
//            * shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.
//
//
//    TIP: Use the if else statement with multiple conditions.
//
//    NOTE: The shouldWakeUp method  needs to be defined as public static like we have been doing so far in the course.
//
//    NOTE: Do not add a  main method to solution code.
//    SOLUTION
//    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//        if (hourOfDay < 0 || hourOfDay > 23) {
//            System.out.println("false");
//          return false;
//        }else if (barking == true && (hourOfDay < 8 || hourOfDay > 22)){
//            System.out.println("true");
//            return true;
//        }
//        System.out.println("false");
//        return false;
//    }
//    SOLUTION
//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//    The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
//
//
//    EXAMPLES OF INPUT/OUTPUT:
//
//            * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
//
//            * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
//
//* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
//
//            * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
//
//
//    TIP: Use paper and pencil.
//
//    TIP: Use casting.
//
//    NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
//    NOTE: Do not add a  main method to solution code.
//    SOLUTION
public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
    DecimalFormat df = new DecimalFormat("#.###");
    df.setRoundingMode(RoundingMode.DOWN);

    return df.format(firstNumber).equals(df.format(secondNumber));
}

}

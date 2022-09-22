package Main;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println(addition(5,17));
//        System.out.println(subtraction(5,17));
//        System.out.println(division(16,4));
//        System.out.println(multiplication(7,8));
//
//        myRange(1,10);
//
//        factorials();

//        diceRoller();
        String mystr =  shout("whatever I want");
        System.out.println(mystr);



    }
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int division(int num1, int num2){
        return num1 / num2;
    }
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public static int myRange(int minNum, int maxNum){
        System.out.printf("Insert a number between %s and %s ",minNum, maxNum);
        int userInput = input.nextInt();
        if(userInput >= minNum && userInput <= maxNum){
            System.out.printf("Thanks for following my instructions, you input: %d%n",userInput);
            return userInput;
        }else{
            System.out.println("That wasn't in the specified range, try again.");
            return myRange(minNum,maxNum);
        }

    }
    public static long factorialize(long num){
        long factorial = 1;
        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void factorials(){
            System.out.print("Let's see some factorials ");
            long userInput = myRange(1,20);
                long factorial = factorialize(userInput);
                System.out.println("here's the factorial, I guess...");
                System.out.print(factorial + "\n");
                System.out.println("want another one? It'll still have to be between 1 and 10..... [y/n] ");
                input.nextLine();
                String repeat = input.nextLine();
                if(repeat.equals("y")){
                    factorials();
                }else{
                    System.out.println("See ya later, have fun with the dice roller!");
                }

        }

        public static void roll(int sides){
            for (int i = 1; i <= 2; i++) {
                System.out.printf("Dice number %s: ",i);
                System.out.println((int)((Math.random()* sides) + 1));
            }
        }

        public static void rollValidation(){
            System.out.print("Type \"Roll\" to roll the dice. ");
            String letsRoll = input.next();
            input.nextLine();
            if(!(letsRoll.equalsIgnoreCase("roll"))){
                System.out.println("I do believe I said to type \"Roll\"....It's not even case sensitive");
                rollValidation();
            }
        }

        public static void diceRoller(){
//            System.out.print("Good day to you, let's roll some dice. How many sides would you like on these dice? Let's keep it between 2 and 20, for now. ");
//            int sides = myRange(2,20);
            System.out.print("Let's roll some dice. How many sides would you like on these dice? ");
            int sides = input.nextInt();
            System.out.printf("%d sides, huh? Very well then, let's begin \n",sides);
            rollValidation();
            roll(sides);
            System.out.print("Would you like to keep playing? [y/n] ");
            String replay = input.next();
            if(replay.equals("y")){
                diceRoller();
            }
        }

        public static String shout(String str) {
        return str.toUpperCase() + "!!!";
        }

}

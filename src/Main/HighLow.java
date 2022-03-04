package Main;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        highOrLow();

    }

//    public static int highOrLowHardMode(){
//        Scanner input = new Scanner(System.in);
//        int ourNumber = (int)(Math.random() * 100) + 1;
//        System.out.println(ourNumber);
//        System.out.print("Guess the number I have in my variable! The number will change after each guess, so you don't have a very high chance... ");
//        int guess = input.nextInt();
//        if(guess < ourNumber){
//            System.out.println("Higher!");
//            highOrLowHardMode();
//        }else if(guess > ourNumber){
//            System.out.println("Lower!");
//            highOrLowHardMode();
//        }
//        else if(guess == ourNumber){
//            System.out.println("You got it! Good guess! UwU");
//        }
//        return ourNumber;
//    }

    public static int highOrLow(){
        Scanner input = new Scanner(System.in);
        int ourNumber = (int)(Math.random() * 100 +1);
        System.out.print("Guess the number I have in my variable! ");
        int guess = input.nextInt();
        do {
            if(guess > ourNumber){
                System.out.println("Lower!");
                guess = input.nextInt();
            }else if(guess < ourNumber){
                System.out.println("Higher!");
                guess = input.nextInt();
            }
        }while (guess != ourNumber);
        System.out.println("You got it! Good guess!");
        return ourNumber;
    }
}

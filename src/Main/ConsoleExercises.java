package Main;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("I'm doing the thingL %.2f\n", pi);
        System.out.println("pls insert an integer");
        int userInt = input.nextInt();
        input.nextLine();
        System.out.println("Please type for me");
//        String wordOne = input.next();
//        String wordTwo = input.next();
//        String wordThree = input.next();
//        System.out.printf("Here's what you typed: %s %s %s", wordOne, wordTwo, wordThree);
        String words = input.nextLine();
        System.out.printf("Here's what you just typed: %s%n", words);
//        System.out.println("Please enter the length and width of your classroom seperated by a space. Round to the nearest whole number");
//        int length = input.nextInt();
//        int width = input.nextInt();
//        int area = length * width;

        System.out.println("Please enter the length of your classroom as a whole number");
        int length =Integer.parseInt(input.nextLine()) ;
        System.out.println("Please enter the width of your classroom as a whole number");
        int width =Integer.parseInt(input.nextLine()) ;
        int area = length * width;

        int perimeter = (length * 2) + (width * 2);
        System.out.printf("The area of your classroom is: %d%n", area);

        System.out.printf("the perimeter of your classroom is: %d", perimeter);

    }
}

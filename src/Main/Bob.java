package Main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String talkToBob = "y";
        do {
            System.out.printf("What would you like to ask Bob? ");
            String response = input.nextLine();
            if (response.endsWith("?")) {
                System.out.println("Sure.");
            } else if (response.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (response.equals("")) {
                System.out.println("'Fine. Be that way!'");
            } else {
                System.out.println("whatever");
            }
            System.out.printf("Would you like to keep talking to Bob? (I wouldn't personally...) [y/n] ");
            talkToBob = input.nextLine();
        }while(talkToBob.equals("y"));
    }
}

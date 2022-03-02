package Main;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
//    }
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while (i <= 100);

//        int i = 100;
//    do {
//        System.out.println(i);
//        i -= 5;
//    }while (i >= -10);

//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        }while(i < 1000000);

//        for (long i = 2; i < 1000000 ; i*=i) {
//            System.out.println(i);
//        }
//        for (int i = 0; i <= 100; i++) {
//            if(i % 3 == 0 && (i % 5 == 0)){
//            System.out.println("fizzbuzz");
//        } else if(i % 3 == 0){
//               System.out.println("fizz");
//           }else if(i % 5 == 0) {
//                System.out.println("buzz");
//            } else{
//               System.out.println(i);
//           }
//        }
        Scanner input = new Scanner(System.in);



        String want = "no";
        do {
            System.out.print("What number would you like to go up to? ");
            long userInput = input.nextLong();
            input.nextLine();
            if (userInput > 0) {
                System.out.println("Number \t|Squared\t|Cubed\t");
                for (long i = 1; i <= userInput; i++) {
                    System.out.printf(i + "\t\t|" + i * i + "\t\t\t|" + i * i * i + "\n");

                }
                System.out.print("Would you like to continue? (y/n) ");
                want = input.next();

            }
        }while(!(want.equals("n")));
        String again = "n";
        do {

            System.out.printf("Please insert a grade between 0-100 ");
            int grade = input.nextInt();
            String theGrade = "the grade";
            if (grade >= 0 && grade <= 59) {
                theGrade = "F";
            } else if (grade >= 60 && grade <= 66) {
                theGrade = "D";
            } else if (grade >= 67 && grade <= 79) {
                theGrade = "C";
            } else if (grade >= 80 && grade <= 87) {
                theGrade = "B";
            } else if (grade >= 88 && grade <= 100) {
                theGrade = "A";
            }
            System.out.printf("Your grade is " + theGrade +"\n");
            System.out.printf("Would you like to insert another grade? y/n ");
            again = input.next();
        }while (again.equals("y"));

    }
}

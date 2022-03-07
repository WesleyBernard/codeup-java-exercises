package Util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    private String name;
    public Input(){
        this.name = "Scanny Boi";
        this.scanner = new Scanner(System.in);
    }
    public Input(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println(this.name);
    }
    public String getString(){
        System.out.print("Please input a string! UwU ");
        String theString = this.scanner.nextLine();
        System.out.println(theString);
        return theString;
    }
    public Boolean getBoolean(){
        System.out.print("Please enter \"y\" or \"yes\" to confirm! All other inputs will be read as \"false\" or \"no\" UwU ");
        String UserInput = this.scanner.next();
        if(UserInput.equalsIgnoreCase("y")||UserInput.equalsIgnoreCase("yes")){
            System.out.println("So true, besty");
            return true;
        }
        System.out.println("Couldn't be more false");
        return false;
    }
    public int getInt(int min, int max){
        int UserInput;
        do {
            System.out.printf("please input a INTEGER between %d and %d ",min, max);
            UserInput = this.scanner.nextInt();
        } while (UserInput > max || UserInput < min);
        System.out.println("thanks UwU");
        this.scanner.nextLine();
        return UserInput;
    }
    public int getInt(){
        System.out.print("Please input an INTEGER. UwU ");
        int userInput = this.scanner.nextInt();
        System.out.println("I'll keep that number in my pocket for ya!");
        return userInput;
    }
    public double getDouble(double min, double max){
        double UserInput;
        do {
            System.out.printf("please input a DOUBLE between %f and %f ",min, max);
            UserInput = this.scanner.nextDouble();
        } while (UserInput > max || UserInput < min);
        System.out.println("thanks UwU");
        this.scanner.nextLine();
        return UserInput;
    }
    public double getDouble(){
        System.out.print("Please enter a DOUBLE. UwU ");
        double userInput = this.scanner.nextDouble();
        System.out.println("I'll hold onto that for ya");
        return userInput;
    }
}

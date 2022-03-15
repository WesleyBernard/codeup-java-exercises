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
        this.scanner = new Scanner(System.in);
    }
    public void setName(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println(this.name);
    }
    public String getString(){
        return this.scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.print(prompt + "\n");
        return this.scanner.nextLine();
    }
    public Boolean getBoolean(){
        String UserInput = this.scanner.next();
        this.scanner.nextLine();
        return UserInput.equalsIgnoreCase("y") || UserInput.equalsIgnoreCase("yes");
    }
    public Boolean getBoolean(String prompt){
        System.out.printf("%s ", prompt);
        String UserInput = this.scanner.next();
        this.scanner.nextLine();
        return UserInput.equalsIgnoreCase("y") || UserInput.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max){
        int UserInput;
        do {
            UserInput = this.scanner.nextInt();
        } while (UserInput > max || UserInput < min);
        this.scanner.nextLine();
        return UserInput;
    }
    public int getInt(int min, int max, String prompt){
        int UserInput;
        try {
            do {
                System.out.printf("%s ", prompt);
                UserInput = Integer.parseInt(getString());
            } while (UserInput > max || UserInput < min);
            return UserInput;
        }catch (NumberFormatException e){
            System.out.println("That was not an integer, try again");
            return getInt(min, max, prompt);
        }
    }
    public int getInt(){
        try {
            return Integer.parseInt(getString());
        }catch (NumberFormatException e){
            System.out.println("That was not an integer, try again");
            return getInt();
        }
    }
    public int getInt(String prompt){
        System.out.printf("%s ", prompt);
        try {
            return Integer.parseInt(getString());
        }catch (NumberFormatException e){
            System.out.println("That was not an integer, try again");
            return getInt(prompt);
        }

    }
    public double getDouble(double min, double max){
        try {
            double UserInput;
            do {
                UserInput = Double.parseDouble(getString());
            } while (UserInput > max || UserInput < min);
            return UserInput;
        }catch (NumberFormatException e){
            System.out.println("That was not a Double, try again");
            return getDouble(min, max);
        }
    }
    public double getDouble(double min, double max, String prompt){
        try {
            double UserInput;
            do {
                System.out.print(prompt + " ");
                UserInput = Double.parseDouble(getString());
            } while (UserInput > max || UserInput < min);
            return UserInput;
        }catch (NumberFormatException e){
            System.out.println("That was not a Double, try again");
            return getDouble(min, max, prompt);
        }
    }
    public double getDouble(){
        try {
            return Double.parseDouble(getString());
        }catch (NumberFormatException e){
            System.out.println("That was not a Double, try again");
            return getDouble();
        }
    }
    public double getDouble(String prompt){
        try {
            System.out.print(prompt + " ");
            return Double.parseDouble(getString());
        }catch (NumberFormatException e){
            System.out.println("That was not a Double, try again");
            return getDouble(prompt);
        }
    }
    public void close(){
        this.scanner.close();
    }
}

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
        if(UserInput.equalsIgnoreCase("y")||UserInput.equalsIgnoreCase("yes")){
            System.out.println("So true, besty");
            return true;
        }
        System.out.println("Couldn't be more false");
        return false;
    }
    public Boolean getBoolean(String prompt){
        System.out.printf("%s %n", prompt);
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
        do {
            System.out.printf("%s ",prompt);
            UserInput = this.scanner.nextInt();
        } while (UserInput > max || UserInput < min);
        this.scanner.nextLine();
        return UserInput;
    }
    public int getInt(){
        int input = this.scanner.nextInt();
        this.scanner.nextLine();
        return input;
    }
    public int getInt(String prompt){
        System.out.printf("%s ", prompt);
        int input = this.scanner.nextInt();
        this.scanner.nextLine();
        return input;
    }
    public double getDouble(double min, double max){
        double UserInput;
        do {
            UserInput = this.scanner.nextDouble();
        } while (UserInput > max || UserInput < min);
        this.scanner.nextLine();
        return UserInput;
    }
    public double getDouble(double min, double max, String prompt){
        double UserInput;
        do {
            System.out.print(prompt + " ");
            UserInput = this.scanner.nextDouble();
        } while (UserInput > max || UserInput < min);
        this.scanner.nextLine();
        return UserInput;
    }
    public double getDouble(){
        double input =this.scanner.nextDouble();
        this.scanner.nextLine();
        return input;
    }
    public double getDouble(String prompt){
        System.out.print(prompt + " ");
        double input =this.scanner.nextDouble();
        this.scanner.nextLine();
        return input;
    }
    public void close(){
        this.scanner.close();
    }
}

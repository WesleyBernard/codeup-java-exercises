package Util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Input uwu = new Input();
        uwu.getString();
        uwu.getBoolean();
    }
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
}

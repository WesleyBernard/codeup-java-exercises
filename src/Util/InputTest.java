package Util;

public class InputTest {
    public static void main(String[] args) {
        Input uwu = new Input();
//        uwu.getString("pls enter a string");
//        uwu.getBoolean("Enter [y/n]");
//        uwu.getInt(10, 100, "Enter a number between 10 and 100");
//        uwu.getDouble("Please enter a double");
//        uwu.close();
//        uwu.getDouble();
//        System.out.println(Integer.valueOf("10011", 2));
        System.out.println(uwu.getBinary("10011"));
        System.out.println(uwu.getHex("F"));
//        System.out.println(Integer.valueOf("F",16));
//        System.out.println(Integer.toBinaryString(78));
    }
}

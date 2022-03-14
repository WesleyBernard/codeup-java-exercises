package groceryList;

import Util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApp {
    public static void main(String[] args) {
        Input uwu = new Input("OwO");
        ArrayList<HashMap> groceryList = new ArrayList<>();
        HashMap<String, Integer> produce = new HashMap<>();
        HashMap<String ,Integer> dairy = new HashMap<>();
        HashMap<String ,Integer> seafood = new HashMap<>();
        HashMap<String ,Integer> pantry = new HashMap<>();
        groceryList.add(produce);
        groceryList.add(dairy);
//        groceryList.get(groceryList.indexOf(produce)).put("onions", 8);
//        System.out.println(groceryList);
//        produce.put("carrots", 4);
//        System.out.println(groceryList);
//
//        dairy.put("greek yogurt", 5);
//        System.out.println(groceryList);
//        System.out.println("Displaying dairy category....");
//        System.out.println(groceryList);
        Boolean finalizeList = false;
        do {
            String userInput = uwu.getString("Welcome to your grocery list, would you like to add an item? [y/n]");
            if (userInput.equalsIgnoreCase("y")){
                System.out.println("Please select a category");
                userInput = uwu.getString("[produce] [dairy] [seafood] [pantry]");
            }
            if (userInput.equalsIgnoreCase("produce")){
                produce.put(uwu.getString("please enter Item"), uwu.getInt("please enter quantity"));
            }
            if (userInput.equalsIgnoreCase("dairy")){
                dairy.put(uwu.getString("please enter Item"), uwu.getInt("please enter quantity"));
            }
            if (userInput.equalsIgnoreCase("pantry")){
                pantry.put(uwu.getString("please enter Item"), uwu.getInt("please enter quantity"));
            }
            if (userInput.equalsIgnoreCase("seafood")){
                seafood.put(uwu.getString("please enter Item"), uwu.getInt("please enter quantity"));
            }
            else{
                System.out.println(groceryList);
            }
            finalizeList = uwu.getBoolean("Finalize list? [y/n]");
        } while (!finalizeList);
    }
//    public static void addItem(HashMap<String, Integer> category){
//        category.put()
//    }

}

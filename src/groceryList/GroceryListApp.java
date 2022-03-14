package groceryList;

import Util.Input;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroceryListApp {
    public static void main(String[] args) {
        Input uwu = new Input("OwO");
        ArrayList<Map> groceryList = new ArrayList<>();
        HashMap<String, Integer> produce = new HashMap<>();
        HashMap<String ,Integer> dairy = new HashMap<>();
        HashMap<String ,Integer> seafood = new HashMap<>();
        HashMap<String ,Integer> pantry = new HashMap<>();
//        groceryList.add(produce);
//        groceryList.add(dairy);
//        groceryList.add(seafood);
//        groceryList.add(pantry);
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
        if(uwu.getBoolean("Would you like to make a grocery list? ")) {
            do {
                String userInput = uwu.getString("Would you like to add an item? [y/n]");
                if (userInput.equalsIgnoreCase("y")) {
                    System.out.println("Please select a category");
                    userInput = uwu.getString("[produce] [dairy] [seafood] [pantry]");
                }
                if (userInput.equalsIgnoreCase("produce")) {
                    produce.put(uwu.getString("please enter Item"), uwu.getInt("please enter quantity"));
                }
                if (userInput.equalsIgnoreCase("dairy")) {
                    dairy.put(uwu.getString("please enter Item"), uwu.getInt("please enter quantity"));
                }
                if (userInput.equalsIgnoreCase("pantry")) {
                    pantry.put(uwu.getString("please enter Item"), uwu.getInt("please enter quantity"));
                }
                if (userInput.equalsIgnoreCase("seafood")) {
                    seafood.put(uwu.getString("please enter Item"), uwu.getInt("please enter quantity"));
                }
                finalizeList = uwu.getBoolean("Finalize list? [y/n]");
                if (finalizeList) {
                    Map<String, Integer> sortedProduce = new TreeMap<>(produce);
                    Map<String, Integer> sortedseafood = new TreeMap<>(seafood);
                    Map<String, Integer> sortedPantry = new TreeMap<>(pantry);
                    Map<String, Integer> sortedDairy = new TreeMap<>(dairy);
                    if(!sortedProduce.isEmpty()) {
                        groceryList.add(sortedProduce);
                    }
                    if(!sortedDairy.isEmpty()) {
                        groceryList.add(sortedDairy);
                    }
                    if(!sortedseafood.isEmpty()) {
                        groceryList.add(sortedseafood);
                    }
                    if(!sortedPantry.isEmpty()) {
                        groceryList.add(sortedPantry);
                    }
                    System.out.println(groceryList);
                }
            } while (!finalizeList);
        }
    }
//    public static void addItem(HashMap<String, Integer> category){
//        category.put()
//    }

}

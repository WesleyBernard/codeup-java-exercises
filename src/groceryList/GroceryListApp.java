package groceryList;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApp {
    public static void main(String[] args) {
        ArrayList<HashMap> groceryList = new ArrayList<>();
        HashMap<String, Integer> produce = new HashMap<>();
        HashMap<String ,Integer> dairy = new HashMap<>();
        HashMap<String ,Integer> seafood = new HashMap<>();
        HashMap<String ,Integer> pantry = new HashMap<>();
        groceryList.add(produce);
        groceryList.add(dairy);
//        groceryList.get(groceryList.indexOf(produce)).put("onions", 8);
        System.out.println(groceryList);
        produce.put("carrots", 4);
        System.out.println(groceryList);

        dairy.put("greek yogurt", 5);
        System.out.println(groceryList);
        System.out.println("Displaying dairy category....");
        System.out.println(groceryList);
    }
}

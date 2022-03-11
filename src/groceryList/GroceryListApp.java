package groceryList;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApp {
    public static void main(String[] args) {
        ArrayList<HashMap> groceryList = new ArrayList<>();
        HashMap<String, Integer> produce = new HashMap<>();
        groceryList.add(produce);
        groceryList.get(groceryList.indexOf(produce)).put("onions", 8);
        System.out.println(groceryList);
        produce.put("carrots", 4);
        System.out.println(groceryList);
        HashMap<String, Integer> dairy = new HashMap<>();
        groceryList.add(dairy);
        dairy.put("greek yogurt", 5);
        System.out.println(groceryList);
        System.out.println("Displaying dairy category....");
        System.out.println(groceryList);
    }
}

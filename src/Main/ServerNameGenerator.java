package Main;

import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String [] adjs = new String[]{"Spicy", "Frosty", "Annoying", "Persistent", "Uncanny", "Thicc", "Stout", "Obtuse", "Almost", "Slimey"};
        String [] nouns = new String[]{"Building", "Duck", "Closet", "Toilet", "Staircase", "Library", "Soup", "Ice", "Bonfire", "Protagonist"};
        String nameAdj = randomIndex(adjs);
        String nameNoun = randomIndex(nouns);
        System.out.printf("Random server name is: %s-%s", nameAdj, nameNoun);

    }
    public static String randomIndex(String[] starray){
        Random random = new Random();
        int index = random.nextInt(10);
        System.out.println(index);
        return starray[index];
    }

}

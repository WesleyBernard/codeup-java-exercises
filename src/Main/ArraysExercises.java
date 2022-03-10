package Main;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        Person[] people = new Person[3];
        people[0] = new Person("Papyrus");
        people[1] = new Person("Sans");
        people[2] = new Person("WindDings");
        for(Person person : people){
            System.out.println(person.getName());
        }
        Person[] dffArray = addPerson(people, new Person("Inpact"));
        for(Person person : dffArray){
            System.out.println(person.getName());
        }
    }
    public static Person[] addPerson(Person[] Parray,Person Person){
        Person[] diffArray = Arrays.copyOf(Parray, Parray.length+1);
        diffArray[diffArray.length-1] = Person;
        return diffArray;
    }
}

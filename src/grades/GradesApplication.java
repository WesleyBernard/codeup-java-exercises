package grades;

import Util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();
        Student wesley = new Student("Wesley");
        wesley.addGrade(100);
        wesley.addGrade(79);
        wesley.addGrade(96);
        Student raymond = new Student("Raymond");
        raymond.addGrade(100);
        raymond.addGrade(85);
        raymond.addGrade(99);
        Student emilio = new Student("Emilio");
        emilio.addGrade(87);
        emilio.addGrade(69);
        emilio.addGrade(91);
        Student irvin = new Student("Irvin");
        irvin.addGrade(100);
        irvin.addGrade(82);
        irvin.addGrade(98);
        students.put("wesleyIsMoreCrackedThanRaymond", wesley);
        students.put("shouldReallyJustBeAnInstructor", raymond);
        students.put("ranchWater>Java", emilio);
        students.put("tooRich4Dis", irvin);
        System.out.println("Hello! Here are the usernames of our students!");
        System.out.println(students.keySet());
        boolean again = true;
        do {
            String key = input.getString("Which student would you like to see more of? ");
            displayStudentInfo(students, key);
            String repeat = input.getString("Would you like to look at another student? [y/n]");
            if (repeat.equals("n")){
                again = false;
            }
        } while (true);

    }
    public static void displayStudentInfo(HashMap<String, Student> studentMap, String key){
        if(studentMap.containsKey(key)){
            System.out.printf("Name: %s - Github Username: %s\n Current Average: %s\n",studentMap.get(key), key,studentMap.get(key).getGradeAverage());
        }else{
            System.out.println("There's no student with that username");
        }
    }
}

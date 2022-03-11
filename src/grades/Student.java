package grades;

import java.util.ArrayList;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Student {
    public static void main(String[] args) {
        Student wesley = new Student("Wesley");
        wesley.addGrade(100);
        wesley.addGrade(97);
        wesley.addGrade(88);
        wesley.addGrade(100);
        System.out.println(wesley.getName());
        System.out.println(wesley.getGradeAverage());
    }
    private String name;
    private ArrayList<Integer> grades;
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public String  getGradeAverage(){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        double grades = 0;
        double total = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            total += this.grades.get(i);
            grades++;

        }
        grades = total/grades;
        return df.format(grades);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

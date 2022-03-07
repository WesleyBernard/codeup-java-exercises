package Main;

public class Person {
    public static void main(String[] args) {
        Person Wesley = new Person();
        Wesley.setName("Wesley");
        System.out.println(Wesley.getName());
        Wesley.sayHello();
    }
    private String name;

    public String getName(){
        return this.name;

    }

    public void setName(String name){
        this.name = name;

    }
    public void sayHello(){
        System.out.printf("%s says hello!", this.name);
    }
}


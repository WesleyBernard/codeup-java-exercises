package WarmUps;

public class Roommate {
    private String name;
    private int age;
    private String occupation;

    public Roommate(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    public void sayHi(){
        System.out.printf("%s says hello! \n", this.name);
    }
    public void work(){
        System.out.printf("%s has is busy preforming the responsibilities of a %s \n",this.name, this.occupation);
    }
    public void age(){
        System.out.printf("%s is %s years old\n",this.name, this.age);
    }
}

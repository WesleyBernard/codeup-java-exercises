package WarmUps;

public class RoommateTest {
    public static void main(String[] args) {
        Roommate maddie = new Roommate("Maddie", 25, "Linguist");
        maddie.sayHi();
        maddie.age();
        maddie.work();
        Roommate Joe = new Roommate("Joe", 23, "Signals Analyst");
        Joe.work();
        maddie.setOccupation("Lamazoid");
        maddie.work();
        maddie.setOccupation("Waitress");
        maddie.work();
    }

}

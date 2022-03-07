package shapes;

import Util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input uwu = new Input();
        Circle myPie = new Circle();
        myPie.setRadious(uwu.getDouble());
        myPie.getArea();
        myPie.getCircumference();
    }

}

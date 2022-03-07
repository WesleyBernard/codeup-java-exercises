package shapes;

import Util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input uwu = new Input();
        double radious = uwu.getDouble();
        Circle myPie = new Circle();
        myPie.setRadious(radious);
        myPie.getArea();
        myPie.getCircumference();
    }

}

package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//
//        System.out.println(box1.getArea());
//
//        System.out.println(box1.getPerimiter());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box2.getPerimiter());
//
//        System.out.println(box2.getArea());

        Measurable myShape = new Square(8);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Rectangle(7, 14);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
//        myShape.getLength();
    }
}

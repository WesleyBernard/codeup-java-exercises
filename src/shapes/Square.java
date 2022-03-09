package shapes;

public class Square extends Quadrilateral{


    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
        this.length = width;

    }

}

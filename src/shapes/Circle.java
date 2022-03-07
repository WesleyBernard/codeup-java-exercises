package shapes;

public class Circle {
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        System.out.println(this.radious);
        return this.radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public Circle(){
        this.radious = 0;
    }
    public double getArea(){
        double area = Math.PI * (this.radious * this.radious);
        System.out.printf("The area of this circle is! %f %n", area);
        return area;
    }
    public double getCircumference(){
        double circumference = 2 * Math.PI * this.radious;
        System.out.printf("the circumference of this circle is %f! %n",circumference);
        return circumference;
    }
}

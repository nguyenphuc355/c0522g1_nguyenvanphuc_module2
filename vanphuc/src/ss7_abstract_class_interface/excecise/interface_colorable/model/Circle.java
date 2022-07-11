package ss7_abstract_class_interface.excecise.interface_colorable.model;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filler, double radius) {
        super(color, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return getRadius()*getRadius()*Math.PI;
    }
    public double getPerimeter(){
        return getRadius()*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= " +
                 + getRadius() +", which is a subclass of "+super.toString();

    }
}

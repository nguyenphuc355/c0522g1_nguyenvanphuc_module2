package ss5_accessmodifile_staticmethod_staticproperty.excercise.AccessModifie;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public String toString() {
        return String.format("radius: %1.2f, color: %s, area: %1.2f.", getRadius(), getColor(), getArea());
    }
}

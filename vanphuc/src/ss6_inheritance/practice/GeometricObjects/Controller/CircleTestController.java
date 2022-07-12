package ss6_inheritance.practice.GeometricObjects.Controller;

import ss6_inheritance.practice.GeometricObjects.Model.Circle;

public class CircleTestController {
    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.println(circle);

        circle = new Circle(3.5,"blue",false);
        System.out.println(circle);

        circle = new Circle(5.0,"indigo",false);
        System.out.println(circle);
    }
}

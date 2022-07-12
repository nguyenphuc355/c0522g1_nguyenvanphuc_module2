package ss6_inheritance.practice.GeometricObjects.Controller;

import ss6_inheritance.practice.GeometricObjects.Model.Shape;

public class ShapeTestController {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape(" red ",false);
        System.out.println(shape);

    }

}

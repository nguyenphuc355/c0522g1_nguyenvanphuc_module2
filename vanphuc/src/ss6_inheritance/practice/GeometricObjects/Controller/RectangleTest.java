package ss6_inheritance.practice.GeometricObjects.Controller;

import ss6_inheritance.practice.GeometricObjects.Model.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(4,6,"orange",false);
        System.out.println(rectangle);

        rectangle = new Rectangle(8,15,"purple",true);
        System.out.println(rectangle);
    }
}

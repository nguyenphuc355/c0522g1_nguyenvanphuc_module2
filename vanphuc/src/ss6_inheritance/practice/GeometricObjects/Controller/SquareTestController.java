package ss6_inheritance.practice.GeometricObjects.Controller;

import ss6_inheritance.practice.GeometricObjects.Model.Square;

public class SquareTestController {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3,"pink",false);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}

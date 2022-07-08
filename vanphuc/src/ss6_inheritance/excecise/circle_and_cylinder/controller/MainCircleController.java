package ss6_inheritance.excecise.circle_and_cylinder.controller;

import ss6_inheritance.excecise.circle_and_cylinder.model.Circle;

public class MainCircleController {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3, "green");
        System.out.println(circle);
    }
}

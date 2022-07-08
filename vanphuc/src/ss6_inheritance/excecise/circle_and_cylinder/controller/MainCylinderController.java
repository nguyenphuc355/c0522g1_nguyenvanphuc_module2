package ss6_inheritance.excecise.circle_and_cylinder.controller;

import ss6_inheritance.excecise.circle_and_cylinder.model.Cylinder;

public class MainCylinderController {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(6, "blue", 5);
        System.out.println(cylinder);
    }
}

package ss6_inheritance.excecise.point2d_point3d.controller;


import ss6_inheritance.excecise.point2d_point3d.model.Point2D;

import java.util.Arrays;

public class MainPoint2DController {
    public static void main(String[] args) {

        Point2D point2D1 = new Point2D();
        System.out.println("Array1: " + Arrays.toString(point2D1.getXY()));

        point2D1 = new Point2D(3, 4);
        System.out.println("\nArray2: " + Arrays.toString(point2D1.getXY()));
    }
}

package ss6_inheritance.excecise.point_and_moveablePoint.controller;

import ss6_inheritance.excecise.point_and_moveablePoint.model.Point;

import java.util.Arrays;

public class MainPointController {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("Array: " + Arrays.toString(point.getXY()));

        point = new Point();
        point.setXY(3,4);
        System.out.println("Array2: " + Arrays.toString(point.getXY()));
    }
}

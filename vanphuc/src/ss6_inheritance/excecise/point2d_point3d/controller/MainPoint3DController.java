package ss6_inheritance.excecise.point2d_point3d.controller;

import ss6_inheritance.excecise.point2d_point3d.model.Point3D;

import java.util.Arrays;

public class MainPoint3DController {
    public static void main(String[] args) {

        Point3D point3D = new Point3D();
        System.out.println("Array1: "+Arrays.toString(point3D.getXYZ()));

        point3D = new Point3D(1,2,3);
        System.out.println("\nArray2: "+ Arrays.toString(point3D.getXYZ()));
    }
}

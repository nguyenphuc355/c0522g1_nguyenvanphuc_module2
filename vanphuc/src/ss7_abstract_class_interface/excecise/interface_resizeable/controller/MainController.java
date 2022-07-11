package ss7_abstract_class_interface.excecise.interface_resizeable.controller;

import ss7_abstract_class_interface.excecise.interface_resizeable.model.Circle;
import ss7_abstract_class_interface.excecise.interface_resizeable.model.Rectangle;
import ss7_abstract_class_interface.excecise.interface_resizeable.model.Shape;
import ss7_abstract_class_interface.excecise.interface_resizeable.model.Square;

public class MainController {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "black", true);
        shapes[1] = new Rectangle(4, 6, "yellow", false);
        shapes[2] = new Square(7, "pink", true);

        double percent = 70;

        System.out.println("Pre-resize: ");
        for (Shape shape : shapes) {
            System.out.println(shape + "\n AREA: " + shape.getArea());
        }

        System.out.println("\npercent: " + percent + "%\n");

        System.out.println("After-resize: ");
        for (Shape shape : shapes) {
            shape.resize(percent);
            System.out.println(shape + "\n AREA: " + shape.getArea());
        }
    }
}
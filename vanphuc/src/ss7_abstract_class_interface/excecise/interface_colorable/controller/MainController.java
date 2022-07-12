package ss7_abstract_class_interface.excecise.interface_colorable.controller;

import ss7_abstract_class_interface.excecise.interface_colorable.model.*;

public class MainController {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3,7);
        shapes[2] = new Square(10);

        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}

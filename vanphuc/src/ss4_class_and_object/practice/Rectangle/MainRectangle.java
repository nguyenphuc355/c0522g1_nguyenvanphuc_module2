package ss4_class_and_object.practice.Rectangle;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.print(" your Rectangle " + rectangle.Display() + "\n");
        System.out.print(" Perimeter of the Rectangle: " + rectangle.getPerimeter() + "\n");
        System.out.print(" Arae of the Rectangle:  " + rectangle.getArea());

    }
}

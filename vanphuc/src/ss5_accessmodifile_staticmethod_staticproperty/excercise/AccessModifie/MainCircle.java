package ss5_accessmodifile_staticmethod_staticproperty.excercise.AccessModifie;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("circle: " + circle);

        Circle circle1 = new Circle();
        circle1.setColor("green");
        circle1.setRadius(3);
        System.out.println("circle1: " + circle1);

        Circle circle2 = new Circle();
        circle2.setColor("orange");
        circle2.setRadius(5);
        System.out.println("circle2: " + circle2);

    }
}

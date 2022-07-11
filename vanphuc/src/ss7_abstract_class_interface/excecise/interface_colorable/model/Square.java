package ss7_abstract_class_interface.excecise.interface_colorable.model;

public class Square extends Shape implements Colorable {
    private double side =1;

    public Square() {
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filler, double side) {
        super(color, filler);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return getSide() * getSide();
    }

    public double getPerimeter() {
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

}

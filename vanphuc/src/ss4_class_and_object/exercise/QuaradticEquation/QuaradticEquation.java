package ss4_class_and_object.exercise.QuaradticEquation;

class QuaradticEquation {
    double a, b, c;

    QuaradticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getA() {
        return this.a;
    }

    private double getB() {
        return this.b;
    }

    private double getC() {
        return this.c;
    }

    private double getDelta() {
        return (getB() * getB()) - (4 * getA() * getC());
    }

    private double getRoot1() {
        return (-getB() + Math.sqrt(getB() * getB() - 4 * getA() * getC())) / (2 * getA());
    }

    private double getRoot2() {
        return (-getB() - Math.sqrt(getB() * getB() - 4 * getA() * getC())) / (2 * getA());
    }

    String display() {
        if (getDelta() > 0) {
            return "phuong trinh co 2 nghiem: x1 = " + getRoot1() + "x2 = " + getRoot2();
        }
        if (getDelta()==0){
            return "phuong trinh co nghiem kep: x1 = x2 = "+getRoot1();
        }
        return "phuong trinh vo nghiem";
    }

}
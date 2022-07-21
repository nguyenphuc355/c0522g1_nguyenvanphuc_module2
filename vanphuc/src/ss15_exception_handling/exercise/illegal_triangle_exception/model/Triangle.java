package ss15_exception_handling.exercise.illegal_triangle_exception.model;

import ss15_exception_handling.exercise.illegal_triangle_exception.Exception.IllegalTriangleException;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("canh tam giam phai > 0");
        } else if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("Tong 2 canh tam giac phai lon hon canh con lai");

        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle: { " +
                "a =" + a +
                ", b =" + b +
                ", c =" + c +
                '}';
    }
}

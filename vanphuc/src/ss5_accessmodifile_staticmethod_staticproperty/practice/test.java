package ss5_accessmodifile_staticmethod_staticproperty.practice;

public class test {
    public int rong, dai;

    public test(int rong, int dai) {
        this.rong = rong;
        this.dai = dai;
    }
}

class MyClass {
    void method(test x) {
        x.rong = 5;
        x.dai = 5;
    }

    public static void main(String[] args) {
        MyClass o = new MyClass();
        test cn = new test(1, 1);
        o.method(cn);
        System.out.printf("x=%d, y=%d", cn.rong, cn.dai);
    }
}



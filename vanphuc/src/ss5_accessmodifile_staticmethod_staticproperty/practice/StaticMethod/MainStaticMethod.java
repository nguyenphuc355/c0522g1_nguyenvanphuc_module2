package ss5_accessmodifile_staticmethod_staticproperty.practice.StaticMethod;

public class MainStaticMethod {
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 =  new StaticMethod(111,"Hoang");
        StaticMethod s2 =  new StaticMethod(222,"Khanh");
        StaticMethod s3 =  new StaticMethod(333,"Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}

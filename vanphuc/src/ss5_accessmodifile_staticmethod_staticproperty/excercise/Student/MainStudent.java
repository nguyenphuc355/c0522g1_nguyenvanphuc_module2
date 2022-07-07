package ss5_accessmodifile_staticmethod_staticproperty.excercise.Student;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("phuc");
        student.setClasses("C05");
        System.out.println(student);

        Student student1 = new Student();
        student1.setName("nam");
        student1.setClasses("C05");
        System.out.println(student1);
    }
}

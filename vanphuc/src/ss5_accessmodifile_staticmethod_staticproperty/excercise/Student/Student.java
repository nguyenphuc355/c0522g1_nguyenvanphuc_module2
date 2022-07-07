package ss5_accessmodifile_staticmethod_staticproperty.excercise.Student;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString(){
        return String.format("name: %s\nclass: %s",getName(),getClasses());
    }


}

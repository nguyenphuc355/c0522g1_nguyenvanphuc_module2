package extra_exercise.model;

public class Student extends Person {
    private String classes;
    private double point;

    public Student() {
    }

    public Student(String classes, double point) {
        this.classes = classes;
        this.point = point;
    }

    public Student(int id, String name, String dateOfBirth, String gender, String classes, double point) {
        super(id, name, dateOfBirth, gender);
        this.classes = classes;
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,\n", this.getId(), this.getName()
                , this.getDateOfBirth(), this.getGender(), this.getClasses(), this.getPoint());
    }

    @Override
    public String toString() {
        return super.toString() + " Student{ " +
                " classes = ' " + classes + '\'' +
                ", point = " + point +
                '}';
    }
}

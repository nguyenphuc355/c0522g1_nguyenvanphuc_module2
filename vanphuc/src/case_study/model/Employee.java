package case_study.model;

public class Employee extends Person {
    private int id;
    private String level;
    private String location;
    private double wage;

    public Employee() {
    }


    public Employee( String code, String name, String dateOfBirth, String gender, int phoneNumber, String email, int id, String level, String location, double wage) {
        super(code, dateOfBirth, gender, name, phoneNumber, email);
        this.id = id;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%1.2f", getName(), getDateOfBirth(), getGender(), getCode(), getPhoneNumber(), getEmail(), getId(), getLevel(), getLocation(), getWage());
    }

    @Override
    public String toString() {
        return super.toString() + " Employee{" +
                "id= " + id +
                ", level = '" + level + '\'' +
                ", location = '" + location + '\'' +
                ", wage=" + wage +
                '}';
    }
}

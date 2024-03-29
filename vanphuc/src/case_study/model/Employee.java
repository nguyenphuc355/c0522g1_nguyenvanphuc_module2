package case_study.model;

public class Employee extends Person {
    private int id;
    private String level;
    private String location;
    private int wage;

    public Employee(int id, String level, String location, int wage) {
        this.id = id;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Employee(String code, String dateOfBirth, String gender, String name, String phoneNumber, String email, int id, String level, String location, int wage) {
        super(code, dateOfBirth, gender, name, phoneNumber, email);
        this.id = id;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Employee() {

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

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%d,%s,%s,%d\n", getCode(), getDateOfBirth(), getGender(), getName(), getPhoneNumber(), getEmail(), getId(), getLevel(), getLocation(), getWage());
    }

    @Override
    public String toString() {
        return super.toString() +
                " Id:[" + id +"]"+
                " Trinh do:[" + level +"]"+
                " Chuc vu:[" + location +"]"+
                " Tien luong:[" + wage+"]";
    }
}

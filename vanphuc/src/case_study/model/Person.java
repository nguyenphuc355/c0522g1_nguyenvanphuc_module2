package case_study.model;

public abstract class Person {
    private String code;
    private String name;
    private String dateOfBirth;
    private String gender;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String code, String dateOfBirth, String gender, String name, int phoneNumber, String email) {
        this.code = code;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return " Person{ " +
                ", code=" + code +
                ", dateOfBirth=' " + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                " name=' " + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}

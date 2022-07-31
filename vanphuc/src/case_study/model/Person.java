package case_study.model;

public abstract class Person {
    private String code;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String code, String dateOfBirth, String gender, String name, String phoneNumber, String email) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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
        return "THONG TIN: "+
                " Ma khach hang:[" + code +"]"+
                " Ngay sinh:[" + dateOfBirth +"]"+
                " Gioi tinh:[" + gender +"]"+
                " Ho ten:[" + name +"]"+
                " So dien thoai:[" + phoneNumber +"]"+
                " Email:[" + email +"]" ;
    }
}

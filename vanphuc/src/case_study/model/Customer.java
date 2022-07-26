package case_study.model;

public class Customer extends Person {
    private int id;
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(int id, String typeOfGuest, String address) {
        this.id = id;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String code, String dateOfBirth, String gender, String name, int phoneNumber, String email, int id, String typeOfGuest, String address) {
        super(code, dateOfBirth, gender, name, phoneNumber, email);
        this.id = id;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n", getCode(), getDateOfBirth(), getGender(), getName(), getPhoneNumber(), getEmail(), getId(), getTypeOfGuest(), getAddress());
    }

    @Override
    public String toString() {
        return super.toString() + " Customer{ " +
                " id =' " + id + '\'' +
                ", typeOfGuest =' " + typeOfGuest + '\'' +
                ", address ='" + address + '\'' +
                '}';
    }
}

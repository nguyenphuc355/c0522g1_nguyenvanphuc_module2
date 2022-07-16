package extra_exercises2.model;

public abstract class Vehicle {
    private String seaOfControl;
    private String manufacturer;
    private int yearOfManufacture;
    private String Owner;

    public Vehicle() {
    }

    public Vehicle(String seaOfControl, String manufacturer, int yearOfManufacture, String owner) {
        this.seaOfControl = seaOfControl;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        Owner = owner;
    }

    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                " seaOfControl=' " + seaOfControl + '\'' +
                ", manufacturer =' " + manufacturer + '\'' +
                ", yearOfManufacture =" + yearOfManufacture +
                ", Owner ='" + Owner + '\'' +
                '}';
    }
}

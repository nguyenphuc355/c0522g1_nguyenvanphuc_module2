package extra_exercises2.model;

public class Truck extends Vehicle{
    private int tonnage;

    public Truck() {
    }

    public Truck(int tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(String seaOfControl, String manufacturer, int yearOfManufacture, String owner, int tonnage) {
        super(seaOfControl, manufacturer, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString()+"Truck{ " +
                " tonnage = " + tonnage +
                '}';
    }
}

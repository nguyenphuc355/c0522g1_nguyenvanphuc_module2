package extra_exercises2.model;

public class Motorcycle extends Vehicle {

    private int wattage;

    public Motorcycle() {
    }

    public Motorcycle(int wattage) {
        this.wattage = wattage;
    }

    public Motorcycle(String seaOfControl, String manufacturer, int yearOfManufacture, String owner, int wattage) {
        super(seaOfControl, manufacturer, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return super.toString()+"Motorcycle{ " +
                " wattage = " + wattage +
                '}';
    }
}

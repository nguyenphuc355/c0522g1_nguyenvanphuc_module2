package extra_exercises2.model;

public class Car extends Vehicle{
    private int numberOfSeats;
    private String vehicleType;

    public Car() {
    }

    public Car(int numberOfSeats, String vehicleType) {
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public Car(String seaOfControl, String manufacturer, int yearOfManufacture, String owner, int numberOfSeats, String vehicleType) {
        super(seaOfControl, manufacturer, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return super.toString()+"Car{ " +
                " numberOfSeats = " + numberOfSeats +
                ", vehicleType=' " + vehicleType + '\'' +
                '}';
    }
}

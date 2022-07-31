package case_study.model;

public class Villa extends Facility {

    private String roomStandard;
    private int swimmingPoolArea;
    private int numberOfFloors;

    public Villa() {
    }

    @Override
    public String getInfo() {
        return  String.format("%s,%s,%f,%d,%d,%s,%s,%d,%d",getServiceId(),getServiceName(),getUsableArea(),getRentalCosts(),getMaxPeople(),getRentalType(),getRoomStandard(),getSwimmingPoolArea(),getNumberOfFloors());
    }

    public Villa(String roomStandard, int swimmingPoolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceId, String serviceName, double usableArea, int rentalCosts, int maxPeople, String rentalType, String roomStandard, int swimmingPoolArea, int numberOfFloors) {
        super(serviceId, serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(int swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString()+
                " roomStandard:[" +roomStandard +"]"+
                " swimmingPoolArea:[" +swimmingPoolArea +"]"+
                " numberOfFloors:[" + numberOfFloors+"]";
    }
}

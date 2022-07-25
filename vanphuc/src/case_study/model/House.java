package case_study.model;

public class House extends  Facility{
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",getServiceName(),getUsableArea(),getRentalCosts(),getMaxPeople(),getRentalType(),getRoomStandard(),getNumberOfFloors());
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceName, String usableArea, int rentalCosts, String maxPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString()+" House{ " +
                "roomStandard = '" + roomStandard + '\'' +
                ", numberOfFloors = " + numberOfFloors +
                '}';
    }
}

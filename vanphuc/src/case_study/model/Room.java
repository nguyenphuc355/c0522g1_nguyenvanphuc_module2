package case_study.model;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s",getServiceName(),getUsableArea(),getRentalCosts(),getMaxPeople(),getRentalType(),getFreeService());
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, String usableArea, int rentalCosts, String maxPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, rentalCosts, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString()+" Room{ " +
                " freeService = '" + freeService + '\'' +
                '}';
    }
}

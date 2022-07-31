package case_study.model;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%f,%d,%d,%s,%s",getServiceId(),getServiceName(),getUsableArea(),getRentalCosts(),getMaxPeople(),getRentalType(),getFreeService());
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceId, String serviceName, double usableArea, int rentalCosts, int maxPeople, String rentalType, String freeService) {
        super(serviceId, serviceName, usableArea, rentalCosts, maxPeople, rentalType);
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
        return super.toString()+
                " freeService:[" + freeService+"]";
    }
}

package case_study.model;

public abstract class Facility {
    private String serviceName;
    private String usableArea;
    private int rentalCosts;
    private String maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, String usableArea, int rentalCosts, String maxPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", maxPeople='" + maxPeople + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}

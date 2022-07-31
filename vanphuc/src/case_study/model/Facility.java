package case_study.model;

public abstract class Facility {
    private String serviceId;
    private String serviceName;
    private double usableArea;
    private int rentalCosts;
    private int maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceId, String serviceName, double usableArea, int rentalCosts, int maxPeople, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
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
        return
                "serviceId:[" + serviceId+"]" +
                " serviceName:[" + serviceName+"]" +
                " usableArea:[" + usableArea+"]"+
                " rentalCosts:[" + rentalCosts +"]"+
                " maxPeople:[" + maxPeople+"]" +
                " rentalType:[" + rentalType+"]";
    }
}


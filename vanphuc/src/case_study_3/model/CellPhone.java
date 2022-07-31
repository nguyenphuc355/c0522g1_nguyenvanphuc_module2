package case_study_3.model;

public class CellPhone extends Phone{
    private String country;
    private String status;

    public CellPhone(int id, String name, int price, int amount, String productName, int warrantyPeriod, String warrantyCoverage) {
    }

    @Override
    public String getInfo() {
        return String.format("%d,%s,%d,%d,%s,%s,%s\n",getId(),getName(),getPrice(), getAmount(), getProducer(), getCountry(), getStatus());
    }

    public CellPhone(String country, String status) {
        this.country = country;
        this.status = status;
    }

    public CellPhone(int id, String name, int price, int amount, String producer, String country, String status) {
        super(id, name, price, amount, producer);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return super.toString()+"CellPhone{" +
                "country='" + country + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

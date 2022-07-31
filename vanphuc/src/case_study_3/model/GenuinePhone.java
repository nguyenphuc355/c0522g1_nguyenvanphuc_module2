package case_study_3.model;

public class GenuinePhone extends Phone{
    private String warrantyPeriod;
    private String warrantyCoverage;


    public GenuinePhone() {
    }

    @Override
    public String getInfo() {
        return String.format("%d,%s,%d,%d,%s,%s,%s\n",getId(),getName(),getPrice(), getAmount(),getProducer(),getWarrantyPeriod(),getWarrantyCoverage());
    }

    public GenuinePhone(String warrantyPeriod, String warrantyCoverage) {
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public GenuinePhone(int id, String name, int price, int amount, String producer, String warrantyPeriod, String warrantyCoverage) {
        super(id, name, price, amount, producer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }


    @Override
    public String toString() {
        return super.toString()+"GenuinePhone{" +
                "warrantyPeriod='" + warrantyPeriod + '\'' +
                ", warrantyCoverage='" + warrantyCoverage + '\'' +
                '}';
    }
}

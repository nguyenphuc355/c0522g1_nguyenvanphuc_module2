package case_study.model;

public class Contract {
    private String contractNumber;
    private String codeBooking;
    private double advanceDepositAmount;
    private double payments;
    private String customerCode;

    public Contract() {
    }

    public Contract(String contractNumber, String codeBooking, double advanceDepositAmount, double payments, String customerCode) {
        this.contractNumber = contractNumber;
        this.codeBooking = codeBooking;
        this.advanceDepositAmount = advanceDepositAmount;
        this.payments = payments;
        this.customerCode = customerCode;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(double advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public double getPayments() {
        return payments;
    }

    public void setPayments(double payments) {
        this.payments = payments;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getInfo(){
        return String.format("%s,%s,%f,%f,%s",getContractNumber(),getCodeBooking(),getAdvanceDepositAmount(),getPayments(),getCustomerCode());
    }

    @Override
    public String toString() {
        return
                "So hop dong:[" + contractNumber +"]"+
                "  Ma booking:[" + codeBooking +"]"+
                "  So tien coc truoc:[" + advanceDepositAmount +"]"+
                "  Tong tien thanh toan:[" + payments +"]"+
                "  Ma khach hang:[" + customerCode+"]";
    }
}

package case_study.model;

public class Contact {
    private String contractNumber;
    private double codeBooking;
    private double advanceDepositAmount;
    private double payments;
    private String customerCode;

    public Contact() {
    }

    public Contact(String contractNumber, double codeBooking, double advanceDepositAmount, double payments, String customerCode) {
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

    public double getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(double codeBooking) {
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

    @Override
    public String toString() {
        return "Contract{ " +
                "contractNumber ='" + contractNumber + '\'' +
                ", codeBooking = " + codeBooking +
                ", advanceDepositAmount = " + advanceDepositAmount +
                ", payments = " + payments +
                ", customerCode=' " + customerCode + '\'' +
                '}';
    }
}

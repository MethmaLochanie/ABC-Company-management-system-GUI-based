package Model;

public class Receipt {
    private String cusName;
    private String hallName;
    private int totalPay;
    private boolean fullPayment;

    public Receipt(String cusName, String hallName) {
        this.cusName = cusName;
        this.hallName = hallName;
    }
    public Receipt(int totalPay, boolean fullPayment) {
        this.totalPay = totalPay;
        this.fullPayment = fullPayment;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
    }

    public boolean isFullPayment() {
        return fullPayment;
    }

    public void setFullPayment(boolean fullPayment) {
        this.fullPayment = fullPayment;
    }
}

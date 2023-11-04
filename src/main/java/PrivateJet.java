public class PrivateJet extends Vehicles{
    private String transactionDate;
    private long orderPerHours;

    public PrivateJet(String id, int year, long price, int seat, long tax, long orderPerHours, String transactionDate) {
        super(id, "PrivateJet", year, price, seat, tax);
        this.orderPerHours = orderPerHours;
        this.transactionDate = transactionDate;
    }

    public double getOrderPerHours() {
        return this.orderPerHours;
    }
    public void setTotalOrderKm(long orderPerHours) {
        this.orderPerHours = orderPerHours;
    }
    public String getTransactionDate() {
        return this.transactionDate;
    }

    public long getTotalIncome() {
        return this.orderPerHours;
    }
    public void setTransactionDate(String transaction) {
        this.transactionDate = transaction;
    }
}

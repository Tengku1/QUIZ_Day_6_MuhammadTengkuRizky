public class Boat extends Vehicles{
    private String transactionDate;
    private long orderPerHours;

    public Boat(String id, int year, long price, int seat, long tax, long orderPerHours, String transactionDate) {
        super(id, "Boat", year, price, seat, tax);
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
    public void setTransactionDate(String transaction) {
        this.transactionDate = transaction;
    }
    public long getTotalIncome() {
        return this.orderPerHours;
    }
}

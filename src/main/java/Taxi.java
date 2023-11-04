import java.time.LocalDate;

public class Taxi extends Vehicles{
    private String transactionDate;
    private int order;
    private double orderPerKm;
    private long totalIncome;

    public Taxi(String id, int year, long price, int seat, long tax, int order, String transactionDate, double orderPerKm) {
        super(id, "Taxi", year, price, seat, tax);
        this.order = order;
        this.orderPerKm = orderPerKm;
        this.transactionDate = transactionDate;
        this.totalIncome = (long) (order * orderPerKm);
    }

    public long getTotalIncome() {
        return this.totalIncome;
    }
    public double getOrders() {
        return this.order;
    }
    public void setTotalOrderKm(int totalOrderKm) {
        this.order = totalOrderKm;
    }
    public String getTransactionDate() {
        return this.transactionDate;
    }
    public void setTransactionDate(String transaction) {
        this.transactionDate = transaction;
    }
    public double getOrderPerKm() {
        return this.orderPerKm;
    }
    public void setOrderPerKm(double orderPricePerKm) {
        this.orderPerKm = orderPricePerKm;
    }
}

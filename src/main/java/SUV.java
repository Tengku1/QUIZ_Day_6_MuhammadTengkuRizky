import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class SUV extends Vehicles {
    private String transactionDate;
    private double rent;
    private double driver;
    private long totalIncome;

    public SUV(String id, int year, long price, int seat, long tax, double rent, String transactionDate, double driver) {
        super(id, "SUV", year, price, seat, tax);
        this.rent = rent;
        this.driver = driver;
        this.transactionDate = transactionDate;
        this.totalIncome = (long) (driver + rent);
    }

    public String getRent() {
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id","ID"));
        return rupiah.format(this.rent);
    }

    public long getTotalIncome() {
        return this.totalIncome;
    }

    public void setRent(double rentSalary) {
        this.rent = rentSalary;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(String transaction) {
        this.transactionDate = transaction;
    }

    public String getDriver() {
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id","ID"));
        return rupiah.format(this.driver);
    }

    public void setDriver(double driverSalary) {
        this.driver = driverSalary;
    }
}

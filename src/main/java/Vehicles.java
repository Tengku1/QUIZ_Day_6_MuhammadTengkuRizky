import java.text.NumberFormat;
import java.time.Year;
import java.util.Locale;

public class Vehicles {
    private String id;
    private int year;
    private long price;
    private long tax;
    private int seat;
    private String type;
    private NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id","ID"));

    public Vehicles(String id, String type, int year, long price, int seat, long tax) {
        this.id = id;
        this.year = year;
        this.price = price;
        this.seat = seat;
        this.tax = tax;
        this.type = type;
    }

    public String infoVehicles() {
        return "\tNoPolice/NoRegister = " + id + "\n\tVehicleType = " + type + "\n\tPrice = " + rupiah.format(price) + "\n\tTax(In Year) = " + rupiah.format(tax) + "\n\tSeat = " + seat + "\n";
    }
}

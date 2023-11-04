import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Summary {
    NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id","ID"));
    public long incomeCars() {
        long totalIncome;
        SUV suv1 = new SUV("D 1001 UM",2010,350_000_000,4,3_500_000, 500_000,"12/01/2023",150_000);
        SUV suv2 = new SUV("D 1002 UM",2010,350_000_000,4,3_500_000, 500_000,"12/01/2023",150_000);
        SUV suv3 = new SUV("D 1003 UM",2015,350_000_000,5,3_500_000, 500_000,"12/01/2023",150_000);
        SUV suv4 = new SUV("D 1004 UM",2015,350_000_000,5,3_500_000, 500_000,"12/01/2023",150_000);
        Taxi suv5 = new Taxi("D 1001 UM",2010,350_000_000,4,3_500_000, 45,"12/01/2023",4500);
        Taxi suv6 = new Taxi("D 1002 UM",2010,350_000_000,4,3_500_000, 75,"12/01/2023",4500);
        Taxi suv7 = new Taxi("D 1003 UM",2015,350_000_000,5,3_500_000, 90,"12/01/2023",4500);

        totalIncome = suv1.getTotalIncome() + suv2.getTotalIncome() + suv3.getTotalIncome() + suv4.getTotalIncome() + suv5.getTotalIncome() + suv6.getTotalIncome() + suv7.getTotalIncome();
        return totalIncome;
    }
    public long incomePlanes() {
        long totalIncome;
        PrivateJet suv1 = new PrivateJet("D 1001 UM",2010,350_000_000,4,3_500_000,55_000_000,"12/01/2023");
        PrivateJet suv2 = new PrivateJet("D 1002 UM",2010,350_000_000,4,3_500_000,75_000_000,"12/01/2023");

        totalIncome = suv1.getTotalIncome() + suv2.getTotalIncome();
        return totalIncome;
    }
    public long incomeBoats() {
        Boat boat = new Boat("D 1001 UM",2010,350_000_000,4,3_500_000,10_000_000,"12/01/2023");
        return boat.getTotalIncome();
    }
    public void printTotalIncome(String typeIncomes , long incomes) {
        System.out.println(typeIncomes + rupiah.format(incomes));
    }
}

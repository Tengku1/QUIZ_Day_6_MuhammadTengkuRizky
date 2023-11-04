import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehicleImplementation implements VehicleInterface {
    @Override
    public List<Vehicles> dataSuv(){
        Vehicles vehicles1 = new Vehicles("D 1001 UM","SUV",2010,350_000_000,4,3_500_000);
        Vehicles vehicles2 = new Vehicles("D 1002 UM","SUV",2010,350_000_000,4,3_500_000);
        Vehicles vehicles3 = new Vehicles("D 1003 UM","SUV",2015,350_000_000,5,3_500_000);
        Vehicles vehicles4 = new Vehicles("D 1004 UM","SUV",2015,350_000_000,5,3_500_000);

        List<Vehicles> vehiclesList = List.of(vehicles1,vehicles2,vehicles3,vehicles4);
        return vehiclesList;
    }

    public List<Vehicles> dataPrivateJet(){
        Vehicles vehicles1 = new Vehicles("ID8089","PrivateJet",2010,150_000_000_000L,12,1_500_000_000);
        Vehicles vehicles2 = new Vehicles("ID8099","PrivateJet",2010,175_000_000_000L,15,1_750_000_000);

        List<Vehicles> vehiclesList = List.of(vehicles1,vehicles2);
        return vehiclesList;
    }

    public List<Vehicles> dataTaxi(){
        Vehicles vehicles1 = new Vehicles("D 11 UK","Taxi",2002,175_000_000,4,1_750_000);
        Vehicles vehicles2 = new Vehicles("D 12 UK","Taxi",2015,225_000_000,4,2_250_000);
        Vehicles vehicles3 = new Vehicles("D 13 UK","Taxi",2020,275_000_000,4,2_750_000);

        List<Vehicles> vehiclesList = List.of(vehicles1,vehicles2,vehicles3);
        return vehiclesList;
    }

    public List<Vehicles> dataBoat(){
        Vehicles vehicles1 = new Vehicles("Boat18","Boat",2010,2_000_000000,12,20_000_000);

        List<Vehicles> vehiclesList = List.of(vehicles1);
        return vehiclesList;
    }

    public List<Vehicles> AllVehicles(){
        Vehicles[] vehiclesArray = {
                new Vehicles("D 1001 UM","SUV",2010,350_000_000,4,3_500_000),
                new Vehicles("D 1002 UM","SUV",2010,350_000_000,4,3_500_000),
                new Vehicles("D 1003 UM","SUV",2015,350_000_000,5,3_500_000),
                new Vehicles("D 1004 UM","SUV",2015,350_000_000,5,3_500_000),
                new Vehicles("D 11 UK","Taxi",2002,175_000_000,4,1_750_000),
                new Vehicles("D 12 UK","Taxi",2015,225_000_000,4,2_250_000),
                new Vehicles("D 13 UK","Taxi",2020,275_000_000,4,2_750_000),
                new Vehicles("ID8089","PrivateJet",2010,150_000_000_000L,12,1_500_000_000),
                new Vehicles("ID8099","PrivateJet",2010,175_000_000_000L,15,1_750_000_000),
                new Vehicles("Boat18","Boat",2010,2_000_000_000,12,20_000_000)
        };

        return initVehicleList(vehiclesArray);
    }

    @Override
    public void printVehicles(List<Vehicles> vehiclesList) {
        for (Vehicles vehicles: vehiclesList) {
            System.out.println(vehicles.infoVehicles());
        }
    }

    @Override
    public double totalIncome() {
        double total = 0;
        return total;
    }

    @Override
    public List<Vehicles> initVehicleList(Vehicles... vehicles) {
        List<Vehicles> vehiclesList = new ArrayList<>();
        vehiclesList = Arrays.asList(vehicles);
        return vehiclesList;
    }
}

import java.util.List;

public interface VehicleInterface {
    public List<Vehicles> dataSuv();
    public List<Vehicles> dataPrivateJet();
    public List<Vehicles> AllVehicles();
    public List<Vehicles> dataBoat();
    public List<Vehicles> dataTaxi();
    public List<Vehicles> initVehicleList(final Vehicles... vehicle);
    public void printVehicles(List<Vehicles> vehiclesList);
    public double totalIncome();
}

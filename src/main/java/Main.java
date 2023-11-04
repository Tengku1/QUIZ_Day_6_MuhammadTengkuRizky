import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aplikasi Catatan Kendaraan");
        System.out.println("1. Lihat Daftar Kendaraan\n2. Lihat Total Pendapatan");
        System.out.print("Pilih Menu : ");
        int firstOption = scanner.nextInt();
        System.out.println();
        scanner.nextLine();
        System.out.println("Pilih Jenis Kendaraan : ");
        System.out.println("1. SUV\n2. Taxi\n3. Private Jet\n4. Boat\n5. All Vehicles");
        System.out.print("Pilih Menu : ");
        int secondOption = scanner.nextInt();
        System.out.println();
        System.out.println("=======================================================");
        VehicleInterface vehicleInterface = new VehicleImplementation();
        if(firstOption == 1) {
            if(secondOption == 1) {
                var listVehicles = vehicleInterface.dataSuv();
                vehicleInterface.printVehicles(listVehicles);
            }
            if(secondOption == 2) {
                var listVehicles = vehicleInterface.dataTaxi();
                vehicleInterface.printVehicles(listVehicles);
            }
            if(secondOption == 3) {
                var listVehicles = vehicleInterface.dataPrivateJet();
                vehicleInterface.printVehicles(listVehicles);
            }
            if(secondOption == 4) {
                var listVehicles = vehicleInterface.dataBoat();
                vehicleInterface.printVehicles(listVehicles);
            }
            if(secondOption == 5) {
                var listVehicles = vehicleInterface.AllVehicles();
                vehicleInterface.printVehicles(listVehicles);
            }
        }
        if(firstOption == 2) {

        }
        System.out.println("=======================================================");
    }
}

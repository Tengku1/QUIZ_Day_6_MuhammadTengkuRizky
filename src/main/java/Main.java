import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleInterface vehicleInterface = new VehicleImplementation();
        Summary summary = new Summary();
        String response;

        do {
            System.out.println("Aplikasi Catatan Kendaraan");
            System.out.println("1. Lihat Daftar Kendaraan\n2. Lihat Total Pendapatan");
            System.out.print("Pilih Menu : ");
            int firstOption = scanner.nextInt();

            switch (firstOption) {
                case 1:
                    System.out.println("Pilih Jenis Kendaraan : ");
                    System.out.println("1. SUV\n2. Taxi\n3. Private Jet\n4. Boat\n5. All Vehicles");
                    System.out.print("Pilih Menu : ");
                    int secondOption = scanner.nextInt();

                    switch (secondOption) {
                        case 1:
                            var listSuv = vehicleInterface.dataSuv();
                            vehicleInterface.printVehicles(listSuv);
                            break;
                        case 2:
                            var listTaxi = vehicleInterface.dataTaxi();
                            vehicleInterface.printVehicles(listTaxi);
                            break;
                        case 3:
                            var listPlanes = vehicleInterface.dataPrivateJet();
                            vehicleInterface.printVehicles(listPlanes);
                            break;
                        case 4:
                            var listBoat = vehicleInterface.dataBoat();
                            vehicleInterface.printVehicles(listBoat);
                            break;
                        case 5:
                            var listVehicles = vehicleInterface.AllVehicles();
                            vehicleInterface.printVehicles(listVehicles);
                            break;
                        default:
                            System.out.println("Pilihan Tidak Valid !");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Pilih Jenis Kendaraan : ");
                    System.out.println("1. Cars\n2. Planes\n3. Boats\n4. All Vehicles");
                    System.out.print("Pilih Menu : ");
                    int secondOptionIncome = scanner.nextInt();

                    switch (secondOptionIncome) {
                        case 1:
                            long incomeCars = summary.incomeCars();
                            summary.printTotalIncome("TotalIncomeCar ", incomeCars);
                            break;
                        case 2:
                            long incomePlanes = summary.incomePlanes();
                            summary.printTotalIncome("TotalIncomePlane ", incomePlanes);
                            break;
                        case 3:
                            long incomeBoats = summary.incomeBoats();
                            summary.printTotalIncome("TotalIncomeBoat ", incomeBoats);
                            break;
                        case 4:
                            long totalIncome = summary.incomeCars() + summary.incomePlanes() + summary.incomeBoats();
                            summary.printTotalIncome("All Total Vehicle Incomes ", totalIncome);
                            break;
                        default:
                            System.out.println("Pilihan Tidak Valid !");
                            break;
                    }
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid !");
                    break;
            }

            System.out.print("Apakah Anda ingin melihat menu lagi? (y/n): ");
            response = scanner.next();
            System.out.println();
        } while (response.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan aplikasi Catatan Kendaraan. Selamat tinggal!");
        scanner.close();
    }
}

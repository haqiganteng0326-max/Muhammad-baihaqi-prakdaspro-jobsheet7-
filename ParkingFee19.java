
    
import java.util.Scanner;

public class ParkingFee19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vehicle, hours, fee;
        int totalFee = 0;

        while (true) {
            System.out.println("1. Car");
            System.out.println("2. Motorcycle");
            System.out.println("0. Exit");
            System.out.print("Choose vehicle type: ");
            vehicle = sc.nextInt();

            if (vehicle == 0) {
                break;
            }

            if (vehicle != 1 && vehicle != 2) {
                System.out.println("Invalid vehicle type!");
                continue;
            }

            System.out.print("Enter parking duration (hours): ");
            hours = sc.nextInt();

            if (hours <= 0) {
                System.out.println("Invalid parking duration!");
                continue;
            }

            if (hours > 5) {
                fee = 12500;
            } else if (vehicle == 1) {
                fee = hours * 3000;
            } else {
                fee = hours * 2000;
            }

            System.out.println("Parking fee: Rp" + fee);
            totalFee += fee;
        }

        System.out.println("Total parking revenue: Rp" + totalFee);

        sc.close();
    }
}


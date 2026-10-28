import java.util.Scanner;

public class CinemaTicket19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ticketPrice = 50000;
        int totalTickets = 0;
        double totalSales = 0;

        System.out.print("Enter number of customers: ");
        int customers = sc.nextInt();

        for (int i = 1; i <= customers; i++) {
            System.out.print("Enter tickets for customer " + i + ": ");
            int tickets = sc.nextInt();

            if (tickets < 0) {
                System.out.println("Invalid input! Try again.");
                i--;
                continue;
            }

            double totalPrice = tickets * ticketPrice;
            double discount = 0;

            if (tickets > 10) {
                discount = 0.15;
            } else if (tickets > 4) {
                discount = 0.10;
            }

            totalPrice = totalPrice - (totalPrice * discount);

            totalTickets += tickets;
            totalSales += totalPrice;

            System.out.println("Total payment: Rp" + totalPrice);
        }

        System.out.println("Total tickets sold: " + totalTickets);
        System.out.println("Total sales: Rp" + totalSales);

        sc.close();
    }
}
    


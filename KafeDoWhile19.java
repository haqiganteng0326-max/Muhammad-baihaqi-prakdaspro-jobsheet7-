
import java.util.Scanner;

public class KafeDoWhile19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffee, tea, breads;
        int coffeePrice = 12000;
        int teaPrice = 7000;
        int breadPrice = 20000;
        String customerName;

        do {
            System.out.print("Enter customer name (cancel to stop): ");
            customerName = sc.nextLine();

            if (customerName.equalsIgnoreCase("cancel")) {
                break;
            }

            System.out.print("Enter number of coffees: ");
            coffee = sc.nextInt();

            System.out.print("Enter number of teas: ");
            tea = sc.nextInt();

            System.out.print("Enter number of breads: ");
            breads = sc.nextInt();

            int totalPrice = (coffee * coffeePrice)
                    + (tea * teaPrice)
                    + (breads * breadPrice);

            System.out.println("Customer: " + customerName);
            System.out.println("Total payment: Rp" + totalPrice);

            sc.nextLine();

        } while (true);

        sc.close();
    }
}

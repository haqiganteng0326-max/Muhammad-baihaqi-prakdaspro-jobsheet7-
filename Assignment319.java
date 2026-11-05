import java.util.Scanner;

public class Assignment319 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int branches;
        int customers;
        int items;

        int totalCustomers = 0;
        int totalItems = 0;

        System.out.print("Number of cafe branches: ");
        branches = sc.nextInt();

        System.out.println("\n=== Sales Input Per Branch ===");

        for (int i = 1; i <= branches; i++) {

            int branchItems = 0;

            System.out.println("\n--- Branch " + i + " ---");

            System.out.print("Number of customers: ");
            customers = sc.nextInt();

            for (int j = 1; j <= customers; j++) {

                System.out.print(
                    "How many items did customer "
                    + j + " order? "
                );

                items = sc.nextInt();

                branchItems += items;
            }

            System.out.println("Branch " + i + ":");
            System.out.println("- Customers: " + customers);
            System.out.println("- Items sold: " + branchItems);

            totalCustomers += customers;
            totalItems += branchItems;
        }

        System.out.println("\nTotal across all branches:");
        System.out.println("Customers: " + totalCustomers);
        System.out.println("Items sold: " + totalItems);

        sc.close();
    }
}


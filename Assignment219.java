import java.util.Scanner;

public class Assignment219  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("The minimum value of n is 3.");
        } else {

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n; j++) {

                    if (i == 1 || i == n ||
                        j == 1 || j == n) {

                        System.out.print(n + " ");

                    } else {
                        System.out.print("  ");
                    }
                }

                System.out.println();
            }
        }

        sc.close();
    }
}


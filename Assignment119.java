import java.util.Scanner;

public class Assignment119 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum value of n = ");
        int maxN = sc.nextInt();

        for (int n = 1; n <= maxN; n++) {

            int sum = 0;

            System.out.print("n = " + n
                    + " -> sum of squares = ");

            for (int i = 1; i <= n; i++) {

                sum += i * i;

                System.out.print(i * i);

                if (i < n) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + sum);
        }

        sc.close();
    }
}
    


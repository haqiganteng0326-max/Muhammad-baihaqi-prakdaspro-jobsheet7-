import java.util.Scanner;
public class Soal1219 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of canteens: ");
        int n = input.nextInt();

        System.out.print("Number of days: ");
        int days = input.nextInt();

        if (n <= 0 || days <= 0) {
         System.out.println("Number of canteens and days must be > 0");
        } else {
        int i = 1;
        double allTotal = 0;
        double highest = -1;
        int best = 0;
        int quiet = 0;

while (i <= n) {
double total = 0;
System.out.println("Canteen" + i);

for (int j = 1; j <= days; j++) {
double revenue;

 do {
 System.out.print("Revenue on day" + j + " : ");
 revenue = input.nextDouble();

    if (revenue < 0) {
    System.out.println("Must not be negative. Please re-enter!");
                        }
     } while (revenue < 0);

     total += revenue;
        if (revenue < 100) {
        quiet++;
        }
        }

    System.out.println("Canteen " + i + " - total: " + total
    + ", average per day: " + (total / days));

     allTotal += total;

    if (total > highest) {
    highest = total;
        best = i;
        }
        i++;
        }

        System.out.println("Total of all canteens : " + allTotal);
        System.out.println("Best canteen : " + best);
        System.out.println("Quiet days (< 100) : " + quiet);
        }
        input.close();
    }
}


import java.util.Scanner;
public class Soal119 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Number of students: ");
        int n = input.nextInt();

        int score;
        int total = 0;
        int highest = 0;
        int lowest = 100;
        int pass = 0;
        int fail = 0;

        for (int i = 1; i <= n; i++) {
      do {
      System.out.print("Score of student " + i + " : ");
      score = input.nextInt();

        if (score < 0 || score > 100) {
        System.out.println("Score must be 0-100.Please re-enter!");
        }
         } while (score < 0 || score > 100);
            total += score;
        if (score > highest) {
            highest = score;
         }
        if (score < lowest) {
            lowest = score;
        }

        if (score >= 60) {
                pass++;
         } else {
                fail++;
         }
        }
        double average = (double) total / n;
        System.out.println("Average       : " + average);
        System.out.println("Highest score : " + highest);
        System.out.println("Lowest score  : " + lowest);
        System.out.println("Pass (>= 60)  : " + pass);
        System.out.println("Fail          : " + fail);

        input.close();
    }
}
import java.util.Scanner;

public class GroupScoreAttendance19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalGroups = 6;
        int totalRaters = 5;

        float highestAvg = -1;
        int highestGroup = 0;

        for (int i = 1; i <= totalGroups; i++) {
            int totalScore = 0;

            System.out.println("Group " + i);

            for (int j = 1; j <= totalRaters; j++) {
                System.out.print("Enter score from rater " + j + ": ");
                int score = input.nextInt();

                totalScore += score;
            }

            float avgScore = (float) totalScore / totalRaters;

            System.out.println("Average score of Group " + i + ": " + avgScore);

            if (avgScore > highestAvg) {
                highestAvg = avgScore;
                highestGroup = i;
            }

            System.out.println();
        }

        System.out.println("Group with the highest average score: " + highestGroup);
        System.out.println("Highest average score: " + highestAvg);

        input.close();
    }
}

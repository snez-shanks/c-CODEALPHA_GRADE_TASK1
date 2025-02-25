package task1grade;

public class taskone {
    public static void main(String[] args) {
        int[] scores= {62, 99, 71, 17, 56};
        int total = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int score : scores) {
            total += score;
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }
        double average = total / (double) scores.length;
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}
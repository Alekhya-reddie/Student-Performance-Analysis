public class ResultCalculator {

    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    public static double calculateAverage(int total, int subjects) {
        return (double) total / subjects;
    }

    public static String calculateGrade(double avg) {
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 60) return "C";
        else return "D";
    }
}

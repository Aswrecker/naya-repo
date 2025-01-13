public class GradeCalculator {
    public static double calculateAverage(int math, int reading, int writing) {
        return (math + reading + writing) / 3.0;
    }

    public static String determineGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

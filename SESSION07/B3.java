package SESSION07;

public class B3 {
    public static boolean checkPass(double score) {
        if (score >= 5.0) {
            return true;
        } else {
            return false;
        }
    }
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double s : scores) {
            sum += s;
        }
        return sum / scores.length;
    }
    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5};
        double avg = B3.calculateAverage(scores);
        System.out.println("DTB: " + avg);
        for (double score : scores) {
            if (B3.checkPass(score)) {
                System.out.println(score+"-QUA");
            } else {
                System.out.println(score + "-KO QUA");
            }
        }
    }
}
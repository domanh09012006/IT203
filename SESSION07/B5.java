package SESSION07;

public class B5 {
    public static final double MAX_SCORE = 10.0;
    public static final double MIN_SCORE = 0.0;

        public static void main(String[] args) {
            double score = 8.5;
            if (score >= B5.MIN_SCORE && score <= B5.MAX_SCORE) {
                System.out.println("Diem hop le: " + score);
            } else {
                System.out.println("Diem khong hop le!");
            }
        }
}

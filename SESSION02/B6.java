package SESSION02;
import java.util.Scanner;
public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int max = -1;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            int count = 0;

            for (int day = 1; day <= 7; day++) {
                System.out.print("Nhập số lượt mượn sách ngày " + day + ": ");
                int borrow = sc.nextInt();
                if (borrow == 0) {
                    continue;
                }
                if (borrow > max) {
                    max = borrow;
                }
                if (borrow < min) {
                    min = borrow;
                }
                sum += borrow;
                count++;
            }
            if (count > 0) {
                double average = (double) sum / count;

                System.out.println("Lượt mượn cao nhất: " + max);
                System.out.println("Lượt mượn thấp nhất: " + min);
                System.out.println("Lượt mượn trung bình: " + average);
            } else {
                System.out.println("Không có ngày nào thư viện mở cửa!");
            }

            sc.close();
        }


}

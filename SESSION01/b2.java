package SESSION01;
import java.util.Scanner;
public class b2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so ngay cham: ");
        int n = sc.nextInt();
        System.out.print("Nhap so sach muon: ");
        int m = sc.nextInt();
        double total = n * m * 5000;
        System.out.println("Phat goc: " + total + " VND");
        if (n > 7 && m >= 3) {
            total = total * 1.2;
        }
        boolean lockCard;
        if (total > 50000) {
            lockCard = true;
        } else {
            lockCard = false;
        }
        System.out.println("Tiền phạt sau điều chỉnh: " + total + " VND");
        System.out.println("Yêu cầu khóa thẻ: " + lockCard);

    }
}

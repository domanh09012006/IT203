package SESSION01;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách: ");
        double usdPrice = sc.nextDouble();
        System.out.print("Nhập tỷ giá: ");
        float tyGia = sc.nextFloat();
        double vndPrice = usdPrice * tyGia;
        long roundedPrice = (long) vndPrice;

        System.out.println("Giá chính xác: " + vndPrice);
        System.out.println("Giá làm tròn để thanh toán: " + roundedPrice);
    }
}

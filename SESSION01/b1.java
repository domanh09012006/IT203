package SESSION01;
import java.util.Scanner;
public class b1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();
        System.out.print("Nhập giá bìa: ");
        double price = sc.nextDouble();
        System.out.print("Sách còn trong kho (true/false): ");
        boolean isAvailable = sc.nextBoolean();
        int bookAge = 2026 - publishYear;

        String status;
        if (isAvailable == true) {
            status = "Còn sách";
        } else {
            status = "Đã mượn";
        }
        System.out.println("\n--- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + bookName);
        System.out.println("Mã số: " + bookID + " | Tuổi thọ: " + bookAge + " năm");
        System.out.printf("Giá bán: %.2f VND\n", price);
        System.out.println("Tình trạng: " + status);
    }
}

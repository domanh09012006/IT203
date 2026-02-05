//-- Vòng lặp
//1. Viết thuật toán kiểm tra số nguyên nhập vào và in ra thông báo
//kết luận số nhập vào có phải số nguyên tố hay không
//
//2. Tìm và in ra 100 số nguyên tố đầu tiên
//
//3. Viết chương trình thực hiện menu chức năng sau :
//        +------------------Menu---------------------+
//        |1. Nhập vào 1 số nguyên dương n            |
//        |2. Tính tổng của số chẵn và tổng số lẻ < n |
//        |3. Tìm các số hoàn hảo < n                 |
//        |4. Tính n!                                 |
//        |5. Thoát chương trình                      |
//        +-------------------------------------------+
package SESSION02;
import java.util.Scanner;
public class thuchanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, a=1, checkSHH = 0;
        int choice;
        do {
            System.out.println("""
                +------------------Menu---------------------+
                |1. Nhập vào 1 số nguyên dương n            |
                |2. Tính tổng của số chẵn và tổng số lẻ < n |
                |3. Tìm các số hoàn hảo < n                 |
                |4. Tính n!                                 |
                |5. Thoát chương trình                      |
                +-------------------------------------------+
                """);
            System.out.println("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:// Nhập vào 1 số nguyên dương n
                    System.out.println("Nhap so nguyen duong n: ");
                    n = sc.nextInt();
                    break;
                case 2:// Tính tổng của số chẵn và tổng số lẻ < n
                    int chan = 0;
                    int le = 0;
                    for (int i = 0; i < n; i++) {
                        if (i % 2 == 0) {
                            chan += i;
                        } else {
                            le += i;
                        }
                    }
                    System.out.println("Tong chan: "+ chan);
                    System.out.println("Tong le: "+ le);
                    break;
                case 3:
                    int giaiThua = 1;
                    for(int i=1; i<=n; i++){
                        giaiThua = giaiThua*i;
                    }
                    System.out.println(n + "! = " + giaiThua);
                    break;
                case 4:

                    break;
                case 5:
                    a=2;
                    break;
                default:
                    System.out.println("Khong co lua chon nay");
            }
        }while(a<2);

    }

}

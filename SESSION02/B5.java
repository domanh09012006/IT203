package SESSION02;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diem = 100;
        int ngayTre;
        while (true) {
            System.out.print("Nhap so ngay tre (999 de thoat): ");
            ngayTre = sc.nextInt();

            if (ngayTre == 999) {
                break;
            }
            if (ngayTre <= 0) {
                diem += 5;
            } else {
                diem -= ngayTre * 2;
            }
        }
        System.out.println("Tong diem uy tin: " + diem);
        if (diem > 120) {
            System.out.println("Xep loai: Doc gia than thiet");
        } else if (diem >= 80) {
            System.out.println("Xep loai: Doc gia tieu chuan");
        } else {
            System.out.println("Xep loai: Doc gia can luu y");
        }
    }
}

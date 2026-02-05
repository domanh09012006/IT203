package SESSION02;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        System.out.println("Nhap ma khu vuc (A, B, C, D):");
        choice = sc.next().charAt(0);
        switch (choice){
            case 'A':
                System.out.println("Vị trí: Tầng 1 - Sách Văn học");
                break;
            case 'B':
                System.out.println("Vị trí: Tầng 2 - Sách Khoa học");
                break;
            case 'C':
                System.out.println("Vị trí: Tầng 3 - Sách Ngoại ngữ");
                break;
            case 'D':
                System.out.println("Vị trí: Tầng 4 - Sách Tin học");
                break;
            default:
                System.out.println("Khu vực không hợp lệ");
        }
    }
}

package SESSION02;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        int book;
        System.out.print("Nhap tuoi cua ban: ");
        age = sc.nextInt();
        System.out.print("Nhap so sach dang muon: ");
        book = sc.nextInt();
        if (age >= 18 && book < 3) {
            System.out.println("Cho phep muon sach");
        } else {
            if (age < 18) {
                System.out.println("Ban chua du tuoi de muon sach");
            }
            if (book >= 3) {
                System.out.println("Ban da muon qua so luong cho phep");
            }
        }
    }
}

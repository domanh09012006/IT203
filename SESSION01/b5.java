package SESSION01;

import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        int code = sc.nextInt();

        int thousands = code / 1000;
        int hundreds  = (code / 100) % 10;
        int dozens    = (code / 10) % 10;
        int units     = code % 10;
        int sumOfFirstThree = thousands + hundreds + dozens;
        int check = sumOfFirstThree % 10;
        System.out.println("kiem tra: " + check);

        if (check == units) {
            System.out.println("kq: HỢP LỆ");
        } else {
            System.out.println("kq: SAI MÃ");
        }
    }
}

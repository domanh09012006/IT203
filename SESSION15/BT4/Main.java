package SESSION15.BT4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmergencyQueue eq = new EmergencyQueue();
        int choice;
        do {
            System.out.println("\n===== HE THONG CAP CUU =====");
            System.out.println("1. Them benh nhan");
            System.out.println("2. Goi benh nhan tiep theo");
            System.out.println("3. Hien thi danh sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhap ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap muc do (1: cap cuu, 2: thuong): ");
                    int priority = sc.nextInt();
                    sc.nextLine();
                    eq.addPatient(id, name, priority);
                    break;
                case 2:
                    eq.callNextPatient();
                    break;
                case 3:
                    eq.displayQueue();
                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
            }

        } while (choice != 0);
    }
}
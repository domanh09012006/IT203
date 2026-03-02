package SESSION15.BT2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientQueue patientQueue = new PatientQueue();
        int choice;
        do {
            System.out.println("\n===== QUAN LY HANG CHO KHAM BENH =====");
            System.out.println("1. Them benh nhan");
            System.out.println("2. Goi benh nhan tiep theo");
            System.out.println("3. Xem benh nhan sap kham");
            System.out.println("4. Hien thi danh sach cho");
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

                    System.out.print("Nhap tuoi: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    Patient p = new Patient(id, name, age);
                    patientQueue.addPatient(p);
                    break;
                case 2:
                    patientQueue.callNextPatient();
                    break;
                case 3:
                    Patient next = patientQueue.peekNextPatient();
                    if (next != null) {
                        System.out.println("Benh nhan tiep theo: " + next);
                    }
                    break;
                case 4:
                    patientQueue.displayQueue();
                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
            }

        } while (choice != 0);
    }
}
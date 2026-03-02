package SESSION15.BT5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmergencyCaseQueue queue = new EmergencyCaseQueue();
        EmergencyCase currentCase = null;
        int choice;
        do {
            System.out.println("\n===== HE THONG CAP CUU =====");
            System.out.println("1. Them benh nhan vao hang doi");
            System.out.println("2. Lay benh nhan tiep theo");
            System.out.println("3. Them buoc xu ly");
            System.out.println("4. Undo buoc xu ly");
            System.out.println("5. Hien thi cac buoc xu ly");
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
                    EmergencyCase c = new EmergencyCase(p);
                    queue.addCase(c);
                    break;
                case 2:
                    currentCase = queue.getNextCase();
                    break;
                case 3:
                    if (currentCase == null) {
                        System.out.println("Ko co benh nhan");
                        break;
                    }
                    System.out.print("Nhap buoc: ");
                    String desc = sc.nextLine();
                    System.out.print("Nhap thoi gian: ");
                    String time = sc.nextLine();
                    currentCase.addStep(new TreatmentStep(desc, time));
                    break;
                case 4:
                    if (currentCase != null) {
                        currentCase.undoStep();
                    } else {
                        System.out.println("Chua co benh nhan dang xu ly.");
                    }
                    break;
                case 5:
                    if (currentCase != null) {
                        currentCase.displaySteps();
                    } else {
                        System.out.println("Chua co benh nhan dang xu ly.");
                    }
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
            }
        } while (choice != 0);
    }
}
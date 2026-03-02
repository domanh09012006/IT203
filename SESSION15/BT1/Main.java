package SESSION15.BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MedicalRecordHistory history = new MedicalRecordHistory();
        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ LỊCH SỬ BỆNH ÁN =====");
            System.out.println("1. Thêm chỉnh sửa");
            System.out.println("2. Undo chỉnh sửa");
            System.out.println("3. Xem chỉnh sửa gần nhất");
            System.out.println("4. Hiển thị lịch sử");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap des: ");
                    String desc = sc.nextLine();

                    System.out.print("Nhap tg: ");
                    String time = sc.nextLine();
                    EditAction action = new EditAction(desc, time);
                    history.addEdit(action);
                    break;
                case 2:
                    history.undoEdit();
                    break;
                case 3:
                    EditAction latest = history.getLatestEdit();
                    if (latest != null) {
                        System.out.println("Chỉnh sửa gần nhất: " + latest);
                    }
                    break;
                case 4:
                    history.displayHistory();
                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
            }

        } while (choice != 0);
    }
}
package BTTH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int choice;
        int count = 0;
        do{
            System.out.println("""
                    ===== QUẢN LÝ ĐIỂM SINH VIÊN =====
                    1. Nhập danh sách sinh viên\s
                    2. Hiển thị danh sách sinh viên\s
                    3. Tìm kiếm sinh viên theo Học lực\s
                    4. Sắp xếp theo học lực giảm dần
                    5. Thoát\s
                    ==================================
                    
                    """);
            System.out.println("Chon chuc nang:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:// nhap danh sach sinh vien
                    System.out.print("Nhap so luong sinh vien: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh vien thu " + (count + 1));
                        String id;
                        while (true) {
                            System.out.print("Nhap ma SV (VD: SV001): ");
                            id = sc.nextLine();
                            if (id.startsWith("SV") && id.length() == 5) {
                                break;
                            }
                            System.out.println("Ma SV khong hop le!");
                        }
                        System.out.print("Nhap ten: ");
                        String name = sc.nextLine();
                        System.out.print("Nhap diem: ");
                        double score = sc.nextDouble();
                        sc.nextLine();
                        students[count] = new Student(id,name,score);
                        count++;
                    }
                    break;
                case 2:// hien thi danh sach sinh vien
                    if (count == 0) {
                        System.out.println("Danh sach rong!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                case 3:// tim kiem sinh vien theo hoc luc
                    System.out.print("Nhap hoc luc can tim: ");
                    String rank = sc.nextLine();
                    boolean check = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getRank().contains(rank)) {
                            System.out.println(students[i]);
                            check = true;
                        }
                    }
                    if (!check) {
                        System.out.println("Khong tim thay sinh vien phu hop!");
                    }
                    break;
                case 4:// sap xep theo hoc luc giam dan
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (students[i].getScore() < students[j].getScore()) {
                                Student temp = students[i];
                                students[i] = students[j];
                                students[j] = temp;
                            }
                        }
                    }
                    System.out.println("Da sap xep theo hoc luc giam dan!");
                    break;
                case 5:// thoat
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai ");
            }
        }while(choice != 5);
    }
}

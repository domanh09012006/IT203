package SESSION05;

import java.util.Scanner;

public class MSSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] studentID = new String[100];
        int choice;

        while (true) {
            System.out.println("----- MENU QUAN LY SINH VIEN -----");
            System.out.println("1. Hien thi danh sach sinh vien");
            System.out.println("2. Them moi ma sinh vien");
            System.out.println("3. Cap nhat ma sinh vien");
            System.out.println("4. Xoa ma sinh vien");
            System.out.println("5. Tim kiem sinh vien");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Hiển thị
                    System.out.println("Danh sach sinh vien:");
                    boolean empty = true;
                    for (int i = 0; i < studentID.length; i++) {
                        if (studentID[i] != null) {
                            System.out.println(studentID[i]);
                            empty = false;
                        }
                    }
                    if (empty) {
                        System.out.println("Danh sach rong!");
                    }
                    break;

                case 2: // Thêm mới
                    System.out.print("Nhap ma so sinh vien can them: ");
                    String newID = sc.next();
                    String regex = "^B\\d{7}$";
                    if (!newID.matches(regex)) {
                        System.out.println("MSSV khong hop le! (Vi du: B2101234)");
                        break;
                    }
                    for (int i = 0; i < studentID.length; i++) {
                        if (studentID[i] == null) {
                            studentID[i] = newID;
                            System.out.println("Da them MSSV: " + newID);
                            break;
                        }
                    }
                    break;
                case 3: // Cập nhật
                    System.out.print("Nhap MSSV can cap nhat: ");
                    String udID = sc.next();
                    boolean CHECK = false;
                    for (int i = 0; i < studentID.length; i++) {
                        if (udID.equals(studentID[i])) {
                            System.out.print("Nhap MSSV moi: ");
                            String newUpdateID = sc.next();
                            if (newUpdateID.matches("^B\\d{7}$")) {
                                studentID[i] = newUpdateID;
                                System.out.println("Cap nhat thanh cong!");
                            } else {
                                System.out.println("MSSV moi khong hop le!");
                            }
                            CHECK = true;
                            break;
                        }
                    }
                    if (!CHECK) {
                        System.out.println("Khong tim thay MSSV!");
                    }
                    break;
                case 4: // Xóa
                    System.out.print("Nhap MSSV can xoa: ");
                    String deleteID = sc.next();
                    boolean deleted = false;
                    for (int i = 0; i < studentID.length; i++) {
                        if (deleteID.equals(studentID[i])) {
                            studentID[i] = null;
                            System.out.println("Da xoa MSSV!");
                            deleted = true;
                            break;
                        }
                    }
                    break;
                case 5: // Tìm kiếm
                    System.out.print("Nhap MSSV can tim: ");
                    String searchID = sc.next();
                    for(int i = 0; i<studentID.length; i++){
                        if(searchID.equals(studentID[i])){
                            System.out.println("Da tim thay MSSV: " + studentID[i]);
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Tam biet! Hen gap lai 👋");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}

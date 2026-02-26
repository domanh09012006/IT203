package SESSION13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Patient {
    String id;
    String fullName;
    int age;
    String diagnosis;
    public Patient(String id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }
}
public class BT5 {
    static ArrayList<Patient> patients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        for (Patient p : patients) {
            if (p.id.equals(id)) {
                System.out.println("ID đã tồn tại.");
                return;
            }
        }
        System.out.print("Nhập họ tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();
        patients.add(new Patient(id, name, age, diagnosis));
        System.out.println("Đã thêm bệnh nhân.");
    }
    public static void updateDiagnosis() {
        System.out.print("Nhập ID bệnh nhân: ");
        String id = sc.nextLine();
        for (Patient p : patients) {
            if (p.id.equals(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                p.diagnosis = sc.nextLine();
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân.");
    }
    public static void removePatient() {
        System.out.print("Nhập ID bệnh nhân cần xuất viện: ");
        String id = sc.nextLine();
        for (Patient p : patients) {
            if (p.id.equals(id)) {
                patients.remove(p);
                System.out.println("Đã xuất viện.");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân.");
    }
    public static void sortPatients() {
        patients.sort(new Comparator<Patient>() {
            @Override
            public int compare(Patient a, Patient b) {
                if (b.age != a.age) {
                    return b.age - a.age;
                }
                return a.fullName.compareToIgnoreCase(b.fullName);
            }
        });

        for (Patient p : patients) {
            System.out.println(p.id + " | " + p.fullName + " | " + p.age + " | " + p.diagnosis);
        }
    }
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== QUẢN LÝ BỆNH NHÂN =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    removePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 5);
    }
}

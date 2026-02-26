package SESSION13.btth;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IManager<Category> categoryManager = new CategoryManager();
        IManager<Book> bookManager = new BookManager();
        int choice;

        do {
            System.out.println("\n===== MENU CHÍNH =====");
            System.out.println("1. Quản lý Danh mục");
            System.out.println("2. Quản lý Sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    int cChoice;
                    do {
                        System.out.println("\n--- QUẢN LÝ DANH MỤC ---");
                        System.out.println("1. Thêm");
                        System.out.println("2. Sửa");
                        System.out.println("3. Xóa");
                        System.out.println("4. Hiển thị");
                        System.out.println("0. Quay lại");
                        System.out.print("Chọn: ");
                        cChoice = Integer.parseInt(sc.nextLine());

                        switch (cChoice) {
                            case 1:
                                System.out.print("ID: ");
                                int id = Integer.parseInt(sc.nextLine());
                                System.out.print("Name: ");
                                String name = sc.nextLine();
                                System.out.print("Description: ");
                                String des = sc.nextLine();
                                categoryManager.add(new Category(id, name, des));
                                break;
                            case 2:
                                System.out.print("ID cần sửa: ");
                                int uid = Integer.parseInt(sc.nextLine());
                                System.out.print("Name mới: ");
                                String uname = sc.nextLine();
                                System.out.print("Description mới: ");
                                String udes = sc.nextLine();
                                categoryManager.update(new Category(uid, uname, udes));
                                break;
                            case 3:
                                System.out.print("ID cần xóa: ");
                                int did = Integer.parseInt(sc.nextLine());
                                categoryManager.delete(did);
                                break;
                            case 4:
                                categoryManager.displayAll();
                                break;
                        }
                    } while (cChoice != 0);
                    break;

                case 2:
                    int bChoice;
                    do {
                        System.out.println("\n--- QUẢN LÝ SÁCH ---");
                        System.out.println("1. Thêm");
                        System.out.println("2. Sửa");
                        System.out.println("3. Xóa");
                        System.out.println("4. Hiển thị");
                        System.out.println("0. Quay lại");
                        System.out.print("Chọn: ");
                        bChoice = Integer.parseInt(sc.nextLine());

                        switch (bChoice) {
                            case 1:
                                System.out.println("Danh mục hiện có:");
                                categoryManager.displayAll();
                                System.out.print("ID sách: ");
                                int id = Integer.parseInt(sc.nextLine());
                                System.out.print("Title: ");
                                String title = sc.nextLine();
                                System.out.print("Author: ");
                                String author = sc.nextLine();
                                System.out.print("CategoryID: ");
                                int cid = Integer.parseInt(sc.nextLine());
                                bookManager.add(new Book(id, title, author, cid));
                                break;
                            case 2:
                                System.out.print("ID sách cần sửa: ");
                                int uid = Integer.parseInt(sc.nextLine());
                                System.out.print("Title mới: ");
                                String title2 = sc.nextLine();
                                System.out.print("Author mới: ");
                                String author2 = sc.nextLine();
                                System.out.print("CategoryID mới: ");
                                int cid2 = Integer.parseInt(sc.nextLine());
                                bookManager.update(new Book(uid, title2, author2, cid2));
                                break;
                            case 3:
                                System.out.print("ID cần xóa: ");
                                int did = Integer.parseInt(sc.nextLine());
                                bookManager.delete(did);
                                break;
                            case 4:
                                bookManager.displayAll();
                                break;
                        }
                    } while (bChoice != 0);
                    break;
            }

        } while (choice != 0);
    }
}
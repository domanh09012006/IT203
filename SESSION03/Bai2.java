package SESSION03;

import java.util.Scanner;

public class Bai2 {
    public static void searchBooks(String[] books, String search) {
        boolean find = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].toLowerCase().contains(search.toLowerCase())) {
                System.out.println("Da tim thaytai vt: " + i);
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("Khong tim thay");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String[] books = {"Doraemon", "Conan", "Sieu nhan gao"};
        System.out.print("Nhap ten sach: ");
        name = sc.nextLine();
        searchBooks(books, name);
    }
}


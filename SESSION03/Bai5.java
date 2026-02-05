package SESSION03;

import java.util.Scanner;

public class Bai5 {
    public static void deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Khong tim thay sach");
            return;
        }
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Da xoa sach");
    }
    public static void displayBooks(int[] arr, int n) {
        System.out.print("Danh sach sach: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101, 102, 103, 104, 105};
        int n = 5;
        while (n > 0) {
            displayBooks(books, n);
            System.out.print("Nhap ma sach can xoa (0 de thoat): ");
            int id;
            id = sc.nextInt();
            if (id == 0) {
                break;
            }
            deleteBook(books, n, id);
            n--;
        }
        System.out.println("bai bai");
    }
}


package SESSION04;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bookName;
        String author;
        System.out.println("Nhap ten sach: ");
        bookName = sc.nextLine();
        System.out.println("Nhap ten tac gia: ");
        author = sc.nextLine();
        // Loại bỏ khoảng trắng thừa ở hai đầu và giữa các từ
        bookName = bookName.trim().replaceAll("\\s+", " ");
        author = author.trim().replaceAll("\\s+", " ");
        //Định dạng lại: Tên sách viết hoa toàn bộ, Tên tác giả viết hoa chữ cái đầu mỗi từ
        bookName = bookName.toUpperCase();
        String[] upperAuthor = author.split(" ");
        for(int i = 0; i<upperAuthor.length; i++){
            upperAuthor[i] = upperAuthor[i].toLowerCase();
            upperAuthor[i] = Character.toUpperCase(upperAuthor[i].charAt(0)) + upperAuthor[i].substring(1);
        }
        author = String.join(" ", upperAuthor);
        System.out.println("Ten sach: " + bookName);
        System.out.println("Ten tac gia: " + author);
    }
}

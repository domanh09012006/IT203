package SESSION06;

class Book {
    String bookId;
    String bookName;
    double price;
    public Book(String bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Ma sach: " + bookId);
        System.out.println("Ten sach: " + bookName);
        System.out.println("Gia: " + price);
    }
}
public class bt05 {
    public static void main(String[] args) {
        Book b1 = new Book("B01", "CSDL", 10);
        Book b2 = new Book("B02", "JAVA", 20);
        b1.displayInfo();
        b2.displayInfo();
    }
}



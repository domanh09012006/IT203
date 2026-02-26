package SESSION13.btth;

public class Book {
    private int id;
    private String title;
    private String author;
    private int categoryId;

    public Book(int id, String title, String author, int categoryId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void displayData() {
        System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author + " | CategoryID: " + categoryId);
    }
}

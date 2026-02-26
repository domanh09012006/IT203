package SESSION13.btth;

import java.util.ArrayList;
import java.util.List;

public class BookManager implements IManager<Book> {
    private List<Book> books = new ArrayList<>();

    @Override
    public void add(Book item) {
        books.add(item);
        System.out.println("Thêm sách thành công.");
    }

    @Override
    public void update(Book item) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == item.getId()) {
                books.set(i, item);
                System.out.println("Cập nhật sách thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sách.");
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                System.out.println("Xóa sách thành công.");
                return;
            }
        }
        System.out.println("ID không tồn tại.");
    }

    @Override
    public void displayAll() {
        if (books.isEmpty()) {
            System.out.println("Danh sách sách trống.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            books.get(i).displayData();
        }
    }
}

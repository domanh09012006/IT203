package SESSION13.btth;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements IManager<Category> {
    private List<Category> categories = new ArrayList<>();

    @Override
    public void add(Category item) {
        categories.add(item);
        System.out.println("Thêm danh mục thành công.");
    }

    @Override
    public void update(Category item) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getId() == item.getId()) {
                categories.set(i, item);
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy danh mục.");
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getId() == id) {
                categories.remove(i);
                System.out.println("Xóa thành công.");
                return;
            }
        }
        System.out.println("ID không tồn tại.");
    }

    @Override
    public void displayAll() {
        if (categories.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        for (int i = 0; i < categories.size(); i++) {
            categories.get(i).displayData();
        }
    }
}
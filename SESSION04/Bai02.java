package SESSION04;

public class Bai02 {
    public static void main(String[] args) {

        String desc = "Sach giao khoa Toan lop 12, Ke: A1-102, tinh trang moi";

        if (desc.contains("Ke:")) {
            String[] parts = desc.split("Ke:");
            String afterKe = parts[1];
            String location = afterKe.split(",")[0].trim();
            System.out.println("Vi tri tim thay: " + location);
            String newDesc = desc.replace("Ke:", "Vi tri luu tru:");
            System.out.println("Mo ta moi: " + newDesc);
        } else {
            System.out.println("Khong tim thay thong tin ke sach");
        }
    }
}

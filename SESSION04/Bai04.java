package SESSION04;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Bai04 {
    public static void main(String[] args) {
        String id = "TV202312345";
        Pattern p1 = Pattern.compile("^[A-Z]{2}.*$");
        Matcher m1 = p1.matcher(id);
        if (!m1.matches()) {
            System.out.println("Thieu tien to 2 chu cai viet hoa");
            return;
        }
        Pattern p2 = Pattern.compile("^[A-Z]{2}\\d{4}.*$");
        Matcher m2 = p2.matcher(id);
        if (!m2.matches()) {
            System.out.println("Nam khong hop le");
            return;
        }
        Pattern p3 = Pattern.compile("^[A-Z]{2}\\d{4}\\d{5}$");
        Matcher m3 = p3.matcher(id);
        if (!m3.matches()) {
            System.out.println("5 chu so cuoi khong hop le");
            return;
        }
        System.out.println("Ma the hop le!");
    }
}

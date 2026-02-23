package SESSION10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
public class BT6 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Mouse", 20));
        products.add(new Product("Keyboard", 50));
        products.add(new Product("Monitor", 300));

        // gia tang dan
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });
        System.out.println("Danh sach sap xep theo gia tang dan:");
        for (Product p : products) {
            System.out.println(p.name + ";" + p.price);
        }
        System.out.println();
        // theo ten A-Z
        Collections.sort(products, (p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("Danh sach sap xep theo ten A-Z:");
        for (Product p : products) {
            System.out.println(p.name + ";" + p.price);
        }
        /*
         Khi nao bat buoc dung Anonymous Class thay vi Lambda?
         - Khi can them thuoc tinh rieng trong class tam thoi
         - Khi can viet nhieu method hoac logic phuc tap
         - Khi interface khong phai functional interface (co nhieu hon 1 method truu tuong)
         Lambda chi dung duoc khi interface co duy nhat 1 method truu tuong.
        */
    }
}

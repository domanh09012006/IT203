package SESSION03;

public class Bai3 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }
        System.out.println("Sach co nhieu nhat la: " + max);
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println(names[i]);
            }
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }
        System.out.println("Sach it nhat la" + min );
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println(names[i]);
            }
        }
    }
    public static void main(String[] args) {
        // Mang doi
        String[] names = {"Python Pro", "Web Design", "Data Structure", "Java Basic", "HTML CSS"};
        int[] quantities = {50, 50, 5, 20, 20};
        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }
}


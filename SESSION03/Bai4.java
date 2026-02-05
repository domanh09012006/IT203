package SESSION03;

public class Bai4 {
    public static void sortBooks(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] books = {2,3,4,1,9,6,5,8,7};
        System.out.println("Truoc sap xep:");
        displayBooks(books);
        sortBooks(books);
        System.out.println("Sap xep tang dan:");
        displayBooks(books);
    }
}


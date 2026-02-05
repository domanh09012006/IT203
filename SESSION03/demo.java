package SESSION03;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arrayInt;
        int n, max = 0, min = Integer.MAX_VALUE, sum = 0;
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        arrayInt = new int[n];
        System.out.println("Nhap gia tri cho cac phan tu trong mang: ");
        for(int i = 0; i<n; i++){
            System.out.println("Nhap phaan tu thu " + (i+1) + ": ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.println("Mang cua nhap la: ");
        for(int i = 0; i<n; i++){
            System.out.print(arrayInt[i] + ";");
        }
        System.out.println("\nCac so nguyen to trong mang la:");
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 1; j<arrayInt[i]; j++){
                if(arrayInt[i]%j == 0){
                    count++;
                }
            }
            if(count < 2){
                System.out.print(arrayInt[i]+";");
            }
        }
        System.out.println("\nCac so Fibonacci trong mang la:");
        for(int i = 1; i<=n; i++){
            if (arrayInt[i] == (arrayInt[i]-1)+(arrayInt[i]-2)) {
                System.out.print(arrayInt[i]+";");
            }

        }
        for (int i = 0; i<n; i++) {
            if (arrayInt[i] > max) {
                max = arrayInt[i];
            }
            if (arrayInt[i] < min) {
                min = arrayInt[i];
            }
        }
        System.out.println("\nGia tri lon nhat va nho nhat trong mang lan luot la: " + max + " va " + min);
        for(int i = 0; i<n; i++){
            int temp = 1;
            for(int j = 1; j<=arrayInt[i]; j++){
                temp*=j;
            }
            sum+=temp;
        }
        System.out.println("Tong giai thua cua cac phan tu trong mang la: " + sum);
    }
}

package SESSION01;

import java.util.Scanner;
public class b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stt;
        int ke, viTri;
        String khuVuc;
        System.out.print("NHap thu tu sachg: ");
        stt = sc.nextInt();

        ke = (stt - 1)/25 + 1;
        viTri = (stt - 1)%25 + 1;

        khuVuc = (ke <= 10) ? "Khu Can " : "Khu Vien ";

        System.out.println("\n--- THONG TIN DINH VI ---");
        System.out.println("Sach so: " + stt);
        System.out.println("Dia chi: Ke " + ke + " - Vi tri " + viTri);
        System.out.println("Phan khu: " + khuVuc);
    }
}

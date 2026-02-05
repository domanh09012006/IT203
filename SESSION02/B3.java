package SESSION02;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int book;
        int tienPhat = 0;
        System.out.print("Nhap so sach da muon : ");
        book = sc.nextInt();
        for(int i = 1; i<=book; i++){
            int ngayMuon;
            System.out.println("Nhap so ngay muon cua sach thu "+ i);
            ngayMuon = sc.nextInt();
            ngayMuon = ngayMuon*5000;
            tienPhat = tienPhat + ngayMuon;
        }
        System.out.println("Tong tien phat: " + tienPhat + " VND");
    }
}

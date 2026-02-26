package SESSION13;

import java.util.ArrayList;

public class BT2 {
    public static void main(String[] args) {
        ArrayList<String> medical = new ArrayList<>();
        //Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen"
        medical.add("Paracetamol");
        medical.add("Ibuprofen");
        medical.add("Panadol");
        medical.add("Paracetamol");
        medical.add("Aspirin");
        medical.add("Ibuprofen");
        System.out.println("Danh sach thuoc: " + medical);
        ArrayList<String> uniqueMedical = new ArrayList<>();
        for (String medicine : medical) {
            if (!uniqueMedical.contains(medicine)) {
                uniqueMedical.add(medicine);
            }
        }
        uniqueMedical.sort(null);
        System.out.println("Danh sach thuoc khong trung lap: " + uniqueMedical);
    }
}

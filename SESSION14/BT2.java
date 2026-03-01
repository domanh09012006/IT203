package SESSION14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Map<String, String> drugs = new HashMap<>();

        drugs.put("T01", "Paracetamol");
        drugs.put("T02", "Ibuprofen");
        drugs.put("T03", "Aspirin");
        drugs.put("T04", "Amoxicillin");
        drugs.put("T05", "Vitamin C");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mac: ");
        String code = sc.nextLine();

        if (drugs.containsKey(code)) {
            System.out.println("ten: " + drugs.get(code));
        } else {
            System.out.println("ko ton tai thuoc.");
        }
    }
}

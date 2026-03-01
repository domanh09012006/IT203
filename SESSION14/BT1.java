package SESSION14;

import java.util.LinkedHashSet;
import java.util.Set;

public class BT1 {
    public static void main(String[] args) {
        String[] input = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        };
        Set<String> patients = new LinkedHashSet<>();
        for (String name : input) {
            patients.add(name);
        }
        System.out.println("Danh sach:");
        for (String patient : patients) {
            System.out.println(patient);
        }
    }
}

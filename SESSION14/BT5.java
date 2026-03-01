package SESSION14;

import java.util.Comparator;
import java.util.TreeSet;

class Patient {
    String name;
    int severity;
    int arrivalTime;
    Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }
}
public class BT5 {
    public static void main(String[] args) {

        TreeSet<Patient> patients = new TreeSet<>(new Comparator<Patient>() {
            public int compare(Patient a, Patient b) {
                if (a.severity != b.severity) {
                    return a.severity - b.severity;
                }
                return a.arrivalTime - b.arrivalTime;
            }
        });
        patients.add(new Patient("Bệnh nhân A", 3, 800));
        patients.add(new Patient("Bệnh nhân B", 1, 815));
        patients.add(new Patient("Bệnh nhân C", 1, 805));

        System.out.println("Thứ tự xử lý:");

        for (Patient p : patients) {
            System.out.println(p.name + " (Mức " + p.severity + ", đến lúc " + p.arrivalTime + ")");
        }
    }
}

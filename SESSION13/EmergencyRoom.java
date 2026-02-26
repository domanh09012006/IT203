package SESSION13;

import java.util.LinkedList;

public class EmergencyRoom {
    private LinkedList<String> patients = new LinkedList<>();
    public void patientCheckIn(String name) {
        patients.addLast(name);
    }
    public void emergencyCheckIn(String name) {
        patients.addFirst(name);
    }
    public void treatPatient() {
        if (patients.isEmpty()) {
            System.out.println("khong con banh nhan");
            return;
        }
        String name = patients.removeFirst();
        if (name.equals("C")) {
            System.out.println("cap cuu: " + name);
        } else {
            System.out.println("kham: " + name);
        }
    }
    public static void main(String[] args) {
        EmergencyRoom room = new EmergencyRoom();
        room.patientCheckIn("A");
        room.patientCheckIn("B");
        room.emergencyCheckIn("C");

        room.treatPatient();
        room.treatPatient();
        room.treatPatient();
    }
}

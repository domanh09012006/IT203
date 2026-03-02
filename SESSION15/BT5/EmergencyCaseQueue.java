package SESSION15.BT5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        cases = new LinkedList<>();
    }

    public void addCase(EmergencyCase c) {
        cases.add(c);
        System.out.println("Da them " + c.getPatient());
    }

    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Ko co benh nhan");
            return null;
        }

        EmergencyCase c = cases.poll();
        System.out.println("Dang xu ly benh nhan: " + c.getPatient());
        return c;
    }
}
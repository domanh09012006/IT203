package SESSION15.BT4;

import java.util.PriorityQueue;
import java.util.Comparator;

public class EmergencyQueue {
    private PriorityQueue<EmergencyPatient> queue;
    private int counter = 0;
    public EmergencyQueue() {
        queue = new PriorityQueue<>(new Comparator<EmergencyPatient>() {
            @Override
            public int compare(EmergencyPatient a, EmergencyPatient b) {
                if (a.getPriority() != b.getPriority()) {
                    return a.getPriority() - b.getPriority();
                }
                return a.getOrder() - b.getOrder();
            }
        });
    }

    public void addPatient(String id, String name, int priority) {
        EmergencyPatient p = new EmergencyPatient(id, name, priority, counter++);
        queue.add(p);
        System.out.println("Da them benh nhan: " + p);
    }

    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Ko co ai trỏng hang cho");
            return null;
        }

        EmergencyPatient p = queue.poll();
        System.out.println("Dang kham: " + p);
        return p;
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }

        System.out.println("\nDanh sach cho: ");
        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }
}
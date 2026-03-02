package SESSION15.BT2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue;

    public PatientQueue() {
        queue = new LinkedList<>();
    }
    // enqueue
    public void addPatient(Patient p) {
        queue.add(p);
        System.out.println("Da them benh nhan: " + p);
    }
    // dequeue
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Ko co ai trong hang cho");
            return null;
        }
        Patient p = queue.poll();
        System.out.println("Dang kham benh nhan: " + p);
        return p;
    }
    // peek
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Ko co ai trong hang cho");
            return null;
        }
        return queue.peek();
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }
        System.out.println("\nDanh sach cho:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
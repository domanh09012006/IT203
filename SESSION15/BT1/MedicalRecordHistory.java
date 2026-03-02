package SESSION15.BT1;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> history;

    public MedicalRecordHistory() {
        history = new Stack<>();
    }
    // push
    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("da them chinh suaa: " + action);
    }
    // pop
    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Ko the hoan tac");
            return null;
        }
        EditAction action = history.pop();
        System.out.println("Da hoan tac" + action);
        return action;
    }

    // peek
    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("Stack rong");
            return null;
        }
        return history.peek();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Ko co lich su chinh sua");
            return;
        }

        System.out.println("\nLich su:");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}
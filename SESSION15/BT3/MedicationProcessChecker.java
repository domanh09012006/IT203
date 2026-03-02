package SESSION15.BT3;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack;
    public MedicationProcessChecker() {
        stack = new Stack<>();
    }
    public boolean checkProcess(String[] actions) {
        reset();
        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];
            if (action.equals("PUSH")) {
                stack.push(action);
                System.out.println("PUSH");

            } else if (action.equals("POP")) {

                if (stack.isEmpty()) {
                    System.out.println("Loi");
                    return false;
                }

                stack.pop();
                System.out.println("POP");

            } else {
                System.out.println("Loi");
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Ket thuc ca truc nhung van con chua xong");
            return false;
        }

        System.out.println("Quy trinh hop le");
        return true;
    }
    public void reset() {
        stack.clear();
    }
}
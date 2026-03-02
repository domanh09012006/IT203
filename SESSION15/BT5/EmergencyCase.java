package SESSION15.BT5;

import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps;
    public EmergencyCase(Patient patient) {
        this.patient = patient;
        steps = new Stack<>();
    }

    public Patient getPatient() {
        return patient;
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Da them buoc: " + step);
    }
    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Ko co buac nao hoan tac");
            return null;
        }
        TreatmentStep step = steps.pop();
        System.out.println("Da hoan tac " + step);
        return step;
    }
    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chua co buoc xu ly");
            return;
        }
        System.out.println("Danh sach buoc xu ly:");
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println(steps.get(i));
        }
    }
}
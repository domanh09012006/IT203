package SESSION15.BT3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MedicationProcessChecker checker = new MedicationProcessChecker();
        System.out.println("Nhap so : ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] actions = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap thao tac (PUSH/POP): ");
            actions[i] = sc.nextLine().toUpperCase();
        }
        System.out.println("\nCheck:");
        boolean result = checker.checkProcess(actions);
        if (result) {
            System.out.println("Dung");
        } else {
            System.out.println("Sai.");
        }
    }
}
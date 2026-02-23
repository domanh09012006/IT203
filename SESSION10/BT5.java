package SESSION10;

abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();
}
interface BonusCalculator {
    double getBonus();
}
class OfficeStaff extends Employee {
    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
class Manager extends Employee implements BonusCalculator {
    private double bonus;
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    @Override
    public double getBonus() {
        return bonus;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }
}
public class BT5 {
    public static void main(String[] args) {
        Employee emp1 = new OfficeStaff("Nhan vien van phong", 8000);
        Employee emp2 = new Manager("Quan ly", 15000, 5000);
        System.out.println("luong nv:");
        System.out.println(emp1.name);
        System.out.println("Luong cuoi: " + emp1.calculateSalary());
        System.out.println();
        System.out.println(emp2.name);
        System.out.println("Luong cuoi: " + emp2.calculateSalary());
    }
}
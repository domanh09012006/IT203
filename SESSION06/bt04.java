package SESSION06;

class Employee {
    String ID;
    String fullName;
    double salary;

    // 1. Constructor không tham số
    public Employee() {
        ID = "rong";
        fullName = "rong";
        salary = 0;
    }

    // 2. Constructor có mã và tên
    public Employee(String ID, String fullName) {
        this.ID = ID;
        this.fullName = fullName;
        this.salary = 0;
    }
    public Employee(String ID, String fullName, double salary) {
        this.ID = ID;
        this.fullName = fullName;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Ma NV: " + ID);
        System.out.println("Ten NV: " + fullName);
        System.out.println("Luong: " + salary);
    }
}
public class bt04 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("NV01", "Nguyen Van A");
        Employee e3 = new Employee("NV02", "Tran Thi B", 1);
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}


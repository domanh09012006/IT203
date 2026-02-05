package SESSION09.b5;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new OfficeEmployee("Nguyen Van A", 10000000);
        employees[1] = new ProductionEmployee("Tran Thi B", 300, 20000);
        employees[2] = new ProductionEmployee("Le Van C", 150, 30000);
        double totalSalary = 0;
        System.out.println("Danh sach luong:");
        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i].calculateSalary();
            totalSalary += salary;
            System.out.println(employees[i].getName() + ": " + salary);
        }
        System.out.println(
                "Tong: " + totalSalary
        );
    }
}

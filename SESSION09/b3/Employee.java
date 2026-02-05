package SESSION09.b3;

class Employee {
    private String name;
    private double baseSalary;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public void displayInfo() {
        System.out.println("Ten: " + name);
        System.out.println("Luong co ban: " + baseSalary);
    }
}

class Manager extends Employee {
    private String department;
    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phong ban: " + department);
    }
}


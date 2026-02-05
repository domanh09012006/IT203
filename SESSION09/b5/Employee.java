package SESSION09.b5;

class Employee {
    protected String name;
    public Employee(String name) {
        this.name = name;
    }
    public double calculateSalary() {
        return 0;
    }
    public String getName() {
        return name;
    }
}
class OfficeEmployee extends Employee {
    private double baseSalary;
    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }
    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
class ProductionEmployee extends Employee {
    private int numOfProducts;
    private double price;
    public ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }
    @Override
    public double calculateSalary() {
        return numOfProducts * price;
    }
}
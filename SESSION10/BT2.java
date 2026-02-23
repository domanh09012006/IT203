package SESSION10;

abstract class Vehicle {
    protected String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public abstract void move();
}
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    @Override
    public void move() {
        System.out.println(brand + "Cach di chuyen");
    }
}
class Bicycle extends Vehicle {
    public Bicycle(String brand) {
        super(brand);
    }
    @Override
    public void move() {
        System.out.println(brand + "Cach di chuyen");
    }
}
public class BT2 {
    public static void main(String[] args) {
        Vehicle car = new Car("honda");
        Vehicle bicycle = new Bicycle("1 banh");

        car.move();
        bicycle.move();
    }
}
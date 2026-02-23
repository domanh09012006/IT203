package SESSION10;

import java.util.Scanner;

interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle implements Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        double radius = sc.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double width = sc.nextDouble();
        System.out.print("Nhap chieu cao hinh chu nhat: ");
        double height = sc.nextDouble();
        Shape circle = new Circle(radius);
        Shape rectangle = new Rectangle(width, height);
        System.out.println("===== KET QUA =====");
        System.out.println("Hinh tron:");
        System.out.println("Dien tich: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());

        System.out.println("Hinh chu nhat:");
        System.out.println("Dien tich: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());
    }
}
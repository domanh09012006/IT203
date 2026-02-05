package SESSION07;

class Student2 {
    String name;
    public Student2(String name) {
        this.name = name;
    }
}
public class B2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;
        System.out.println(a);
        System.out.println(b);
        Student2 s1 = new Student2("An");
        Student2 s2 = s1;
        s2.name = "Binh";

        System.out.println("\nReference:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}

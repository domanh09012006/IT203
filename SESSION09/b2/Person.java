package SESSION09.b2;

class Person {
    private String fullName;
    private int age;
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Ho ten: " + fullName);
        System.out.println("Tuoi: " + age);
    }
}
class Student extends Person {
    private String studentId;
    private double gpa;
    public Student(String fullName, int age, String studentId, double gpa) {
        super(fullName, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Diem trung binh: " + gpa);
    }
}



package SESSION06;

class Student {
    String studentId;
    String fullName;
    int dateOfBirth;
    double avg;

    public Student(String studentId, String fullName, int birthYear, double avgScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.dateOfBirth = birthYear;
        this.avg = avgScore;
    }
    public void displayInfo() {
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Ho ten: " + fullName);
        System.out.println("Nam sinh: " + dateOfBirth);
        System.out.println("Diem trung binh: " + avg);
    }
}
public class bt01 {
    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyen Van A", 2004, 10);
        Student sv2 = new Student("SV002", "Tran Thi B", 2005, 10);
        sv1.displayInfo();
        sv2.displayInfo();
    }
}


package SESSION07;

public class B4 {
    public static double classFund = 0;
    private String studentName;
    public B4(String studentName) {
        this.studentName = studentName;
    }
    public void donate(double amount) {
        classFund += amount;
        System.out.println(studentName + ":" + amount);
    }
    public static void showClassFund() {
        System.out.println("Tong quy: " + classFund);
    }
    public static void main(String[] args) {

        B4 sv1 = new B4("An");
        B4 sv2 = new B4("Binh");
        B4 sv3 = new B4("Chi");

        sv1.donate(100000);
        sv2.donate(150000);
        sv3.donate(200000);
        B4.showClassFund();
    }
}
    


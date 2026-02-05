package SESSION06;

import java.util.Date;

public class DEMOSS6 {
    public static void main(String[] args) {
        student student = new student();
        student.studentID = "S001";
        student.fullName = "Nguyen Van A";
        student.dateOfBirth = new Date();
        student.email = "a@gmail.com";
        student.phoneNumber = "0123456789";

        student.checkIn();
        student.doHomeWork();
    }
}

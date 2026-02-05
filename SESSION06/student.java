package SESSION06;

import java.util.Date;

public class student {
    String studentID;
    public String fullName;
    Date dateOfBirth;
    String email;
    String phoneNumber;

    // constructor
    public student(){
        studentID = "S001";
        fullName = "Nguyen Van A";
        dateOfBirth = new Date();
        email = "a@gmail.com";
        phoneNumber = "0123456789";
    }

    public student(String studentID, String fullName, Date dateOfBirth, String email, String phoneNumber) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
//    public student(String studentIdIn, String fullNameIn, Date dateOfBirthIn, String emailIn, String phoneNumberIn){
//        studentID = studentIdIn;
//        fullName = fullNameIn;
//        dateOfBirth = new Date();
//        email = emailIn;
//        phoneNumber = phoneNumberIn;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void checkIn(){
        System.out.println("Student "+ fullName + " checked in at " + new Date());
    }
    void doHomeWork(){
        System.out.println("Student "+ fullName + " is doing homework.");
    }
}

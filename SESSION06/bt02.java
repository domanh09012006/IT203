package SESSION06;

class Account {
    String username;
    String password;
    String email;
    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Doi mat khau thanh cong!");
    }
    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Mat khau: ******");
    }
}
public class bt02 {
    public static void main(String[] args) {
        Account acc = new Account("us1", "123456", "m@gmail.com");
        acc.displayInfo();
        acc.changePassword("111111");
        acc.displayInfo();
    }
}


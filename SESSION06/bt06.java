package SESSION06;

class User {
    private String id;
    private String username;
    private String password;
    private String email;

    public User(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
    public void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Password khong duoc rong!");
        }
    }
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email khong hop le!");
        }
    }
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("-----------------------");
    }
}
public class bt06 {
    public static void main(String[] args) {

        User u1 = new User("U01", "admin", "123456", "admin@gmail.com");
        u1.displayInfo();

        User u2 = new User("U02", "user02", "abcdef", "user02gmail.com");
        u2.displayInfo();

        User u3 = new User("U03", "user03", "", "user03@gmail.com");
        u3.displayInfo();

        u3.setPassword("newpass123");
        u3.setEmail("user03@gmail.com");
        u3.displayInfo();
    }
}


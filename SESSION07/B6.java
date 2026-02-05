package SESSION07;

public class B6 {
    static class User {
        public final int id;
        public String username;
        public String password;

        public User(int id, String username, String password) {
            this.id = id;
            this.username = username;
            this.password = password;
        }
        public String toString() {
            return "User[id=" + id + ", name=" + username + "]";
        }
    }
    static class UserManager {
        public static User[] users = new User[100];
        public static int count = 0;

        public static void addUser(User u) {
            users[count] = u;
            count++;
        }
        public static boolean checkLogin(String username, String password) {
            for (int i = 0; i < count; i++) {
                if (users[i].username.equals(username)
                        && users[i].password.equals(password)) {
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {

        User u1 = new User(1, "dev_a", "123456");
        User u2 = new User(2, "dev_b", "abcdef");
        User u3 = new User(3, "dev_c", "999999");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println(">> Da them 3 user vao he thong.");
        System.out.println("Danh sach hien tai:");

        for (int i = 0; i < UserManager.count; i++) {
            System.out.println((i + 1) + ". " + UserManager.users[i]);
        }
        System.out.println("\n>> Kiem tra dang nhap:");
        System.out.println("- Login (\"dev_a\", \"123456\"): "
                + (UserManager.checkLogin("dev_a", "123456") ? "Thanh cong!" : "That bai!"));
        System.out.println("- Login (\"dev_b\", \"sai_pass\"): "
                + (UserManager.checkLogin("dev_b", "sai_pass") ? "Thanh cong!" : "That bai!"));
    }
}

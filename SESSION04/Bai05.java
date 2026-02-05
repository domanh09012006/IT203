package SESSION04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai05 {
    public static void main(String[] args) {

        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: NguyenVanB | Action: RETURN | BookID: BK67890",
                "2024-05-22 | User: NguyenVanA | Action: BORROW | BookID: BK99999"
        };
        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: (\\w+) \\| Action: (BORROW|RETURN) \\| BookID: (BK\\d+)";
        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        for (int i = 0; i < logs.length; i++) {
            Matcher matcher = pattern.matcher(logs[i]);
            if (matcher.find()) {
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookID = matcher.group(4);

                System.out.println("Ngay: " + date);
                System.out.println("Nguoi dung: " + user);
                System.out.println("Hanh dong: " + action);
                System.out.println("Ma sach: " + bookID);
                if (action.equals("BORROW")) {
                    borrowCount++;
                } else if (action.equals("RETURN")) {
                    returnCount++;
                }
            }
        }

        System.out.println("Tong BORROW: " + borrowCount);
        System.out.println("Tong RETURN: " + returnCount);
    }
}

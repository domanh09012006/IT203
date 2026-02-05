package SESSION04;

public class Bai03 {
    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};
        String ngayTao = "24/01/2026";
        // builder
        StringBuilder builder = new StringBuilder();
        builder.append("--- BAO CAO MUON SACH ---\n");
        builder.append("Ngay tao: ").append(ngayTao).append("\n");
        for (int i = 0; i < transactions.length; i++) {
            builder.append("Giao dich: ").append(transactions[i]).append("\n");
        }
        //string
        String str = "-bao cao-\n";
        str += "Ngay tao: " + ngayTao + "\n";
        for (int i = 0; i < transactions.length; i++) {
            str += "Giao dich: "+transactions[i];
        }
        System.out.println("builder:");
        System.out.println(builder.toString());
        System.out.println("String:");
        System.out.println(str);
    }
}


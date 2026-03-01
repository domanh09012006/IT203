package SESSION14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BT4 {
    public static void main(String[] args) {

        List<String> diseases = new ArrayList<>();
        diseases.add("Cúm A");
        diseases.add("Sốt xuất huyết");
        diseases.add("Cúm A");
        diseases.add("Covid-19");
        diseases.add("Cúm A");
        diseases.add("Sốt xuất huyết");

        Map<String, Integer> report = new TreeMap<>();

        for (int i = 0; i < diseases.size(); i++) {
            String disease = diseases.get(i);

            if (report.containsKey(disease)) {
                report.put(disease, report.get(disease) + 1);
            } else {
                report.put(disease, 1);
            }
        }

        System.out.println("Báo cáo ca bệnh:");
        for (String key : report.keySet()) {
            System.out.println(key + ": " + report.get(key) + " ca");
        }
    }
}

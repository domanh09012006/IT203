package SESSION13;

import java.util.ArrayList;
import java.util.List;

public class FindCommonPatients {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();
        for (T item : listA) {
            if (listB.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> khoaNoi = new ArrayList<>();
        khoaNoi.add(101);
        khoaNoi.add(102);
        khoaNoi.add(105);
        List<Integer> khoaNgoai = new ArrayList<>();
        khoaNgoai.add(102);
        khoaNgoai.add(105);
        khoaNgoai.add(108);

        List<Integer> commonInt = findCommonPatients(khoaNoi, khoaNgoai);
        System.out.println(commonInt);

        List<String> bhytA = new ArrayList<>();
        bhytA.add("DN01");
        bhytA.add("DN02");
        bhytA.add("DN03");
        List<String> bhytB = new ArrayList<>();
        bhytB.add("DN02");
        bhytB.add("DN04");

        List<String> commonString = findCommonPatients(bhytA, bhytB);
        System.out.println(commonString);
    }
}

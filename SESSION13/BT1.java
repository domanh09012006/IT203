package SESSION13;

import java.util.ArrayList;
import java.util.Iterator;

public class BT1 {
    public static void main(String[] args){
        ArrayList<Double> list = new ArrayList<>();
        list.add(36.5);
        list.add(40.2);
        list.add(37.0);
        list.add(12.5);
        list.add(39.8);
        list.add(99.9);
        list.add(36.8);
        System.out.println("Danh sach nhiet do: " + list);
        Iterator<Double> iterator = list.iterator();
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp < 34.0 || temp > 42.0) {
                iterator.remove();
            }
        }
        System.out.println("Danh sach nhiet do sau khi loc: " + list);

    }
}

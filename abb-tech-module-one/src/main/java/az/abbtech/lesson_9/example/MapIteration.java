package az.abbtech.lesson_9.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteration {
    public static void main(String[] args) {

        Map<Integer, String> regions = new HashMap<>();
        regions.put(10, "Baku");
        regions.put(06,"Agsu");
        regions.put(29, "Xizi");
        regions.put(34, "Qax");
        regions.put(23, "Goycay");
        regions.put(99, "Baku");

        Set<Integer> keys = regions.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }

        System.out.println("===========");

        Collection<String> strValue = regions.values();
        for (String value : strValue) {
            System.out.println(value);
        }

        System.out.println("===========");

        Set<Map.Entry<Integer, String>> keyValue = regions.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = keyValue.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}

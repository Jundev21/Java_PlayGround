package callByReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) {

        String[][] fileName = {{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}, {"i", "j"}, {"k", "l"}};
        Map<String, List<String>> filtermap = new HashMap<>();

        for (String[] nameArr : fileName) {
            String name = nameArr[0];
            filtermap.put(name, new ArrayList<>());
        }

        System.out.println("=======================");
        System.out.println("Before add arrayList");

        for (String key : filtermap.keySet()) {
            System.out.printf("%s: %s\n", key, filtermap.get(key));
        }

        addData(filtermap);

        System.out.println("=======================");
        System.out.println("After add arrayList");

        for (String key : filtermap.keySet()) {
            System.out.printf("%s: %s\n", key, filtermap.get(key));
        }

    }


    public static void addData(Map<String, List<String>> filtermap) {

        for (String key : filtermap.keySet()) {
            filtermap.get(key).add(key + "data name");
        }


    }
}



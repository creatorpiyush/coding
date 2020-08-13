package hashmap;

import java.util.*;

public class HashMapmain {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap();

        map.put("India", 500);
        map.put("Russia", 400);
        map.put("Aus", 200);
        map.put("USA", 450);
        map.put("NZ", 150);

        System.out.println(map);

        System.out.println("**** Getting values using Keys ****");
        System.out.println(map.get("India"));
        System.out.println(map.get("USA"));
        System.out.println(map.get("UK")); // * output : null

        System.out.println("**** Removing ****");
        System.out.println(map.remove("Aus")); // * output: returns value for key and removes it.
        System.out.println(map);

        System.out.println("**** check is it contain key ****");
        System.out.println(map.containsKey("India")); // * case-sensitive
        System.out.println(map.containsKey("RSA"));

        System.out.println("**** Getting all Keys ****");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("**** Getting all values ****");
        Collection<Integer> values = map.values();
        for (int value : values) {
            System.out.println(value);
        }

        System.out.println("**** Getting all key & values pairs ****");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }

        System.out.println("**** get Intersection of 2 arrays ****");
        int[] one = { 3, 1, 5, 7 };
        int[] two = { 1, 5, 3, 4, 6 };
        System.out.println(getIntersection(one, two));

    }

    public static ArrayList<Integer> getIntersection(int[] one, int[] two) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < one.length; i++) {
            map.put(one[i], false);
        }

        for (int i = 0; i < two.length; i++) {
            if (map.containsKey(two[i])) {
                list.add(two[i]);
            }
        }

        return list;

    }

}
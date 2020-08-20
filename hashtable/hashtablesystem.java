package hashtable;

import java.util.Hashtable;

public class hashtablesystem {

    public static void main(String[] args) {

        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Piyush", 10);
        table.put("Anand", 15);
        System.out.println(table);

        System.out.println(table.get("Piyush"));

    }

}
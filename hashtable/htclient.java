package hashtable;

public class htclient {

    public static void main(String[] args) throws Exception {
        hashtable<String, Integer> table = new hashtable<>(4);
        table.put("India", 300);
        table.put("Russia", 200);
        System.out.println(table);

        table.put("China", 325);
        table.put("Finland", 50);
        table.put("Aus", 100);
        table.put("NZ", 150);
        table.put("India", 320);
        table.put("USA", 155);
        System.out.println(table);
        System.out.println(table.get("Russia"));
        System.out.println(table.get("USA"));

        table.remove("Finland");
        System.out.println(table);
    }

}
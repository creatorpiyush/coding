public class startandendtime {

    public static long start;
    public static long end;

    public static void start() {
        start = System.currentTimeMillis();
    }

    public static long end() {
        end = System.currentTimeMillis();
        return end - start;
    }

    public static void main(String[] args) {

        start();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);
        }
        System.out.println("============");
        System.out.println(end());

        System.out.println("============");
        start();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i * j);
            }
        }
        System.out.println("============");
        System.out.println(end());

    }

}
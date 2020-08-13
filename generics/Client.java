package generics;

public class Client {

    public static void main(String[] args) {
        RawPair rawpair = new RawPair();

        rawpair.one = 1;
        rawpair.two = "SMS";

        // Integer data = pair1.one;//! Problem 1 => no get without typecast
        Integer data = (Integer) rawpair.one;
        System.out.println(data);

        // Integer twodata = (Integer) rawpair.two;
        // System.out.println(twodata);

        Pair<Integer> pairint = new Pair<>();
        pairint.one = 1;
        // pair.one = "SMS"; // ! not possible
        pairint.two = 2;

        Integer one = pairint.one;
        System.out.println(one);

        System.out.println(pairint.two);

        Pair<String> pairstr = new Pair<>();
        pairstr.one = "one";
        // pairstr.two = 2; // ! not possible
        pairstr.two = "two";

        System.out.println(pairstr.one);
        System.out.println(pairstr.two);

    }

}
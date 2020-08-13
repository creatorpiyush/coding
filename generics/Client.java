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
    }

}
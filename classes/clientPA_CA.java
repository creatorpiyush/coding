package classes;

public class clientPA_CA {

    public static void main(String[] args) {

        // not allowed
        // PA obj = new PA();
        // CA obj = new PA();

        PA obj1 = new CA();

        obj1.Fun();
        obj1.Fun1();
        obj1.Fun2();
        obj1.Fun2();

        System.out.println("*********************");

        CA obj = new CA();
        // everything allowed
    }

}
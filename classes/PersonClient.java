package classes;

public class PersonClient {

    public static void main(String[] args) {

        Person p = new Person();

        System.out.println(p);

        System.out.println(p.name);
        System.out.println(p.age);

        p.name = "Piyush";
        p.age = 19;
        System.out.println(p.name);
        System.out.println(p.age);

    }

}
package classes;

public class Person {

    public int age;
    public String name;

    Person() {
        System.out.println("Hello");
    }

    Person(int myage, String name) {
        this.name = name;
        this.age = myage;
    }

}
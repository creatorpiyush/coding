package classes;

public class Student {

    // private is for data-hiding
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception {

        if (name.equals("") || name == null) {
            throw new Exception("Name can't be Null or Empty");
        }

        this.name = name;

    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) throws Exception {

        if (age < 0) {
            throw new Exception("Age can't be less than zero");
        }

        this.age = age;

    }

}
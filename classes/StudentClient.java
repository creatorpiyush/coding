package classes;

public class StudentClient {

    public static void main(String[] args) throws Exception {

        Student s = new Student();

        s.setName("Piyush");
        s.setAge(19);
        System.out.println(s.getName());
        System.out.println(s.getAge());

        s.setName("Piyush");
        s.setAge(-10);
        System.out.println(s.getName());
        System.out.println(s.getAge());

    }

}
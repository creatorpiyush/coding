package classes;

public class StudentClient {

    public static void main(String[] args) throws Exception {

        // * normal object creation
        // Student s = new Student();

        // s.setName("Piyush");
        // s.setAge(19);
        // System.out.println(s.getName());
        // System.out.println(s.getAge());

        // s.setName("Piyush");
        // s.setAge(-10);
        // System.out.println(s.getName());
        // System.out.println(s.getAge());

        Student[] students = new Student[1000];
        // System.out.println(students[0].rollNo);

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i + "th");
            System.out.println(Student.GetNumOfStudents());
        }

        // Able to access static field but cant change the value
        System.out.println(Student.MAX_STUDENTS);
        // Student.MAX_STUDENTS = 2000; // ! error can't change value

        System.out.println(students[250].rollNo);

        System.out.println(students[250].getName());
        students[250].setName("ABC");
        System.out.println(students[250].getName());

    }

}
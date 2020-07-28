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

    // * final means value can be set only once. Can be public
    public final int rollNo;

    // * static means, it belongs to the class(it is not copied in each object)
    private static int NumOfStudents = 0;

    public static int GetNumOfStudents() {
        return Student.NumOfStudents;
    }

    private static String UniformColor = "White";

    public static String GetUniformColor() {
        return Student.UniformColor;
    }

    public static void SetUniformColor(String uniformColor) {
        Student.UniformColor = uniformColor;
    }

    // * nothing more than the effects of both static and final
    public static final int MAX_STUDENTS = 1000;

    public Student(String name) throws Exception {
        if (Student.NumOfStudents == Student.MAX_STUDENTS) {
            throw new Exception("Max limit reached...");
        }
        this.setName(name);

        Student.NumOfStudents++;
        this.rollNo = Student.NumOfStudents;
    }

}
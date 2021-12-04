package Lesson8;

public class Student {
    String name;
    int course;
    static int count;

    public Student(String name1, int course1) {
        count++;
        name = name1;
        course = course1;
        System.out.println("Student # " + count + " created");
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Efim", 1);
        Student st2 = new Student("Stesha", 3);
        Student st3 = new Student("Alex", 4);
    }
}

package Lesson10;

public class StudentTest {
    String name;
    int course;
    double grade;

    StudentTest(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swapPerson(StudentTest st1, StudentTest st2) {
        StudentTest st3 = st1;
        st1 = st2;
        st2 = st3;
    }

    public static void changeName(StudentTest s1) {
        s1.name = "Vasya";
    }

    public static void main(String[] args) {
        StudentTest st1 = new StudentTest("Ivan", 3, 4.5);
        StudentTest st2 = new StudentTest("Efim", 1, 3.55);
//        swapPerson(st1, st2);
//        System.out.println(st1.name);
//        System.out.println(st2.name);

        changeName(st2);
        System.out.println(st2.name);

    }
}

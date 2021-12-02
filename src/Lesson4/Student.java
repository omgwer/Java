package Lesson4;

public class Student
{
    int billetNumber;
    String name;
    String surname;
    int studyYear;
    double meanEconomics;
    double meanMath;
    double meanEnglish;

    void averageGrade(Student student1)
    {
        double result = (student1.meanEconomics + student1.meanMath + student1.meanEnglish) / 3;
        System.out.println(result);
    }
}

class StudentTest
{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.billetNumber = 1;
        student1.name = "Efim";
        student1.surname = "Kotov";
        student1.studyYear = 2011;
        student1.meanEconomics = 4.31;
        student1.meanEnglish = 3.95;
        student1.meanMath = 4.55;

        student2.billetNumber = 2;
        student2.name = "Albina";
        student2.surname = "Ivanova";
        student2.studyYear = 2015;
        student2.meanEconomics = 3.33;
        student2.meanEnglish = 4.3;
        student2.meanMath = 4.02;

        student3.billetNumber = 3;
        student3.name = "Alex";
        student3.surname = "Efimov";
        student3.studyYear = 2018;
        student3.meanEconomics = 3.65;
        student3.meanEnglish = 4.12;
        student3.meanMath = 4.33;

//        System.out.println("mean score " + student1.name + " " + student1.surname + " = " + (student1.meanEconomics + student1.meanMath + student1.meanEnglish) / 3);
//        System.out.println("mean score " + student2.name + " " + student2.surname + " = " + (student2.meanEconomics + student2.meanMath + student2.meanEnglish) / 3);
//        System.out.println("mean score " + student3.name + " " + student3.surname + " = " + (student3.meanEconomics + student3.meanMath + student3.meanEnglish) / 3);

        student1.averageGrade(student1);
        student1.averageGrade(student2);
        student1.averageGrade(student3);
    }
}

package Lesson6;

public class Employee
{
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(String surname3, int age3)
    {
        this(0, surname3, age3, 0.0, null);
    }

    Employee(int id2, String surname2, int age2)
    {
        this(id2, surname2, age2, 0.0, null);
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4)
    {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }
}

class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee emp = new Employee(1, "Ivanov", 25);
        Employee emp1 = new Employee("Petrov", 38);
        Employee emp2 = new Employee(3, "Sidirov", 40, 134.34, "IT");
        System.out.println(emp2.department);
    }
}

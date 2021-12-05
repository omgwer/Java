package Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id1, String surname1, int age1, double salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    double DoubleSalary() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee Emp1 = new Employee(3, "Efimov", 16, 240, "Business");
        Employee Emp2 = new Employee(1, "Ivanov", 25, 130, "Programming");

        Emp1.salary = Emp1.DoubleSalary();
        System.out.println(Emp1.salary);
    }
}

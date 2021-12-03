package Lesson7;

public class Employee {
    public double salary;

    public void doubleSallary() {
        System.out.println("new salary = " + salary * 2);
    }

    public Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee em1 = new Employee(500);
        System.out.println(em1.salary);
        em1.doubleSallary();

    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee em2 = new Employee(500);
    }
}

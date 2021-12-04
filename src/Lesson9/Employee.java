package Lesson9;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double magnifier(double a) {
        a = a * 2;
        return a;
    }

    public double zh2() {
        salary = salary * 2;
        return  salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Efim", 145.33);
        double res = emp1.magnifier(emp1.salary);
        System.out.println(res);
        System.out.println(emp1.salary);
        emp1.zh2();
        System.out.println(emp1.salary);

    }
}


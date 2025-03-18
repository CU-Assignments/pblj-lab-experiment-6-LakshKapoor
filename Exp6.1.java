import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
}

public class exp6_easy {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, 50000));
        employees.add(new Employee("Alice", 25, 60000));
        employees.add(new Employee("Bob", 35, 55000));
        
        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);
        
        // Sorting by name using lambda expression
        employees.sort(Comparator.comparing(emp -> emp.name));
        System.out.println("\nSorted by Name:");
        employees.forEach(System.out::println);
        
        // Sorting by age using lambda expression
        employees.sort(Comparator.comparingInt(emp -> emp.age));
        System.out.println("\nSorted by Age:");
        employees.forEach(System.out::println);
        
        // Sorting by salary using lambda expression
        employees.sort(Comparator.comparingDouble(emp -> emp.salary));
        System.out.println("\nSorted by Salary:");
        employees.forEach(System.out::println);
    }
}


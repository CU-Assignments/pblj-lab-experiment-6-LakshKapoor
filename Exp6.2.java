import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class exp6_medium {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85),
            new Student("Bob", 72),
            new Student("Charlie", 90),
            new Student("David", 65),
            new Student("Emma", 78)
        );

        List<String> topStudents = students.stream()
            .filter(s -> s.marks > 75) // Filter students with marks above 75
            .sorted(Comparator.comparingDouble(s -> -s.marks)) // Sort by marks descending
            .map(s -> s.name) // Extract names
            .collect(Collectors.toList());

        System.out.println("Students scoring above 75% (sorted by marks):");
        topStudents.forEach(System.out::println);
    }
}

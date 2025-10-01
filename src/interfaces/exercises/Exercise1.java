package interfaces.exercises;

import java.util.*;

/**
 * TODO:
 * Exercise 1:
 * Create a Student class with name and grade.
 * Implement Comparable<Student> so that students are sorted by grade.
 * In main(), add some students to a List and sort them using Collections.sort().
 * Print the sorted list.
 * Note : Comparable<T> interface (built-in in Java).
 */

public class Exercise1
{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Bob", 72));
        students.add(new Student("Charlie", 90));
        students.add(new Student("Diana", 78));
        students.add(new Student("Alice", 85));

        System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students);

        System.out.println("\nAfter sorting by grade: ");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    static class Student implements Comparable<Student>
    {
        private String name;
        private int grade;

        public Student(String name, int grade)
        {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public int compareTo(Student s) {
            return Integer.compare(this.grade, s.grade);
        }

        @Override
        public String toString()
        {
            return "Name: " + name + ", Grade: " + grade;
        }
    }
}


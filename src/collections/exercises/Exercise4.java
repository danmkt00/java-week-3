package collections.exercises;

/**
 TODO:
 1. Create a Map<String, List<Integer>> grades.
    - Key = student name
    - Value = list of grades
 2. Add at least 3 students with multiple grades each.
 3. Print all students with their grades.
 4. Calculate and print the average grade for each student.
*/

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Map<String, List<Integer>> grades = new HashMap<>();

        grades.put("Alice", Arrays.asList(90, 85, 78));
        grades.put("Bob", Arrays.asList(88, 92, 79, 95));
        grades.put("Charlie", Arrays.asList(70, 75, 80));

        for (Map.Entry<String, List<Integer>> entry : grades.entrySet()) {
            String student = entry.getKey();
            List<Integer> studentGrades = entry.getValue();

            System.out.println(student + "'s grades: " + studentGrades);

            double average = 0;
            for (int grade : studentGrades) {
                average += grade;
            }
            average /= studentGrades.size();

            System.out.println(student + "'s average: " + String.format("%.2f", average));
            System.out.println("----------------------");
        }
    }
}

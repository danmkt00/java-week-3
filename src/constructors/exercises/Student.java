package constructors.exercises;

/**
 TODO:
 1. Create class Student with:
      - private field name
      - private static field studentCount
 2. Each new Student should get a unique ID (increment studentCount).
 3. Add a method getStudentInfo() to print name and ID.
 4. Add a static method getTotalStudents().
*/

public class Student
{
    private String name;
    private int id;
    private static int studentCount = 0;

    Student(String name)
    {
        this.name = name;
        studentCount++;
        id = studentCount;
    }

    public void getStudentInfo()
    {
        System.out.println("Student's name is: " + name);
        System.out.println("Student's id is: " + id);
    }

    public static int getTotalStudents()
    {
        return studentCount;
    }

}

package inheritance.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 TODO:
 1. Create a superclass Person with fields name and age.
 2. Create subclasses Student and Teacher.
      - Student has field grade (double).
      - Teacher has field subject (String).
 3. Create a method introduce() in Person that prints a generic introduction.
      - Override introduce() in Student and Teacher with specialized messages.
 4. In main():
      - Create a List<Person>.
      - Add multiple Students and Teachers.
      - Loop through the list and call introduce() on each object.
        (Demonstrates polymorphism + inheritance).
*/
class Person
{
    protected String name;
    protected int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void introduce()
    {
        System.out.println("Hello my name is: " + name + " i'm " + age);
    }
}

class Student extends Person
{
    private double grade;

    Student(String name, int age, double grade)
    {
        super(name,age);
        this.grade = grade;
    }

    @Override
    public void introduce()
    {
        System.out.println("Hello my name is: " + name + " i'm " + age + ". I'm a student and my grade is " + grade);
    }
}

class Teacher extends Person
{
    private String subject;

    Teacher(String name, int age, String subject)
    {
        super(name,age);
        this.subject = subject;
    }

    @Override
    public void introduce()
    {
        System.out.println("Hello my name is: " + name + " i'm " + age + ". I'm a teacher and my subject is " + subject);
    }

}
public class ExercisePerson
{
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Student("Daniel", 21, 100));
        people.add(new Student("Job", 32, 99));
        people.add(new Teacher("Sam", 35, "Back-End"));
        people.add(new Teacher("Liz", 30, "Management"));

        for(Person p : people)
        {
            p.introduce();
        }
    }
}

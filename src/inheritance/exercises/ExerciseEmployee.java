package inheritance.exercises;

/**
 TODO:
 1. Create a superclass Employee with:
      - name (String), salary (double).
      - method work() → prints "<name> is working".
 2. Create subclasses Developer and Manager:
      - Developer overrides work() → prints "<name> is writing code".
      - Manager overrides work() → prints "<name> is managing the team".
 3. Test both in a main class.
*/

    class Employee
    {
        protected String name;
        protected double salary;
        Employee(String name, double salary)
        {
            this.name = name;
            this.salary = salary;
        }
        public void work()
        {
            System.out.println("<" + name + "> is working");
        }
    }

    class Developer extends Employee
    {
        Developer(String name, double salary) {
            super(name, salary);
        }

        @Override
        public void work()
        {
            System.out.println("<" + name + "> is coding");

        }
    }

class Manager extends Employee
{
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work()
    {
        System.out.println("<" + name + "> is managing the team");

    }
}

public class ExerciseEmployee
{
    public static void main(String[] args) {
        Employee employee = new Employee("Dan", 1000000);
        employee.work();

        Employee developer = new Developer("Sam", 1000);
        developer.work();

        Employee manager = new Manager("Liz", 100);
        manager.work();
    }

}

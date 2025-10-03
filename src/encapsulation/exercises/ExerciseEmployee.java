package encapsulation.exercises;

/**
 TODO:
 1. Create private fields: name (String), salary (double).
 2. Write a constructor to initialize both.
 3. Add getters for both fields.
 4. Add a setter for salary that does NOT allow negative values.
 5. Create a method giveRaise(double amount) that increases salary.
 */
class Employee
{
    private final String name;
    private double salary;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setSalary(int amount)
    {
        if(amount < 0){
            System.out.println("Salary must be greater than 0");
        }else{
            salary = amount;
        }
    }

    @Override
    public String toString()
    {
        return "Employee name: " + name + " |  Salary: " + salary;
    }

}

public class ExerciseEmployee
{
    public static void main(String[] args) {
        Employee employee = new Employee("Daniel", 3500);
        System.out.println("New employee - " + employee);

        employee.setSalary(2500);
        System.out.println("Set salary to 2500 - " + employee);

        employee.setSalary(-3000);
        System.out.println("Set salary to -3000 - " + employee);
    }
}






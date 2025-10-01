package composition.exercises;

import java.util.*;

/**
 TODO:
 1. Create class Employee with fields: name, role.
 2. Create class Department that HAS-A List<Employee>.
 3. Create class Company that HAS-A List<Department>.
 4. Add methods to:
      - Add employee to a department
      - List employees by department
 5. Test with multiple departments and employees.
*/
class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return name + " (" + role + ")";
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Add employee
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    // List employees
    public void listEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            System.out.println("  - " + e);
        }
    }

    public String getName() {
        return name;
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add department
    public void addDepartment(Department d) {
        departments.add(d);
    }

    // List all employees by department
    public void listAllEmployees() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.listEmployees();
            System.out.println();
        }
    }
}

public class ExerciseCompany {
    public static void main(String[] args) {
        // Create company
        Company company = new Company("TechCorp");

        // Create departments
        Department it = new Department("IT");
        Department hr = new Department("HR");
        Department test = new Department("TEST");

        // Add employees to IT
        it.addEmployee(new Employee("Alice", "Developer"));
        it.addEmployee(new Employee("Bob", "System Admin"));

        // Add employees to HR
        hr.addEmployee(new Employee("Charlie", "HR Manager"));
        hr.addEmployee(new Employee("Diana", "Recruiter"));

        //Add employees to TEST
        test.addEmployee(new Employee("Daniel", "Something"));
        test.addEmployee(new Employee("Julia", "Something else"));
        test.addEmployee(new Employee("Ruslana", "Somehow working"));

        // Add departments to company
        company.addDepartment(it);
        company.addDepartment(hr);
        company.addDepartment(test);

        // List employees by department
        company.listAllEmployees();
    }
}

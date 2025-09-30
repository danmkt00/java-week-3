package constructors.exercises;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------");
        System.out.println("Bank Account exercise\n");

        //BankAccount
        BankAccount acc1 = new BankAccount(); // Default constructor
        BankAccount acc2 = new BankAccount("1234", 500.0);
        BankAccount acc3 = new BankAccount("5678", 1000.0);

        acc2.deposit(200);
        acc3.withdraw(300);

        System.out.println("Account 2 balance: " + acc2.getBalance());
        System.out.println("Account 3 balance: " + acc3.getBalance());

        // Checking total accounts
        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());

        System.out.println("-------------------");
        System.out.println("Car exercise\n");

        //Car
        Car unknownCar = new Car();
        Car tayotaCar = new Car("Tayota", 2025);

        unknownCar.printCarInfo();
        tayotaCar.printCarInfo();

        System.out.println("-------------------");
        System.out.println("Rectangle exercise\n");

        //Rectangle
        Rectangle square = new Rectangle(5);
        System.out.println("Area of square with width and height 5: " + square.getArea());
        System.out.println("Perimeter of square with width and height 5: " + square.getPerimeter());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of square with width 5 and height 10: " + rectangle.getArea());
        System.out.println("Perimeter of square with width 5 and height 10: " + rectangle.getPerimeter());

        System.out.println("-------------------");
        System.out.println("Student exercise\n");

        //Student
        Student student1 = new Student("Daniel");
        Student student2 = new Student("Roma");
        Student student3 = new Student("Julia");

        student1.getStudentInfo();
        student2.getStudentInfo();
        student3.getStudentInfo();

        System.out.println("\nTotal students are: " + Student.getTotalStudents());

    }
}

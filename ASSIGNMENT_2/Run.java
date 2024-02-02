import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee - 1");
        System.out.println("Rectange - 2");
        System.out.println("bankaccount - 3");
        System.out.println("Car - 4");
        System.out.println("Student - 5");
        a = sc.nextInt();
        switch (a) {
            case 1:
            // Creating Employee objects using different constructors
            Employee emp1 = new Employee("John", 101, 50000.0);
            Employee emp2 = new Employee("Alice", 102);
            Employee emp3 = new Employee("Bob");
            System.out.println("Employee 1: " + emp1.getName() + ", ID: " + emp1.getEmployeeId() + ", Salary: $" + emp1.getSalary());
            System.out.println("Employee 2: " + emp2.getName() + ", ID: " + emp2.getEmployeeId() + ", Salary: $" + emp2.getSalary());
            System.out.println("Employee 3: " + emp3.getName() + ", ID: " + emp3.getEmployeeId() + ", Salary: $" + emp3.getSalary());
            break;
            case 2:
            // Creating Rectangle objects using different constructors
            Rectangle rect1 = new Rectangle(5.0, 10.0);
            Rectangle rect2 = new Rectangle(7.0); // Creating a square
            // Displaying information
            
            System.out.println("Rectangle 1: Length = " + rect1.getLength() + ", Width = " + rect1.getWidth());
            System.out.println("Rectangle 2 (Square): Side = " + rect2.getLength());
            break;
            case 3:
            BankAccount acc1 = new BankAccount(123456);
            BankAccount acc2 = new BankAccount(789012, "John Doe");
            BankAccount acc3 = new BankAccount(345678, "Alice Smith", 1000.0);
            System.out.println("Account 1: Account Number = " + acc1.getAccountNumber() + ", Owner: " + acc1.getOwner() + ", Balance: $" + acc1.getBalance());
                System.out.println("Account 2: Account Number = " + acc2.getAccountNumber() + ", Owner: " + acc2.getOwner() + ", Balance: $" + acc2.getBalance());
                System.out.println("Account 3: Account Number = " + acc3.getAccountNumber() + ", Owner: " + acc3.getOwner() + ", Balance: $" + acc3.getBalance());
            break;
            case 4:
            Car car1 = new Car();
            Car car2 = new Car("Toyota", "Camry", 2022);
            System.out.println("Car 1: Make = " + car1.getMake() + ", Model = " + car1.getModel() + ", Year = " + car1.getYear());
            System.out.println("Car 2: Make = " + car2.getMake() + ", Model = " + car2.getModel() + ", Year = " + car2.getYear());
            break;
            case 5:
            Student student1 = new Student(101);
            Student student2 = new Student(102, "Bob");
            Student student3 = new Student(103, "Alice", 20);
            System.out.println("Student 1: ID = " + student1.getId());
            System.out.println("Student 2: ID = " + student2.getId() + ", Name = " + student2.getName());
            System.out.println("Student 3: ID = " + student3.getId() + ", Name = " + student3.getName() + ", Age = " + student3.getAge());
            break;
    }
}
}

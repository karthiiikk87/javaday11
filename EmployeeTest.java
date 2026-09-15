package programs;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101, "Karthik", 50000);
        Employee e2 = new PartTimeEmployee(102, "Arun", 80, 500);
        Employee e3 = new ContractEmployee(103, "Rahul", 40000);

        e1.displayDetails();
        e1.calculateSalary();

        System.out.println();

        e2.displayDetails();
        e2.calculateSalary();

        System.out.println();

        e3.displayDetails();
        e3.calculateSalary();
    }
}
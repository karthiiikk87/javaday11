package programs;

public class Employees {

    private int employeeId;
    private String employeeName;
    private double salary;

    Employees(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Salary updated");
        } else {
            System.out.println("Invalid salary");
        }
    }

    void display() {
        System.out.println("Employee ID = " + employeeId);
        System.out.println("Employee Name = " + employeeName);
        System.out.println("Salary = " + salary);
    }

    public static void main(String[] args) {

        Employees e = new Employees(101, "Karthik", 30000);

        e.display();

        System.out.println();

        e.setSalary(35000);
        e.display();

        System.out.println();

        e.setSalary(-5000);
        e.display();
    }
}
package programs;

class PartTimeEmployee extends Employee {

    double hours;
    double rate;

    PartTimeEmployee(int id, String name, double hours, double rate) {
        super(id, name);
        this.hours = hours;
        this.rate = rate;
    }

    void calculateSalary() {
        System.out.println("Part-Time Salary = " + (hours * rate));
    }
}
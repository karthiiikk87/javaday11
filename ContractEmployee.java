package programs;

class ContractEmployee extends Employee {

    double contractAmount;

    ContractEmployee(int id, String name, double contractAmount) {
        super(id, name);
        this.contractAmount = contractAmount;
    }

    void calculateSalary() {
        System.out.println("Contract Salary = " + contractAmount);
    }
}
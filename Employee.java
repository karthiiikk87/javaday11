package programs;

abstract class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayDetails() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
    }

    abstract void calculateSalary();
}
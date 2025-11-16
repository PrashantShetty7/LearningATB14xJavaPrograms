package Test;
class Employee {
    private int id;
    private String name;
    private double salary;

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Employee_Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting values as per input example
        emp.setId(1);
        emp.setName("John Doe");
        emp.setSalary(50000.0);

        // Displaying output
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}

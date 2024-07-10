public class Employee {
    private String name;
    private String position;
    private double salary;


    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setPosition(String position) {
        this.position = position;
        return position;
    }

    public String getPosition() {
        return position;
    }

    public String setSalary(double salary) {
        if (salary > 0.0) {
            this.salary = salary;
        } else {
            System.out.println("Salary Must be Positive value");
        }

        return null;
    }

    public double getSalary() {
        return salary;
    }

}

class EmployeeResults {
    public static void main(String[] args) {
        Employee employee = new Employee("Waleed Shoukat", "Android intern", 25000);
        String salarya = String.valueOf(employee.getSalary());
        System.out.println("Employee Salary is =>" + salarya);
        String name = employee.setName("Usama");
        String designation = employee.setPosition("Android Developer");
        employee.setSalary(280000.0);
        String salaryForEmp1 = String.valueOf(employee.getSalary());
        System.out.println("Employee Name is =>" + name);
        System.out.println("Employee Designation  is =>" + designation);
        System.out.println("Salary is =>" + salaryForEmp1);
    }
}
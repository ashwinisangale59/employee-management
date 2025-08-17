package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListEmployeesbyDepartment {
	public static void main(String[] args) {
//76. Group list of employees by department

		List<Employee>list= Arrays.asList( new Employee(1, "Ashwini", "IT", 75000),
				new Employee(2, "Ravi", "HR", 50000),
	            new Employee(3, "Priya", "Finance", 60000),
	            new Employee(4, "Kiran", "IT", 90000));
		
		Map<String, List<Employee>> collect = 
				list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(collect);
	}
}
 class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", department='" + department + '\'' +
               ", salary=" + salary +
               '}';
    }
}

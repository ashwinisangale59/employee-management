package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class GroupEmployeesDepartment {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "ashwini", "hr"));

		list.add(new Employee(1, "mac", "dev"));

		list.add(new Employee(1, "muskan", "hr"));

		list.add(new Employee(1, "ragi", "dev"));

		Map<String, List<String>> collect = list.stream().collect(
	Collectors.groupingBy(Employee::getDept, Collectors.mapping(Employee::getName, Collectors.toList())));
		
		System.out.println(collect);

	}
}

class Employee {
	int id;
	String name;
	String dept;

	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
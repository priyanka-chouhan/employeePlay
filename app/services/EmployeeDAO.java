package services;

import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeDAO {

	List<Employee> employeeList = new ArrayList<Employee>();

	public EmployeeDAO() {
		super();
		employeeList.add(new Employee(1L, "Emp1", 1, "QA"));
		employeeList.add(new Employee(2L, "Emp2", 2, "DEV"));
		employeeList.add(new Employee(3L, "Emp3", 3, "MANAGER"));
		employeeList.add(new Employee(4L, "Emp4", 4, "TEAM LEAD"));
		employeeList.add(new Employee(5L, "Emp5", 5, "QA"));
		employeeList.add(new Employee(6L, "Emp6", 6, "DEV"));
		employeeList.add(new Employee(7L, "Emp7", 7, "DEV"));
		employeeList.add(new Employee(8L, "Emp8", 8, "QA"));
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
}

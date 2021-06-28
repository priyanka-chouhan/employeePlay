package services;

import java.util.List;

import model.Employee;

public class EmployeeService {

	EmployeeDAO empDAO = new EmployeeDAO();

	public List<Employee> getAllEmpployee() {
		return empDAO.getEmployeeList();
	}

	public Employee getEmpployeebyId(Long id) {
		for (Employee e : empDAO.getEmployeeList()) {
			if (e.getId().equals(id)) {
				return e;
			}
		}
		return null;
	}

	public Employee getEmployeeByName(String name) {
		for (Employee e : empDAO.getEmployeeList()) {
			if (e.getName().equals(name)) {
				return e;
			}
		}
		return null;
	}

	public Employee AddEmployee(Employee emp) {
		empDAO.getEmployeeList().add(emp);
		return emp;
	}

	public Employee deleteEmployeebyId(Long id) {
		Employee toBeDelete = null;
		for (Employee e : empDAO.getEmployeeList()) {
			if (e.getId().equals(id)) {
				toBeDelete = e;
				break;
			}
		}
		if (toBeDelete == null) {
			return null;
		}
		empDAO.getEmployeeList().remove(toBeDelete);
		return toBeDelete;
	}

	public Employee updateEmployee(Employee emp) {
		Integer toBeUpdated = null;
		for (Employee e : empDAO.getEmployeeList()) {
			if (e.getId().equals(emp.getId())) {
				toBeUpdated = empDAO.getEmployeeList().indexOf(e);
			}
		}
		Employee oldEmp = empDAO.getEmployeeList().get(toBeUpdated);
		oldEmp = emp;
		return emp;
	}
}

package controllers;

import model.Employee;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.EmployeeService;

public class EmployeeController extends Controller {

	
	public Result getEmployee() {
		EmployeeService employeeService = new EmployeeService();
		return ok(Json.toJson(employeeService.getAllEmpployee()));
	}
	
	public Result getEmployeeById(Long id) {
		EmployeeService employeeService = new EmployeeService();
		Employee emp = employeeService.getEmpployeebyId(id);
		if(emp == null) {
			return ok("No Employee found");
		}
		return ok(Json.toJson(emp));
	}
}

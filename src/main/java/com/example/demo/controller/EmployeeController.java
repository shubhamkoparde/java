package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.sub.Employee;




@RestController
@RequestMapping("/crud")
public class EmployeeController {

	@Autowired
	private EmployeeMapper employeeMappers;


	public EmployeeController(EmployeeMapper employeeMappers) { 

		this.employeeMappers = employeeMappers; }


	@GetMapping("/employees")
	public List<Employee> findAll() {

		return employeeMappers.getAll();
	}

	@DeleteMapping("/emp/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeMappers.deleteById(id);
    }
	
	@PostMapping("/addEmployee")
	public void addEmployee(@RequestBody Employee employee) {
	    int  rowsInserted = employeeMappers.insert(employee);
	    System.out.println(rowsInserted);
	    if(rowsInserted>0) {
	    	System.out.println("successfully added");
	    }
	    else {
	    	System.out.println(" there was a problem while adding a data ");

	    }
	}
	@PutMapping("/updateEmployee/{id}")
	public String updateEmployee(@PathVariable int id, @RequestBody Employee employees) {
	employees.setId(id);
	int result = employeeMappers.update(employees);
	if (result > 0) {
	
	return "Employee " + id + " is updated successfully";
	} else {
	
	return "Employee not found with id " + id;
	}
	}


	@GetMapping("/employee/{id}")
	public Employee getID(@PathVariable int id) {

		return employeeMappers.getbyID(id);
	}

	@GetMapping("/department/{department}")
	public List<Employee> findEmpByDep(@PathVariable String department) {
	
	return employeeMappers.findEmpByDep(department);
	}

}
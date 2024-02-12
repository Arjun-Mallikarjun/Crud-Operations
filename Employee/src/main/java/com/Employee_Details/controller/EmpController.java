package com.Employee_Details.controller;
import com.Employee_Details.Repository.EmpRepository;
import com.Employee_Details.entity.Emp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@Autowired
	EmpRepository Repo;
	
	//get the all employees
	@GetMapping("/emps")
	public List<Emp> getAllEmployees(){
		 List<Emp> employees=Repo.findAll();
		return employees;
	}
	
	//get the employee by id 
	@GetMapping("/emp/{id}")
	public Emp getEmployee(@PathVariable int id) {
		Emp employee=Repo.findById(id).get();
		return employee;
	}
	
	//create the employee
	@PostMapping("/emp/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Emp createEmployee(@RequestBody Emp employee) {	
		Emp createEmp=Repo.save(employee);
		return createEmp;
	}
	
	  // Update employee
    @PutMapping("/emp/update")
    public Emp updateEmployee(@RequestBody Emp employee) {
        Emp updatedEmp = Repo.save(employee);
        return updatedEmp;
    }

	//create the employee
		@DeleteMapping("/emp/delete/{id}")
		public void deleteEmployee(@PathVariable int id) {	
			Emp employee=Repo.findById(id).get();
			Repo.delete(employee);
		}

}

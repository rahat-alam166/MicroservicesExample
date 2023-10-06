package com.genspark.employee.Controller;


import com.genspark.employee.Entity.Employee;
import com.genspark.employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{
   @Autowired
   private EmployeeService employeeService;

   @GetMapping("/")
   public List<Employee> getEmployee()
   {
      return this.employeeService.getAllEmployee();
   }

   @GetMapping("/department/{id}")
   public List<Employee> getEmployeeByDepartmentId(@PathVariable String id)
   {
      return this.employeeService.getAllEmployeeByDepartmendId(Integer.parseInt(id));
   }

   @GetMapping("/{id}")
   public Employee getEmployee(@PathVariable String id)
   {
      return this.employeeService.getByID(Integer.parseInt(id));
   }



   @PostMapping("/")
   public Employee addEmployee(@RequestBody Employee book)
   {
      return this.employeeService.addEmployee(book);
   }

   @PutMapping("/")
   public Employee updateEmployee(@RequestBody Employee book)
   {
      return this.employeeService.updateEmployee(book);
   }

   @DeleteMapping("/{id}")
   public String deleteEmployee(@PathVariable String id)
   {
      return this.employeeService.deleteEmployeeById(Integer.parseInt(id));
   }
}

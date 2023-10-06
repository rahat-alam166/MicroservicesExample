package com.genspark.employee.Service;

import com.genspark.employee.Entity.Employee;
import com.genspark.employee.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService
{

   @Autowired
   private final EmployeeRepo employeeRepo;
   public EmployeeService(EmployeeRepo employeeRepo)
   {
      this.employeeRepo = employeeRepo;
   }


   public List<Employee> getAllEmployee()
   {
      return this.employeeRepo.findAll();
   }

   public List<Employee> getAllEmployeeByDepartmendId(int departmentId)
   {
      return this.employeeRepo.findAllByDepartmentId(departmentId);
   }




   public Employee getByID(int id)
   {
      Optional<Employee> o = this.employeeRepo.findById(id);
      Employee employee = null;
      if (o.isPresent())
      {
         employee = o.get();
      }
      else
         throw new RuntimeException("Employee not found");
      return employee;
   }


   public Employee addEmployee(Employee employee)
   {
      return this.employeeRepo.save(employee);
   }


   public Employee updateEmployee(Employee employee)
   {
      return this.employeeRepo.save(employee);
   }


   public String deleteEmployeeById(int id)
   {
      this.employeeRepo.deleteById(id);
      return "Deleted";
   }
}


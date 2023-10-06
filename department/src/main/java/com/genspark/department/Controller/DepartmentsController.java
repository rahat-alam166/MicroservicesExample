package com.genspark.department.Controller;


import com.genspark.department.Entity.Departments;
import com.genspark.department.Service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentsController
{
   @Autowired
   private DepartmentsService departmentService;

   @GetMapping("/")
   public List<Departments> getDepartments()
   {
      return this.departmentService.getAllDepartments();
   }

   @GetMapping("/{id}")
   public Departments getDepartments(@PathVariable String id)
   {
      return this.departmentService.getByID(Integer.parseInt(id));
   }



   @PostMapping("/")
   public Departments addDepartments(@RequestBody Departments book)
   {
      return this.departmentService.addDepartments(book);
   }

   @PutMapping("/")
   public Departments updateDepartments(@RequestBody Departments book)
   {
      return this.departmentService.updateDepartments(book);
   }

   @DeleteMapping("/{id}")
   public String deleteDepartments(@PathVariable String id)
   {
      return this.departmentService.deleteDepartmentsById(Integer.parseInt(id));
   }
}

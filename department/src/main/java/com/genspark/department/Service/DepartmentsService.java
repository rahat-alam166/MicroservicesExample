package com.genspark.department.Service;

import com.genspark.department.Entity.Departments;
import com.genspark.department.Repo.DepartmentsRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DepartmentsService
{

   @Autowired
   private final DepartmentsRepo departmentRepo;
   public DepartmentsService(DepartmentsRepo departmentRepo)
   {
      this.departmentRepo = departmentRepo;
   }


   public List<Departments> getAllDepartments()
   {
      return this.departmentRepo.findAll();
   }




   public Departments getByID(int id)
   {
      Optional<Departments> o = this.departmentRepo.findById(id);
      Departments department = null;
      if (o.isPresent())
      {
         department = o.get();
      }
      else
         throw new RuntimeException("Departments not found");
      return department;
   }


   public Departments addDepartments(Departments department)
   {
      return this.departmentRepo.save(department);
   }


   public Departments updateDepartments(Departments department)
   {
      return this.departmentRepo.save(department);
   }


   public String deleteDepartmentsById(int id)
   {
      this.departmentRepo.deleteById(id);
      return "Deleted";
   }
}

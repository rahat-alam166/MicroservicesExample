package com.genspark.employee.Repo;

import com.genspark.employee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
   List<Employee> findAllByDepartmentId(int departmentId);
}

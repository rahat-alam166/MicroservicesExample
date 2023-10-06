package com.genspark.department.Repo;

import com.genspark.department.Entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentsRepo extends JpaRepository<Departments, Integer>
{
}

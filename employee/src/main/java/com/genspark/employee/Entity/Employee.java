package com.genspark.employee.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String name;

   private int departmentId;

}

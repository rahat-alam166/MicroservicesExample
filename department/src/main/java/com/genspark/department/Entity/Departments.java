package com.genspark.department.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Departments
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String name;

}


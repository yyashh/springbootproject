package com.mysite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysite.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}

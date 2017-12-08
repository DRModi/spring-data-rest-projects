package com.training.springdatarest.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.springdatarest.employee.entities.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}

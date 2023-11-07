package dev.alexyin.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.alexyin.crud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

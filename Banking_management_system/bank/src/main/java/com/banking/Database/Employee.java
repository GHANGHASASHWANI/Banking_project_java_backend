package com.banking.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee  extends JpaRepository<Employee, Integer> {
    void saveAll(List<Employee> employees);

    Employee findById(int id);
    List<Employee> findAll();

    Employee findByEmployeeNumber(String employeeNumber);
    
    
}

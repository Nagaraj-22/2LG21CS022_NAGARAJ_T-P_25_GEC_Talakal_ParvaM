package com.example.studentcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentcrud.model.Employee;
import com.example.studentcrud.repository.NagarajEmployeeRepository;

@Service
public class NagarajEmployeeService {

    @Autowired
    private  NagarajEmployeeRepository employeeRepository;

    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }

    public void saveEmployee(Employee Employee) {
        employeeRepository.save(Employee);
    }

    public Employee getEmployee(Long id) {
        return (Employee) employeeRepository.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    

   
   
}

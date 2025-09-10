package com.example.ems_backend.service;

import com.example.ems_backend.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployeeById(Long id);

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO updateEmployee(Long id,EmployeeDTO updatedEmployee);

    void deleteEmployee(Long id);
}

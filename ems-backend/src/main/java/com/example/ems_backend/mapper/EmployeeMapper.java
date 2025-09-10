package com.example.ems_backend.mapper;


import com.example.ems_backend.dto.EmployeeDTO;
import com.example.ems_backend.entity.Employee;

public class EmployeeMapper {

   public static EmployeeDTO mapToEmployeeDTO(Employee employee){
       return new EmployeeDTO(
               employee.getId(),
               employee.getFirstName(),
               employee.getLastName(),
               employee.getEmail(),
               employee.getPhoneNumber()
       );
   }

    public static Employee mapToEmployeeDTO(EmployeeDTO employeeDTO){
        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail(),
                employeeDTO.getPhoneNumber()
        );
    }
}

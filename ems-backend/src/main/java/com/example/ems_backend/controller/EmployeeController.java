package com.example.ems_backend.controller;


import com.example.ems_backend.dto.EmployeeDTO;
import com.example.ems_backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO){
         EmployeeDTO savedEmployee = employeeService.createEmployee(employeeDTO);
         return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id){
        EmployeeDTO employeeDTO = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employeeDTO);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(){
        List<EmployeeDTO> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
     }


     @PutMapping("/{id}")
     public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable  Long id,EmployeeDTO employeeDTO,
                                                      @RequestBody EmployeeDTO updateEmployee){
         EmployeeDTO employeeDTO1 = employeeService.updateEmployee(id,updateEmployee);
         return ResponseEntity.ok(employeeDTO1);
     }

     @DeleteMapping("/{id}")
     public ResponseEntity<?> deleteEmployee(@PathVariable Long id){
         employeeService.deleteEmployee(id);
         return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
     }
}

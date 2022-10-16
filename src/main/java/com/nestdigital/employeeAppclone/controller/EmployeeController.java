package com.nestdigital.employeeAppclone.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to Home page";
    }
    @GetMapping("/empadd")
    public String Employeeadd()
    {
        return "Add Employee Details";
    }
@GetMapping("/empsearch")
    public String EmployeeSearch(){
        return "Search Employee Details";
    }
    @GetMapping("/empdelete")
    public String EmployeeDelete()
    {
        return "Delete Employee Details";
    }
}

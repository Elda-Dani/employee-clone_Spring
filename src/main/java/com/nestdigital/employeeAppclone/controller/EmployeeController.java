package com.nestdigital.employeeAppclone.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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


    @PostMapping("/read")
    public String Read(){
        return  "Read Page";
    }

    @GetMapping("/viewall")
    public List viewall(){
        List<String> myList=new ArrayList<>();
        myList.add("{'name':'Anil','age':'25'}");
        return myList;
    }
    @GetMapping("/student")
    public String student(){
        return "Elda";
    }
}

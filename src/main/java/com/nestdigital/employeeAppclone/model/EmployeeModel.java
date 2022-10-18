package com.nestdigital.employeeAppclone.model;

public class EmployeeModel {

    private int id;
    private String empname;
    private String designation;
    private String salary;
    private String address;
    private String companyname;


    public EmployeeModel(int id, String empname, String designation, String salary, String address, String companyname) {
        this.id = id;
        this.empname = empname;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
        this.companyname = companyname;
    }

    public EmployeeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
}

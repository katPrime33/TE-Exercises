package com.techelevator;

public class Employee {

    //member vars
    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;


    //constructors
    public Employee(int employeeId, String firstName, String lastName, double annualSalary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }


    //derived properties
    public String getFullName(){
        return lastName + ", " + firstName;
    }


    //methods
    public void raiseSalary(double percent) {
        this.annualSalary += ((this.annualSalary * percent) / 100);
    }



    //getters and setters
    public void setLastName() {
         this.lastName = lastName;
    }
    public void setDepartment(){
        this.department = department;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getDepartment(){
        return department;
    }
    public double getAnnualSalary(){
        return annualSalary;
    }


}

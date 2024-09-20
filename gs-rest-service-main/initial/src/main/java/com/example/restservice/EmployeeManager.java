package com.example.restservice;

import com.example.restservice.Employees;
import org.springframework.stereotype.Repository;
import java.util.List;

@Service
public class EmployeeManager {
  
    private static Employees list = new Employees();

    // Manually initialize service to contain some employees
    static
    {
        Employee employee1 = new Employee("1", "John", "Adam", "john@example.com", "Developer");
        Employee employee2 = new Employee("2", "Kat", "Lee", "kat@example.com", "Designer");
        Employee employee3 = new Employee("3", "Jane", "Ng", "jane@example.com", "PM");

        list.getEmployeeList().add(employee1);
        list.getEmployeeList().add(employee2);
        list.getEmployeeList().add(employee3);
    }
  
    public Employees getAllEmployees()
    {
        return list;
    }
  
    public void addEmployee(Employee employee)
    {
        list.getEmployeeList().add(employee);
    }
}




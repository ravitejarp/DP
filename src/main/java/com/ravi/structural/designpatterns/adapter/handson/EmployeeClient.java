package com.ravi.structural.designpatterns.adapter.handson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeClient {
    List<Employee> employeeList = new ArrayList<>();
    Map<String,Employee> mapOfEmployees = new HashMap<>();

    public List<Employee> getEmployeeList() {
        Employee employeeFromDb = new EmployeeDB("1234", "Ravi", "Teja", "ravi.teja@gmail.com");
        if(mapOfEmployees.get(employeeFromDb.getId())==null)
        {
            employeeList.add(employeeFromDb);
            mapOfEmployees.put(employeeFromDb.getId(),employeeFromDb);

        }
        //Below code doesnt work as we are not implementing the expected interface
//        Employee employeeFromLdap  = new EmployeeFromLdap("1123","Pavan","Ravuri","pavan@gmail.com");
        EmployeeFromLdap employeeFromLdap = new EmployeeFromLdap("1123", "Pavan", "Ravuri", "pavan@gmail.com");
        EmployeeAdapterFromLdap employeeAdapterFromLdap = new EmployeeAdapterFromLdap(employeeFromLdap);
        if(mapOfEmployees.get(employeeAdapterFromLdap.getId())==null)
        {
            employeeList.add(employeeAdapterFromLdap);
            mapOfEmployees.put(employeeAdapterFromLdap.getId(),employeeAdapterFromLdap);
        }

        EmployeeFromCSV employeeFromCSV = new EmployeeFromCSV("1123,Pavan,Ravuri,pavan@gmail.com");
        EmployeeAdapterFromCSV employeeAdapterFromCSV = new EmployeeAdapterFromCSV(employeeFromCSV);
        if(mapOfEmployees.get(employeeAdapterFromCSV.getId())==null){
            employeeList.add(employeeAdapterFromCSV);
            mapOfEmployees.put(employeeAdapterFromCSV.getId(),employeeAdapterFromCSV);
        }

        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}

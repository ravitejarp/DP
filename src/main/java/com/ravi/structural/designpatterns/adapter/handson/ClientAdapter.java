package com.ravi.structural.designpatterns.adapter.handson;

import java.util.List;

public class ClientAdapter {

    public static void main(String[] args) {
        EmployeeClient employeeClient = new EmployeeClient();
        List<Employee> employeeList = employeeClient.getEmployeeList();
        for(Employee e:employeeList)
        System.out.println(e.getId());
    }

}

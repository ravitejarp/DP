package com.ravi.structural.designpatterns.adapter.handson;

public class EmployeeAdapterFromCSV implements Employee {
    EmployeeFromCSV instance;

    public EmployeeAdapterFromCSV(EmployeeFromCSV employeeFromCSV) {
        this.instance = employeeFromCSV;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());

    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getMailId() {
        return instance.getMailid();
    }


}

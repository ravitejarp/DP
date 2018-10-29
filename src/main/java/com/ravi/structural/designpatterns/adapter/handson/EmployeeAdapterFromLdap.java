package com.ravi.structural.designpatterns.adapter.handson;

public class EmployeeAdapterFromLdap implements Employee {
    private EmployeeFromLdap instance;

    public EmployeeAdapterFromLdap(EmployeeFromLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getName();
    }

    @Override
    public String getLastName() {
        return instance.getSurName();
    }

    @Override
    public String getMailId() {
        return instance.getMail();
    }
}

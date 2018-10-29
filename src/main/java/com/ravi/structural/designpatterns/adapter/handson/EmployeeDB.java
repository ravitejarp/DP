package com.ravi.structural.designpatterns.adapter.handson;

public class EmployeeDB implements Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String mailId;

    public EmployeeDB(String id, String firstName, String lastName, String mailId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailId = mailId;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getMailId() {
        return mailId;
    }

    @Override
    public String toString() {
        return "ID:"+id+",FirstName:"+firstName+",LastName:"+lastName+",MailId:"+mailId;
    }
}

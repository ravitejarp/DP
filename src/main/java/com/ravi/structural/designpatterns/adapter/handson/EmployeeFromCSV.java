package com.ravi.structural.designpatterns.adapter.handson;

import java.util.StringTokenizer;

public class EmployeeFromCSV {

    private int id;
    private String firstname;
    private String lastname;
    private String mailid;

    public EmployeeFromCSV(String values) {
        StringTokenizer stringTokenizer = new StringTokenizer(values, ",");
        if (stringTokenizer.hasMoreElements()) {
            this.id = Integer.parseInt(stringTokenizer.nextToken());
        }
        if (stringTokenizer.hasMoreElements()) {
            this.firstname = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()) {
            this.lastname = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()) {
            this.mailid = stringTokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMailid() {
        return mailid;
    }
}

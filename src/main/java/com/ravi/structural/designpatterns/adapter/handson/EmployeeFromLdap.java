package com.ravi.structural.designpatterns.adapter.handson;

public class EmployeeFromLdap {
    private String cn;
    private String name;
    private String surName;
    private String mail;

    public EmployeeFromLdap(String cn, String name, String surName, String mail) {
        this.cn = cn;
        this.name = name;
        this.surName = surName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMail() {
        return mail;
    }

    public String toString() {
        return "ID:" + cn + ",FirstName:" + name + ",LastName:" + surName + ",MailId:" + mail;
    }
}

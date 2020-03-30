package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;


public class Employee implements Worker {
    @Autowired
    private SelfEmployedSurgeon contractor;
    private String name;

    public Employee(SelfEmployedSurgeon contractor, String name) {
        this.contractor = contractor;
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String getPosition() {
        return "Employee";
    }

    public SelfEmployedSurgeon getContractor() {
        return contractor;
    }

    public void setContractor(SelfEmployedSurgeon contractor) {
        this.contractor = contractor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


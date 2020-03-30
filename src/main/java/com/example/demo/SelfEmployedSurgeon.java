package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class SelfEmployedSurgeon implements Worker {
    @Autowired
    @Qualifier("doctor")
    private Employee contractor;
    private String name;

    public SelfEmployedSurgeon(Employee contractor, String name) {
        this.contractor = contractor;
        this.name = name;
    }


    public SelfEmployedSurgeon(String name) {
        this.name = name;
    }

    @Override
    public String getPosition() {
        return "Self-Employed";
    }

    public Employee getContractor() {
        return contractor;
    }

    public void setContractor(Employee contractor) {
        this.contractor = contractor;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

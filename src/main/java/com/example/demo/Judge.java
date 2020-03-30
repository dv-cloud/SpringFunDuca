package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Judge implements Worker {
    @Autowired
    @Qualifier("lawyer")
    private Employee typeOfEmployee;
    private String name;

    @Override
    public String getPosition() {
        return "Judge";
    }
}
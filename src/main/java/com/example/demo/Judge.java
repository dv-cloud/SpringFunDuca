package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Judge implements Worker {
    @Autowired
    private Employee typeOfEmployee;
    private String name;

    @Override
    public String getPosition() {
        return "Judge";
    }
}

package com.example.aop_project.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void login(String username) {
        System.out.println("Logging in user: " + username);
    }

    public int calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("Result: " + sum);
        return sum;
    }
}

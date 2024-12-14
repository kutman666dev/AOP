package com.example.aop_project;

import com.example.aop_project.service.MyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final MyService myService;

    public AppRunner(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run(String... args) throws Exception {
        myService.login("КУТМАН ЖЕКШЕНОВ");
        myService.calculateSum(1440, 8);
    }
}

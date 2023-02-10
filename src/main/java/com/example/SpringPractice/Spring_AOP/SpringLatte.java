package com.example.SpringPractice.Spring_AOP;

import org.springframework.stereotype.Component;

@Component
public class SpringLatte implements SpringCoffee {
    @Override
    public String make() {

        return "라떼";
    }
}

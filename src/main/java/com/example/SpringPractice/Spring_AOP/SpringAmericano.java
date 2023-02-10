package com.example.SpringPractice.Spring_AOP;

import org.springframework.stereotype.Component;

@Component
public class SpringAmericano implements SpringCoffee {
    /**
     * 스프링 AOP를 사용하기 위해선 빈으로 등록되어 있으여 함
     * */

    @Override
    public String make() {

        return "아메리카노";
    }
}

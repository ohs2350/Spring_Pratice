package com.example.SpringPractice.SOLID.OCP;

public class Instargram implements SNS{
    @Override
    public void boot() {
        System.out.println("인스타그램 실행");
    }
}

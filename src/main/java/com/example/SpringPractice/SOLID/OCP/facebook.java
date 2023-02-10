package com.example.SpringPractice.SOLID.OCP;

public class facebook implements SNS{
    @Override
    public void boot() {
        System.out.println("페이스북 실행");
    }
}

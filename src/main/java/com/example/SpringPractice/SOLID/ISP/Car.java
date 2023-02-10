package com.example.SpringPractice.SOLID.ISP;

public interface Car {
    /**
     * ISP 인터페이스 분리 원칙 (Interface Segregation Principle)
     * 1. 특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다.
     * 2. 인터페이스를 클라이언트에 특화되도록 분리시키라는 설계 원칙
     * 아래의 경우는 운전 인터페이스와 정비 인터페이스를 구분하여야 한다.
     * */

    void exel();
    void left();

    void tireRepair();
    void engineRepair();
}

package com.example.SpringPractice.SOLID.SRP;

public class Member {
    /**
     * SRP 단일 책임 원칙 (Single Responsibility Principle)
     * 1. 한 클래스는 하나의 책임만을 가져야 한다.
     * 2. 중요한 기준은 변경. 변경이 있을 때 파급 효과가 적으면 단일 책임 원칙 잘 따른 것
     * 3. 변경이 있을 때 가능한 영향 받는 부분을 최소화해야한다.
     */

    //TODO SRP의 잘못된 예제
    public void addMember() {}
    public void selectMember() {}
    public void addCourse() {}
    public void selectCourse() {}

    /**
     * 위와 같은 예제는 하나의 변화에 대해 많은 변경사항을 발생시키고 관련된 모든 기능을 테스트해봐야하는 단점 등 존재
     * 클래스를 통해 쪼개어 관리하는 것이 변경에 유연하게 대처할 수 있는 설계
     */
}

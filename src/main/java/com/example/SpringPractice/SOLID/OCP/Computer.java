package com.example.SpringPractice.SOLID.OCP;

public class Computer {
    /**
     * OCP 개방 폐쇄 원칙 (Open Closed Principle)
     * 1. 확장에는 열려있으나 변경에는 닫혀있어야 한다.
     * 2. 기존의 코드를 변경하지 않으면서 기능을 추가할 수 있도록 설계되어야 한다
     * 3. 다형성을 활용
     * */
    private final SNS sns;

    public Computer(SNS sns) {
        this.sns = sns;
    }

    public void boot() {
        System.out.println("컴퓨터 부팅");
        sns.boot();
    }


//    private Instargram instargram;
//
//    public void bootWithoutOCP() {
//        System.out.println("컴퓨터 부팅");
//        instargram = new Instargram();
//        instargram.boot();
//    }
}

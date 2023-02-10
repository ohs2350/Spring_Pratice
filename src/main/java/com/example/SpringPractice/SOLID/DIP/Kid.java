package com.example.SpringPractice.SOLID.DIP;

public class Kid {
    /**
     * DIP 의존관계 역전 원칙 (Dependency Inversion Principle)
     * 1. 추상화에 의존해야지 구체화에 의존하면 안된다.
     * 2. 어떤 클래스가 의존할 때 구체적인 클래스는 변화할 확률이 높기 때문에 이를 추상화한 인터페이스나 추상 클래스와 의존관계를 맺도록 설계
     * */

    private toy toy;
//    private lego lego = new lego();

    public Kid(com.example.SpringPractice.SOLID.DIP.toy toy) {
        this.toy = toy;
    }

    public void play() {
        toy.play();
    }
}

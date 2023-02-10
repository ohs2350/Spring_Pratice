package com.example.SpringPractice.SOLID.LSP;

public class CheckLSP {
    /**
     * LSP 리스코프 치환 원칙 (Liskov Substitution Principle)
     * 1. 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야한다.
     * 2. 다형성에서 하위 클래스는 인터페이스 규약을 다 지켜야 한다는 것, 다형성을 지원하기 위한 원칙, 인터페이스를 구현한 구현체는 믿고 사용하려면, 이 원칙이 필요하다.
     * 3. LSP는 서브 클래스가 슈퍼 클래스의 책임을 무시하거나 재정의 하지 않고 확장만 수행한다는 것을 의미
     * 4. 부모가 수행하고 있는 책임을 그대로 수행하면서 추가적인 필드나 기능을 제공하려는 경우
     * */

    // TODO LSP 위반 사례 - 상위 타입의 객체를 하위 타입의 객체로 치환했을 때, 정상적으로 동작하지 않음
    // 이 경우는 상속관계가 잘못되어 인터페이스로 구현하는 것이 바람직하다.
    public void withoutLSP(){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);

        Square square = new Square();
        square.setWidth(10);
        square.setHeight(5);

        if(square.getHeight() != rectangle.getHeight() || square.getWidth() != rectangle.getWidth()) {
            System.out.println("결과값 다름. 즉, LSP 위반!");
        }
    }

    // TODO LSP 만족 사례 - 상위 객체를 하위 객체로 치환하여도 정상적 동작
    // SpecialItem은 상위 객체인 Item역활을 그대로 하면서 추가적인 기능을 제공한다.
    public void withLSP() {
        Item item = new Item();
        item.setPrice(500);
        item.buy();

        SpecialItem specialItem = new SpecialItem();
        specialItem.setPrice(500);
        specialItem.setBonusItem("사은품1");
        specialItem.buy();

        if(item.getPrice() == specialItem.getPrice()) {
            System.out.println("결과값 동일. 즉, LSP 만족!");
        }
    }
}

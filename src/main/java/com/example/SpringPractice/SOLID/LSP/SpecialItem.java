package com.example.SpringPractice.SOLID.LSP;

public class SpecialItem extends Item{
    private String bonusItem;

    public String getBonusItem() {
        return bonusItem;
    }

    public void setBonusItem(String bonusItem) {
        this.bonusItem = bonusItem;
    }

    @Override
    public void buy() {
        System.out.println("스페셜 아이템 구매");
        System.out.println(bonusItem + "증정");
    }
}

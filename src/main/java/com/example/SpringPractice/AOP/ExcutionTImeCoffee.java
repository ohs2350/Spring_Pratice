package com.example.SpringPractice.AOP;

import org.springframework.util.StopWatch;

public class ExcutionTImeCoffee implements Coffee{

    private final Coffee coffeeType;

    public ExcutionTImeCoffee(Coffee coffee) {
        this.coffeeType = coffee;
    }

    @Override
    public String make() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        /*TODO 핵심 로직 */
        String result = coffeeType.make();

        stopWatch.stop();
        System.out.println(result + " 제조시간 : " + stopWatch.getTotalTimeNanos());

        //TODO 만약 측정된 시간 단위 등 로직을 변경하고자 하면 해당 코드만 변경하면 됨
        //System.out.println(result + " 제조시간 : " + stopWatch.prettyPrint());

        return result;
    }
}

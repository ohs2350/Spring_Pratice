package com.example.SpringPractice;

import com.example.SpringPractice.AOP.Americano;
import com.example.SpringPractice.AOP.Coffee;
import com.example.SpringPractice.AOP.ExcutionTImeCoffee;
import com.example.SpringPractice.AOP.Latte;
import com.example.SpringPractice.Spring_AOP.SpringCoffee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringPracticeApplicationTests {

	@Autowired
	SpringCoffee springAmericano;
	@Autowired
	SpringCoffee springLatte;

	@Test
	void contextLoads() {
	}

	@Test
	void test_AOP() {
		Coffee americano = new ExcutionTImeCoffee(new Americano());
		Coffee latte = new ExcutionTImeCoffee(new Latte());

		System.out.println(americano.make());
		System.out.println(latte.make());
	}

	@Test
	void test_SpringAOP() {
		System.out.println(springAmericano.make());
		System.out.println(springLatte.make());
	}

}

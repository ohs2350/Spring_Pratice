package com.example.SpringPractice;

import com.example.SpringPractice.AOP.Americano;
import com.example.SpringPractice.AOP.Coffee;
import com.example.SpringPractice.AOP.ExcutionTImeCoffee;
import com.example.SpringPractice.AOP.Latte;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringPracticeApplicationTests {

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

}

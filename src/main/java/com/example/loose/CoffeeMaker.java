package com.example.loose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class CoffeeMaker {
	
	@Autowired		// type 으로 체크(1개만 가능)
	@Qualifier("espressoMachine")		
		// 같은 type 의 component가 두개 있으면 @Qualifier(이름)으로 구분
		// 옛날 문법 -> 현재는 @Primary로 처리
	private CoffeeMachine coffeeMachine;
	/*
	public void setCoffeeMaker(CoffeeMachine coffeeMachine) {
		this.coffeeMachine = coffeeMachine;
	}
	*/
	
	@PostConstruct
	public void makeCoffee() {
		System.out.println(coffeeMachine.brew());//
	}
}

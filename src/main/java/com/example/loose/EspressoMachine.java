package com.example.loose;

import org.springframework.stereotype.Component;

@Component("espressoMachine")
public class EspressoMachine implements CoffeeMachine {

	@Override
	public String brew() {
		return "에스라인프레소머신으로코피추출하기";
	}
	
}

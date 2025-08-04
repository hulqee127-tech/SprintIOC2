package com.example.loose;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary 	// type 이 같은 두 component 에 우선순위를 제공
public class DripCoffeeMachine implements CoffeeMachine {

	@Override
	public String brew() {
		return "개드립커피머신으로커피추출하기";
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "com.example")
// 소스가 다른패키지게 있어서 검색이 안되었음. -> 검색 범위 늘려 준다.
//@ImportResource("classpath:beans.xml")
public class DemoIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIocApplication.class, args);
	}

}

package com.green.Second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SecondApplication.class, args);
		//spring 우리가 스피링하는중이라 = pdf3번의 6페이지와 동일한 내용임
		String[] beanNames = context.getBeanDefinitionNames();
		//spring컨테이너가 만들어준 모든 객체의 이름을 배열로 가져오는 명령어

		for(String beanName : beanNames){
			Object beanType = context.getBean(beanName);
			System.out.println("객체명 : " + beanName + ", 자료형 : " + beanType);
		}
	}

}

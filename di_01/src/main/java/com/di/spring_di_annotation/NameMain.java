package com.di.spring_di_annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameMain {

	public static void main(String[] args) {
		//IOC컨테이너 객체 구성
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config3.xml");
		
		NameController controller = context.getBean("nameController", NameController.class);
		
		controller.show("이몽룡");
		context.close();

	}

}

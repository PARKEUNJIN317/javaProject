package com.di.spring_di_annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//@Component
public class NameController {
	
	
	INameInterface nameService; //name속성을 생략하는 필드이름과 동일한 id의 bean을 찾음
	
	
	@Autowired(required=true)
	public void setNameService(INameInterface nameService) {
		this.nameService = nameService;
	}
	
	public void show(String name) {
		System.out.println("NameController : " + nameService.showName(name));
	}
	
}

package com.gyojincompany.spring_6_4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student stu1 = ctx.getBean("student1", Student.class);
		
		System.out.println(stu1.getName());
		
		Student stu3 = ctx.getBean("student3", Student.class);
		
		System.out.println(stu3.getName());
		
		ctx.close();
		
	}

}

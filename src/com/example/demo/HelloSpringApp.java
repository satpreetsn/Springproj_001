package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve beans
		Coach theCoach=context.getBean("myCoach",Coach.class);
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		//close app context
		context.close();
	}

}

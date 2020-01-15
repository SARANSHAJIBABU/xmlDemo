package com.self.xmlDemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class XmlDemoApplication {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		//Retrieve bean from container
		Coach coach = context.getBean("myCoach",Coach.class);

		//Call methods in bean
		System.out.println(coach.getTodaysWorkout());
		System.out.println(coach.getDailyFortune());

		//Close context
		context.close();
		//SpringApplication.run(XmlDemoApplication.class, args);
	}

}

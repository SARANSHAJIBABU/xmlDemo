package com.self.xmlDemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class XmlDemoApplication {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		//Retrieve bean created with constructor injection from container
		Coach coach = context.getBean("myCoach",Coach.class);

		//Call methods in bean
		System.out.println(coach.getTodaysWorkout());
		System.out.println(coach.getDailyFortune());


		//Retrieve bean created with setter injection from container
		Coach coach2 = context.getBean("myCoach2",Coach.class);

		//Call methods in bean
		System.out.println(coach2.getTodaysWorkout());
		System.out.println(coach2.getDailyFortune());

		//Retrieve bean values set with property injection from container
		CricketCoach cricketCoach = context.getBean("myCoach",CricketCoach.class);
		System.out.println(cricketCoach.getTeamName());
		System.out.println(cricketCoach.getEmailAddress());


		//Close context
		context.close();
		//SpringApplication.run(XmlDemoApplication.class, args);
	}

}

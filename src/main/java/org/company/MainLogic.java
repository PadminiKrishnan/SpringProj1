package org.company;

import org.company.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	
public class MainLogic {

	public static void main(String[] args) {

		//Bean config using XML
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext
				(JavaConfig.class);
		AnimalNoise obj = (AnimalNoise) context.getBean("animalNoise");
		obj.shout();
	}

}

package model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
				
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Person person = (Person) context.getBean("person");
		System.out.println(person.getCurrentMilliSecs());
		System.out.println(person.getPersonName());
		
		Person p2 = (Person) context.getBean("person");
		System.out.println(p2.getCurrentMilliSecs());
		p2.setPersonName("Likhita");

		System.out.println(p2.getPersonName());
		

		
	}

}

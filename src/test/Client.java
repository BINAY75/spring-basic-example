package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String[] args) {
	    ApplicationContext app = new ClassPathXmlApplicationContext("resource/spring.xml");
	    
	    Test t = (Test)app.getBean("t1");
	    t.printData();

	}

}

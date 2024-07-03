
package com.pace.springcore.hw.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pace.springcore.hw.HiWorld;

public class MainHaiWorld {

	public static void main(String[] args) {
		// Create Spring core container
		ApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//Get the beans from xml file
		//not HelloWorld helloWorld=new HelloWorld();
		//not pulling the bean - //injecting the bean
		
		HiWorld hiWorld=(HiWorld) context.getBean("hiWorld");
		//invoke the method
		System.out.println(hiWorld.getWish());

	}

}


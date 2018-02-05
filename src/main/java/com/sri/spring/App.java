package com.sri.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.pojo.HelloWorld;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	    obj.printHello();
	}
}

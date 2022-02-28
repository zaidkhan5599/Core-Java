package com.ty.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springcore.beans.MessageBean3;

public class App1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MessageBean3 message =(MessageBean3)context.getBean("newMessage");
		System.out.println(message.getMessage());
	}

}

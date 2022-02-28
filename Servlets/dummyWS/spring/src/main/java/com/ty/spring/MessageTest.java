package com.ty.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springcore.beans.MessageBeanb;

public class MessageTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("messageProp.xml");
		MessageBeanb beanb = (MessageBeanb)context.getBean("messageBean");
		System.out.println("Message : "+beanb.getMessage());
	}

}

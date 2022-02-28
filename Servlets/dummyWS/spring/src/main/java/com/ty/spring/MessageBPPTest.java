package com.ty.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springcore.beans.MessageBean2;

public class MessageBPPTest   {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("messageConfig.xml");
		((AbstractApplicationContext)context).registerShutdownHook();
		MessageBean2 messageBean2=context.getBean("messageBean",MessageBean2.class);
		System.out.println(messageBean2.getMessage());
	}
	

}

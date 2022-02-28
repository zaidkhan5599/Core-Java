package com.ty.springcore.annotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ty.springcore.beans.MessageBean;
import com.ty.springcore.config.MessageConfig;

public class MessageTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean messageBean = context.getBean(MessageBean.class);
		System.out.println(messageBean.getMessage());
		((AbstractApplicationContext)context).close();
//		MessageBean messageBean2 = context.getBean(MessageBean.class);
//		System.out.println(messageBean2.getMessage());
//		messageBean2.setMessage("Hello World");
		
//		System.out.println(messageBean.getMessage());
//		System.out.println(messageBean2.getMessage());
	}

}

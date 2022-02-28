package com.ty.springcore.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageBeanb  {
 private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
	
}

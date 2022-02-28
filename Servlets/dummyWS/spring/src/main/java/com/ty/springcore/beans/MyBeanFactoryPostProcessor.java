package com.ty.springcore.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Inside BFPP");
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("messageBean");
		    MutablePropertyValues propertyValues=beanDefinition.getPropertyValues();
		    System.out.println("message value in xml"
		    		+propertyValues.getPropertyValue("message").getValue());
		    propertyValues.addPropertyValue("message", "Message form BFPP");
		    
	

}
}
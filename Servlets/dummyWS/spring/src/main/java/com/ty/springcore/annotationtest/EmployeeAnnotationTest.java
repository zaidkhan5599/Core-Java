package com.ty.springcore.annotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.springcore.baseInfobean.EmployeeInfoBean;
import com.ty.springcore.config.EmployeeConfig;

public class EmployeeAnnotationTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
	    EmployeeInfoBean employeeInfoBean = context.getBean(EmployeeInfoBean.class);
	    System.out.println(employeeInfoBean);
	}

}

package com.ty.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springcore.beans.EmployeeInfoBean;

public class EmployeeTest1 {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("employeeConfig3.xml");
		EmployeeInfoBean employeeInfoBean=cont.getBean("employee", EmployeeInfoBean.class);
		System.out.println(employeeInfoBean.getId());
		System.out.println(employeeInfoBean.getName());
	    System.out.println(employeeInfoBean.getDepartmentinfo().getDeptId());
	    System.out.println(employeeInfoBean.getDepartmentinfo().getDepartName());
	}

}

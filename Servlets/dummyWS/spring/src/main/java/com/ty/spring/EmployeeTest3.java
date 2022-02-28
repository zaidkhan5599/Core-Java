package com.ty.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springcore.beans.EmployeeInfoBean;
import com.ty.springcore.beans.Tourist;

public class EmployeeTest3 {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("touristConfig.xml");
		Tourist tourist=cont.getBean("Tourist", Tourist.class);
		System.out.println(tourist);
	}

}




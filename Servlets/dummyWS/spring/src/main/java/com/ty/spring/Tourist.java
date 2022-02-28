package com.ty.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springcore.beans.EmployeeInfoBean;
import com.ty.springcore.beans.Tourist2;

public class Tourist {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("touristConfig2.xml");
		Tourist2 tourist=cont.getBean("Tourist", Tourist2.class);
		System.out.println(tourist);
	}

}




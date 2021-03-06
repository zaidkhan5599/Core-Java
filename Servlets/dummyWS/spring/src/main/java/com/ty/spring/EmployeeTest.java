package com.ty.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springcore.beans.DepartmentInfo;
import com.ty.springcore.beans.EmployeeInfoBean;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("employeeConfig.xml");
		EmployeeInfoBean employeeInfoBean =cont.getBean("employee", EmployeeInfoBean.class);
		DepartmentInfo departmentInfo= employeeInfoBean.getDepartmentinfo();
		System.out.println("Enter the employee id");
		Scanner sc = new Scanner(System.in);
		employeeInfoBean.setId(sc.nextInt());
		System.out.println("Enter the employee name");
		sc.nextLine();
		employeeInfoBean.setName(sc.nextLine());
		System.out.println("Enter the depatment id");
		departmentInfo.setDeptId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the department name");
		departmentInfo.setDepartName(sc.nextLine());
		System.out.println("Id :"+employeeInfoBean.getId());
		System.out.println("Name :"+employeeInfoBean.getName());
		System.out.println("Deaprtment id :"+employeeInfoBean.getDepartmentinfo().getDeptId());
		System.out.println("Department name is :"+employeeInfoBean.getDepartmentinfo().getDepartName());
		
	}

}




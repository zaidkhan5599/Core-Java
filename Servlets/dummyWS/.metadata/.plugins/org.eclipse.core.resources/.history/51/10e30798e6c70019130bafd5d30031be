package com.ty.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ty.springcore.baseInfobean.DepartmentInfo;
import com.ty.springcore.baseInfobean.EmployeeInfoBean;

@Configuration
@Import(DepartmentConfig.class)
public class EmployeeConfig {
	
	@Bean 
	public EmployeeInfoBean getEmployeeInfoBean()
	{
	EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
	employeeInfoBean.setId(101);
	employeeInfoBean.setNamee("Bharat");
	return employeeInfoBean;
	}
	
	

}

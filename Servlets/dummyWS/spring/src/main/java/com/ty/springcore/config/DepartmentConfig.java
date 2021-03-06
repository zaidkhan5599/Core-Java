package com.ty.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ty.springcore.baseInfobean.DepartmentInfo;
@Configuration
public class DepartmentConfig {
	@Bean(name="HR")
    public DepartmentInfo getDepartmentInfo()
    {
	 DepartmentInfo departmentInfo = new DepartmentInfo();
	 departmentInfo.setDepartName("HR");
	 departmentInfo.setDeptId(111);
	 return departmentInfo;
    }
	@Bean(name="Dev")
    public DepartmentInfo getDepartmentInfo1()
    {
	 DepartmentInfo departmentInfo = new DepartmentInfo();
	 departmentInfo.setDepartName("Dev");
	 departmentInfo.setDeptId(112);
	 return departmentInfo;
    }
	@Bean(name="Testing")
    public DepartmentInfo getDepartmentInfo2()
    {
	 DepartmentInfo departmentInfo = new DepartmentInfo();
	 departmentInfo.setDepartName("Testing");
	 departmentInfo.setDeptId(113);
	 return departmentInfo;
    }

}

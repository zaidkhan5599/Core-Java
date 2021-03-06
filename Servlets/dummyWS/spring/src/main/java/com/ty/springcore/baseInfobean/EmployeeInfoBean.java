package com.ty.springcore.baseInfobean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeInfoBean {
private int id;
private String namee;
@Autowired
@Qualifier("HR")
private DepartmentInfo departmentInfo;
public DepartmentInfo getDepartmentInfo() {
	return departmentInfo;
}
public void setDepartmentInfo(DepartmentInfo departmentInfo) {
	this.departmentInfo = departmentInfo;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNamee() {
	return namee;
}
@Override
public String toString() {
	return "EmployeeInfoBean [id=" + id + ", namee=" + namee + ", departmentInfo=" + departmentInfo + "]";
}
public void setNamee(String namee) {
	this.namee = namee;
}

}

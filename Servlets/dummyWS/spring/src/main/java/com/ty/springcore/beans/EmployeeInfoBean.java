package com.ty.springcore.beans;

public class EmployeeInfoBean {
	
	private int id;
	private String name;
	private DepartmentInfo departmentinfo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DepartmentInfo getDepartmentinfo() {
		return departmentinfo;
	}
	public void setDepartmentinfo(DepartmentInfo departmentinfo) {
		this.departmentinfo = departmentinfo;
	}

}

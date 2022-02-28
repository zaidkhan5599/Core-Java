package com.ty.springcore.baseInfobean;

public class DepartmentInfo {
	private int deptId;
	private String departName;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	@Override
	public String toString() {
		return "DepartmentInfo [deptId=" + deptId + ", departName=" + departName + "]";
	}
	

}

package com.util.map;

public class Department {

	private String deptName;
	private int departmentId;
	private String deptHead;
	// default const, paramaterized constr
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String deptName, int departmentId, String deptHead) {
		super();
		this.deptName = deptName;
		this.departmentId = departmentId;
		this.deptHead = deptHead;
	}
	// getter/setter methods
	public String getdeptName() {
		return deptName;
	}
	public void setdeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getdepartmentId() {
		return departmentId;
	}
	public void setdepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getdeptHead() {
		return deptHead;
	}
	public void setdeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
	// toString implementation
	@Override
	public String toString() {
		return "department [deptName=" + deptName + ", departmentId=" + departmentId + ", deptHead=" + deptHead + "]";
	}
	
	
	
	
	
	
}

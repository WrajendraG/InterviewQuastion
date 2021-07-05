package com.coreJava.HashMapOperations;

public class WithoutEqualMethodButOverrideHashCodeMethod {


	private int empId;
	private String empName;
	private Float salary;
	
	public WithoutEqualMethodButOverrideHashCodeMethod(int i, String string, float f){}
	
	public WithoutEqualMethodButOverrideHashCodeMethod(int empId, String empName, Float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	
	
}

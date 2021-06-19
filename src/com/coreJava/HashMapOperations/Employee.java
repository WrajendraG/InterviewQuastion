package com.coreJava.HashMapOperations;

public class Employee {

	
	private int empId;
	private String empName;
	private Float salary;
	
	public Employee(int i, String string, float f){}
	
	public Employee(int empId, String empName, Float salary) {
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

	
	//https://youtu.be/ghswNpRv2t0
	@Override
	public int hashCode() {
		System.out.println("======================================");
		System.out.println("Entry in hash code method");
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		System.out.println("Exist From hash code method with this int return = " +result);
		System.out.println("======================================");
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("======================================");
		System.out.println("Entry in equals method with this input = "+obj);
		System.out.println("String format input"+obj.toString());
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		System.out.println("Exist From equals method with boolean return");
		System.out.println("======================================");
		return true;
	}
	
	
	
}

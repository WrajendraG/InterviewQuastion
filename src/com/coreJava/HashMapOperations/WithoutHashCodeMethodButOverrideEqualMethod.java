package com.coreJava.HashMapOperations;

public class WithoutHashCodeMethodButOverrideEqualMethod {

	
	private int empId;
	private String empName;
	private Float salary;
	
	public WithoutHashCodeMethodButOverrideEqualMethod(int i, String string, float f){}
	
	public WithoutHashCodeMethodButOverrideEqualMethod(int empId, String empName, Float salary) {
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
	public boolean equals(Object obj) {
		System.out.println("======================================");
	/*	System.out.println("Entry in equals method with this input = "+obj);
		System.out.println("String format input"+obj.toString());*/
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		WithoutHashCodeMethodButOverrideEqualMethod other = (WithoutHashCodeMethodButOverrideEqualMethod) obj;
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
/*		System.out.println("Exist From equals method with boolean return");
		System.out.println("======================================");*/
		return true;
	}
	
	
	
}

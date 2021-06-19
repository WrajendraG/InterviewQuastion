package com.coreJava.HashMapOperations;

import java.util.HashMap;
import java.util.Map;

public class Equal_HashCodeMetOverriding {

	
	public static void main(String[] args) {
		
		
		
		Student stud1= new Student(1,"Rajendra",60.50f);
		Student stud2= new Student(1,"Rajendra",60.50f); // here Map consider this is two diff obj
		// that why we have to inform to hashmap it's data are same so no need to create diff obj
		// using overriding equal and hash code method in student class.
		
		Map<Student, String> hashMapStudentObj= new HashMap<>();
		
		hashMapStudentObj.put(stud1, "Student object 1");
		hashMapStudentObj.put(stud1, "Student object 2");
		hashMapStudentObj.put(stud2, "Student object 3");
	
		System.out.println("Student object 1 = "+stud1);
		System.out.println("Student object 2 = "+stud1);
		System.out.println("Student object 3 = "+stud2);
		
		System.out.println("Hash map Size before overrding hashcode and equal methods for same object = "+hashMapStudentObj.size());
		
		
	/*	Student object 1 = com.coreJava.HashMapOperations.Student@15db9742
		Student object 2 = com.coreJava.HashMapOperations.Student@6d06d69c
		Student object 3 = com.coreJava.HashMapOperations.Student@15db9742
		Hash map Size is = 2
*/
		System.out.println("======================================");	
		//Letes do here 
		
		Employee empObj1= new Employee(1089,"Rajendra Waghmare",60000.50f);
		Employee empObj2= new Employee(1089,"Rajendra Waghmare",60000.50f);
		Employee empObj3= new Employee(1,"XYZ Waghmare",54512.50f);
	
		Map<Employee, String> hashMapEmployeeObj= new HashMap<>();
		
		hashMapEmployeeObj.put(empObj1, "Employee object 1");
		hashMapEmployeeObj.put(empObj2, "Employee object 2");
		hashMapEmployeeObj.put(empObj3, "Employee object 3");
		
		System.out.println("Employee object 1 = "+empObj1);
		System.out.println("Employee object 2 = "+empObj2);
		
		System.out.println("Hash map Size after overrding hashcode and equal methods for same object = "+hashMapEmployeeObj.size());
	
		System.out.println("======================================");
		
/*		Hash map Size after overrding hashcode and equal methods for same object = 1
				======================================
*/
		// Lets Try user defined shorting
		
		
		
		//TODO
		
	}
}

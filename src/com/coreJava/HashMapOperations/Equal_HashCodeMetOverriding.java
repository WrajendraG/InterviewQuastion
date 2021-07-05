package com.coreJava.HashMapOperations;

import java.util.HashMap;
import java.util.Map;

public class Equal_HashCodeMetOverriding {

	
	public static void main(String[] args) {
		
		
		
		WithoutHashCodeAndEqualMethod object1= new WithoutHashCodeAndEqualMethod(1,"Rajendra",60.50f);
		WithoutHashCodeAndEqualMethod object2= new WithoutHashCodeAndEqualMethod(1,"Rajendra",60.50f); // here Map consider this is two diff obj

		Map<WithoutHashCodeAndEqualMethod, String> hashMapStudentObj= new HashMap<>();
		
		hashMapStudentObj.put(object1, "object1_Value_1");
		hashMapStudentObj.put(object2, "object2_Value_2");
		System.out.println();
		System.out.println("====== Without HashCode And Equal Method ======");
		System.out.println("Both Objects are Equal: "+object1.equals(object2));
		System.out.println("object 1 Hashcode: "+object1.hashCode());
		System.out.println("object 2 Hashcode: "+object2.hashCode());
		System.out.println("Map Size: "+hashMapStudentObj.size());
		hashMapStudentObj.forEach((k, v) -> System.out.println("Key is: " + k + " Value is: " + v));
		

		WithoutHashCodeMethodButOverrideEqualMethod object3= new WithoutHashCodeMethodButOverrideEqualMethod(1,"Rajendra",60.50f);
		WithoutHashCodeMethodButOverrideEqualMethod object4= new WithoutHashCodeMethodButOverrideEqualMethod(1,"Rajendra",60.50f); // here Map consider this is two diff obj

		Map<WithoutHashCodeMethodButOverrideEqualMethod, String> hashMapStudentObj2= new HashMap<>();
		
		hashMapStudentObj2.put(object3, "object3_Value_3");
		hashMapStudentObj2.put(object4, "object4_Value_4");
	
		System.out.println();
		System.out.println("====== Without HashCode But override Equal Method ======");
		System.out.println("Both Objects are Equal: "+object3.equals(object4));
		System.out.println("object 3 Hashcode: "+object3.hashCode());
		System.out.println("object 4 Hashcode: "+object4.hashCode());
		System.out.println("Map Size: "+hashMapStudentObj2.size());
		hashMapStudentObj2.forEach((k, v) -> System.out.println("Key is: " + k + " Value is: " + v));
		

		
		WithoutEqualMethodButOverrideHashCodeMethod object5= new WithoutEqualMethodButOverrideHashCodeMethod(1,"Rajendra",60.50f);
		WithoutEqualMethodButOverrideHashCodeMethod object6= new WithoutEqualMethodButOverrideHashCodeMethod(1,"Rajendra",60.50f); // here Map consider this is two diff obj

		Map<WithoutEqualMethodButOverrideHashCodeMethod, String> hashMapStudentObj3= new HashMap<>();
		
		hashMapStudentObj3.put(object5, "object5_Value_5");
		hashMapStudentObj3.put(object6, "object6_Value_6");
	
		System.out.println();
		System.out.println("====== With HashCode without override Equal Method ======");
		System.out.println("Both Objects are Equal: "+object5.equals(object6));
		System.out.println("object 5 Hashcode: "+object5.hashCode());
		System.out.println("object 6 Hashcode: "+object6.hashCode());
		System.out.println("Map Size: "+hashMapStudentObj3.size());
		hashMapStudentObj3.forEach((k, v) -> System.out.println("Key is: " + k + " Value is: " + v));
		

		
		WithEqualAndHashCodeMethod object7= new WithEqualAndHashCodeMethod(1,"Rajendra",60.50f);
		WithEqualAndHashCodeMethod object8= new WithEqualAndHashCodeMethod(1,"Rajendra",60.50f); // here Map consider this is two diff obj
//case 2
		WithEqualAndHashCodeMethod object9= new WithEqualAndHashCodeMethod(231,"ABCD",54.50f); // here Map consider this is two diff obj

		Map<WithEqualAndHashCodeMethod, String> hashMapStudentObj4= new HashMap<>();
		
		hashMapStudentObj4.put(object7, "1_Rajendra_60.50f");
		hashMapStudentObj4.put(object9, "231_ABCD_54.50f");  // check problem here 
		hashMapStudentObj4.put(object8, "1_Rajendra_60.50fLastUpdated");
	
		System.out.println();
		System.out.println("====== With HashCode and Equal Method ======");
		System.out.println("Both 7 & 8 Objects are Equal: "+object7.equals(object8));
		System.out.println("Both 7& 9 Objects are Equal: "+object7.equals(object9));
		System.out.println("object 7 1_Rajendra_60.50f Hashcode: "+object7.hashCode());
		System.out.println("object 8 1_Rajendra_60.50fLastUpdated Hashcode: "+object8.hashCode());
		System.out.println("object 9  231_ABCD_54.50f Hashcode: "+object8.hashCode());
		System.out.println("Map Size: "+hashMapStudentObj4.size());
		hashMapStudentObj4.forEach((k, v) -> System.out.println("Key is: " + k + " Value is: " + v));
		

	}
}

/*====== Without HashCode And Equal Method ======
Both Objects are Equal: false
object 1 Hashcode: 366712642
object 2 Hashcode: 1829164700
Map Size: 2
Key is: com.coreJava.HashMapOperations.WithoutHashCodeAndEqualMethod@15db9742 Value is: object1_Value_1
Key is: com.coreJava.HashMapOperations.WithoutHashCodeAndEqualMethod@6d06d69c Value is: object2_Value_2

====== Without HashCode But override Equal Method ======
======================================
Both Objects are Equal: true
object 3 Hashcode: 135721597
object 4 Hashcode: 142257191
Map Size: 2
Key is: com.coreJava.HashMapOperations.WithoutHashCodeMethodButOverrideEqualMethod@816f27d Value is: object3_Value_3
Key is: com.coreJava.HashMapOperations.WithoutHashCodeMethodButOverrideEqualMethod@87aac27 Value is: object4_Value_4

====== With HashCode without override Equal Method ======
Both Objects are Equal: false
object 5 Hashcode: 29791
object 6 Hashcode: 29791
Map Size: 2
Key is: com.coreJava.HashMapOperations.WithoutEqualMethodButOverrideHashCodeMethod@745f Value is: object5_Value_5
Key is: com.coreJava.HashMapOperations.WithoutEqualMethodButOverrideHashCodeMethod@745f Value is: object6_Value_6

====== With HashCode and Equal Method ======
Both 7 & 8 Objects are Equal: true
Both 7& 9 Objects are Equal: true
object 7 1_Rajendra_60.50f Hashcode: 29791
object 8 1_Rajendra_60.50fLastUpdated Hashcode: 29791
object 9  231_ABCD_54.50f Hashcode: 29791
Map Size: 1
Key is: com.coreJava.HashMapOperations.WithEqualAndHashCodeMethod@745f Value is: 1_Rajendra_60.50fLastUpdated
*/
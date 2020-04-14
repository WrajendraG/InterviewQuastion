package com.coreJava.QuestionsBasedOnSerializeDeserialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ServiceDemo3 implements Serializable {
	int i;

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		try {

			FileInputStream fis = new FileInputStream("abc.ser");
			// @SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ServiceDemo obj2 = (ServiceDemo) ois.readObject();

			ServiceDemo3 obj3 = new ServiceDemo3();
			System.out.println(obj2.i);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

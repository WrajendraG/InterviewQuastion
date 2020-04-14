package com.coreJava.QuestionsBasedOnSerializeDeserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationDemo {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String args[]) {
		ServiceDemo obj[] = new ServiceDemo[5];
		int s = 200;

		for (int i = 0; i < 5; i++) {
			ServiceDemo d = new ServiceDemo();
			d.i = s;
			obj[i] = d;
			s = s + 100;
		}

		try {
			// follwing code for serializaton
			/*
			 * FileOutputStream fos=new FileOutputStream("abc.ser");
			 * ObjectOutputStream oos=new ObjectOutputStream(fos);
			 * oos.writeObject(obj);
			 */

			// follwing code for deserialization

			try {
				FileInputStream fis = new FileInputStream("abc.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				ServiceDemo obj2[] = (ServiceDemo[]) ois.readObject();

				for (ServiceDemo t : obj)
					System.out.println(t.i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

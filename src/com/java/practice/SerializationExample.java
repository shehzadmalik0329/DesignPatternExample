package com.java.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	public int a;

	public String b;

	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}


}

class Employee implements Serializable{

	private static final long serialVersionUID = 6699083572707891006L;
	
	transient int a;
	static int b;
	String name;
	int age;
	public Employee(int a, int b, String name, int age) {
		this.a = a;
		this.b = b;
		this.name = name;
		this.age = age;
	}
	
	
	
}

public class SerializationExample {

	public static void main(String[] args) {
		Demo object = new Demo(1, "Shehzad");
		String filename = "file.ser";

		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(object);
			oos.close();
			fos.close();

			System.out.println("Serialized Successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Demo object1 = null;

		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream(filename);
			ois = new ObjectInputStream(fis);

			object1 = (Demo) ois.readObject();
			
			ois.close();
			fis.close();
			
			System.out.println("Deserialized Successfully");
			System.out.println("a-->"+object1.a);
			System.out.println("b-->"+object1.b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		serializeDeserializeEmployee();

	}
	
	public static void printdata(Employee object1) 
    { 
  
        System.out.println("name = " + object1.name); 
        System.out.println("age = " + object1.age); 
        System.out.println("a = " + object1.a); 
        System.out.println("b = " + object1.b); 
    }
	
	private static void serializeDeserializeEmployee(){
		Employee emp = new Employee(1,2,"Rahul", 28);
		String filename = "emp_file.ser";

		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.close();
			fos.close();

			System.out.println("Serialized Successfully");
			printdata(emp);
			
			emp.b = 300;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		emp = null;

		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream(filename);
			ois = new ObjectInputStream(fis);

			emp = (Employee) ois.readObject();
			
			ois.close();
			fis.close();
			
			System.out.println("Deserialized Successfully");
			printdata(emp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

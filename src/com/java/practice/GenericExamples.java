package com.java.practice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


//array is typed
//arrayList was not type safe
//from Java 1.5 Generic was introduced
//Generic provides Type safety while storing data and resolve type casting problem while retrieving data
//at runtime jvm converts T into specified type
//Class<T> --> only class is applicable for polymorphism, not Type Parameter
//unbounded vs bounded type parameter
//Test<T> vs Test<T extends X>,<T extends Runnable>
//bounded type in combination Test<T extends Number & Runnable>, should be separated with &
//Test<T extends Runnable & Number> is invalid
//Bounded Type parameter can be declare using "extends" keyword only
//implements and super are not allowed
//class Test<T implements Runnable> - not allowed
//class Test<T super String> - not allowed
//class Test<T extends X> where X is Class/Interface
//Can we use only T as "Type Parameter"? we can use any Java identifier in place of T
//can we use multiple parameter as "Type Parameter"? yes, we can use any number "Type Parameters", should be separated with ,
//class HashMap<K,V>, class Test<X, Y, Z>


/*Generic methods and wildcard character ?
 * ArrayList<String> list1 = new ArrayList<String>() --> m1(ArrayList<String> list)
 * ArrayList<Student> list1 = new ArrayList<Student>() --> m1(ArrayList<Student> list)
 * ArrayList<StringBuffer> list1 = new ArrayList<StringBuffer>() --> m1(ArrayList<StringBuffer> list)
 * we can use generic method for all different Type parameters as
 * m1(ArrayList<?> list)
 * m1(ArrayList<? extends X> list)
 * m1(ArrayList<? super X> list) --> super keyword is invalid at class level but valid at method level for Type parameter
 * 
 * 
 * 
 * these type of methods are best suitable for readonly operations/SOPLN
 * within method we cannot add anything except null, because we don't know the type exactly
 * m1(ArrayList<?> list){
 * list.add(10.5) --> invalid
 * list.add("A") --> invalid
 * list.add(null) --> valid
 * }
 * 
 * m1(ArrayList<? extends X> list){
 * X is class --> X type or its child classes
 * X is interface --> X type or its implementation classes
 * }
 * 
 * m1(ArrayList<? super X> list){
 * X is class --> X type or its super class
 * X is interface --> X type or super class of implementation class of X
 * Object		Runnable
 *   *			 *
 *    *			*
 * 		Thread
 * within a method we can add X type object and null
 * }
 */


/*What is Generic methods
 * Type parameter can be declared at class level or method level
 * declaring Type Parameter at class level
 * class Test<T>{}
 * 
 * declaring Type Parameter at method level example(before return type(void))
 * 
 * we can define Bounded Type Parameter at method level also
 * 
 * public <T>void m1(T obj)
 * public <T extends Number>void m1(T obj)
 * public <T extends Runnable>void m1(T obj)
 * public <T extends Number & Runnable & Comparable>void m1(T obj)
 * 
 * public <T extends Runnable & Number>void m1(T obj) --> invalid
 * public <T extends Thread & Number>void m1(T obj) --> invalid
 * {
 * 
 * }
 */

/*Communication with non generic code
 * if we send generic object to non-generic area, then it start behaving like non-generic object, vice versa
 * i.e the location in which object present, based on that behaviour will be defined
 * 
 * 
 * 
 */

/*Main purpose of generics is to provide type safety and resolve type casting problem
 * type safety and type casting both are applicable at compile
 * hence generics concept also applicable only at compile time but not at runtime
 * JVM is always going to check at runtime
 */
public class GenericExamples {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		Collection<String> list3 = new ArrayList<String>();
//		ArrayList<Object> list4 = new ArrayList<String>();
		ArrayList<Object> list5 = new ArrayList<>();
		
		list5.add("String");
		list5.add(new Integer(10));
		list5.add(new Double(10));
		list5.add(null);
		list5.add(new BigInteger("10"));
		list5.add(new GenericExamples());
		
//		Account<Gold> account1 = new Account<Gold>();
//		Account<Silver> account2 = new Account<Silver>();
		
		MyGen<String> myGen1 = new MyGen(new String());
		myGen1.show();
		MyGen<Integer> myGen2 = new MyGen<Integer>(0);
		myGen2.show();
		MyGen<BigInteger> myGen3 = new MyGen<BigInteger>(new BigInteger("10"));
		myGen3.show();
		
		
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<?> l2 = new ArrayList<String>();
		ArrayList<?> l3 = new ArrayList<Integer>();
		ArrayList<? extends Number> l4 = new ArrayList<Integer>();
//		ArrayList<? extends Number> l5 = new ArrayList<String>(); CE:
		ArrayList<? super String> l6 = new ArrayList<Object>();
//		we can use ? at declaration side only
//		ArrayList<?> l7 = new ArrayList<?>();
//		ArrayList<?> l8 = new ArrayList<? extends Number>();
//		ArrayList<?> l9 = new ArrayList<? super String>();
	}

}

class MyGen<T>{
	
	T obj;
	
	MyGen(T obj){
		this.obj = obj;
	}
	
	public void show(){
		System.out.println("The type of obj is:"+obj.getClass().getName());
	}
	public T getObj(){
		return obj;
	}
}

class Test<T extends Number>{
	
}
class Test1<T extends Number & Runnable>{
	
}
class MyTest<Shehzad>{
	
}

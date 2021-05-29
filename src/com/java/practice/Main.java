package com.java.practice;

public class Main {
	public static void main(String args[]) {  
		System.out.println(getValue(getValue(0)));
	}

	static int getValue()
	{
		return 35;
	}
	private static int getValue(int num)
	{
		return 30 + num;
	}
}
interface A{
	public void m1();
}
interface B{
	public void m1();
}
interface C extends A,B{
	public void m1();
}
class Child implements C{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}
//class A extends A{}
//class B extends C{}
//class C extends B{}
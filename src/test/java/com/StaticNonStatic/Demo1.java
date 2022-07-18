package com.StaticNonStatic;

public class Demo1 {

	static int i = 10;
	static String name = "Nani";
	
	
	//Non static method
	public void test() {
		System.out.println("Static methods access directly In Non static method");
		System.out.println(i);
		System.out.println(name);
		
		System.out.println("Static methods access using class name In Non static method");
		System.out.println(Demo1.i);
		System.out.println(Demo1.name);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Directly calling
		System.out.println("1. Static variables with Direct call: ");
		System.out.println(i);
		System.out.println(name);
		
		//2. By using class name
		System.out.println("2. Static variables By using class name: ");
		System.out.println(Demo1.i);
		System.out.println(Demo1.name);
		
		//Creating instance
		Demo1 demo = new Demo1();
		demo.test();

	}

}

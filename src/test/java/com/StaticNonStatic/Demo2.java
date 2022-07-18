package com.StaticNonStatic;

public class Demo2 {

	int a = 10;
	String name = "Bhanu";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo2 demo = new Demo2();
	
		System.out.println("Call Non static methods in Static method using creation of object");
		System.out.println(demo.a);
		System.out.println(demo.name);
		
		

	}

}

package com.StaticNonStatic;

public class Demo2 {

	int a = 10;
	String name = "Bhanu";
	
	
	public void check() {
		Demo2 demo = new Demo2();
		
		System.out.println("Call Non static variables in Non Static method using creation of object");
		System.out.println(demo.a);
		System.out.println(demo.name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo2 demo = new Demo2();
	
		System.out.println("Call Non static variables in Static method using creation of object");
		System.out.println(demo.a);
		System.out.println(demo.name);
		
		demo.check();
		
		

	}

}

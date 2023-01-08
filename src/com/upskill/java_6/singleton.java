package com.upskill.java_6;

public class singleton {
	
	//Singleton is a class that can have only one object
	
	//private constructor, it prevents any other class from instantiating
	private singleton(){

}
	
	
	//private static object of the class
	private static singleton singletonObj = new singleton();
	
	public static singleton getInstance(){
		return singletonObj;
	}
	
	protected static void demo(){
		System.out.println("Demo method for singleton class");
	}
}																																																																					
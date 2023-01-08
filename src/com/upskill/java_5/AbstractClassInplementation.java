package com.upskill.java_5;

public class AbstractClassInplementation extends AbstractClass {

	@Override
	public void iDoor() {
	System.out.println("My car has 2 door!");
	
		
	}

	@Override
	public int iWheel() {
	System.out.println("My car has 4 wheels");
	return 4;
	}

	@Override
	public String iEngine() {
	System.out.println("My car has 5 HP engine!");
		return "5 HP";
	}
	
	

	
}

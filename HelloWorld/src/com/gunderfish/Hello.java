package com.gunderfish;

public class Hello {
	
	Encabulator eBooster;

	public Hello() {
		eBooster = new Encabulator();
		eBooster.setTurbo(false);
	}
	
	public static void main(String[] args) {
		Hello left = new Hello();
		System.out.println("Hello World! 6");
		System.out.println("Encabulator State: " + left.eBooster.isTurboActive());
	}

}

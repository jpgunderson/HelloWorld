package com.gunderfish;

public class Hello {
	
	Encabulator eBooster;
	MarzelVane dVane;

	public Hello() {
		eBooster = new Encabulator();
		eBooster.setTurbo(false);
		dVane = new MarzelVane();
	}
	
	public static void main(String[] args) {
		Hello left = new Hello();
		System.out.println("Hello World! 6");
		System.out.println("Encabulator State: " + left.eBooster.isTurboActive());
		left.eBooster.setTurbo(true);
		System.out.println("Encabulator State: " + left.eBooster.isTurboActive());
		System.out.println("Total spin hours :" + left.dVane.getHours());
	}

}

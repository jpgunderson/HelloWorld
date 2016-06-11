package com.gunderfish;

public class Encabulator {
	boolean bUseTurbo = false;

	public Encabulator() {
		// TODO Auto-generated constructor stub
	}
	
	public void setTurbo(boolean on) {
		bUseTurbo = on;
	}
	
	public boolean isTurboActive() {
		return bUseTurbo;
	}
	
	public void disarmEncabulator() {
		bUseTurbo = false;
	}

}

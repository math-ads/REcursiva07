package controller;

public class Divis�oController {
	
	public Divis�oController() {
		super();}
	
	public int resto(int dividendo,int divisor) {
		if( dividendo< divisor) {
		return dividendo;
	} else {
		return resto(dividendo - divisor , divisor);
	}
	}
}

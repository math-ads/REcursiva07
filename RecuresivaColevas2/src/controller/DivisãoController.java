package controller;

public class DivisãoController {
	
	public DivisãoController() {
		super();}
	
	public int resto(int dividendo,int divisor) {
		if( dividendo< divisor) {
		return dividendo;
	} else {
		return resto(dividendo - divisor , divisor);
	}
	}
}

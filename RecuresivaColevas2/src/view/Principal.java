package view;
import controller.DivisãoController;
public class Principal {
	
public static void main(String[] args) {
	int dividendo= 31;
	int divisor=7;
	DivisãoController divCont = new DivisãoController();
	int resp = divCont.resto(dividendo, divisor);
	System.out.println(resp);
}
}

package view;
import controller.Divis�oController;
public class Principal {
	
public static void main(String[] args) {
	int dividendo= 31;
	int divisor=7;
	Divis�oController divCont = new Divis�oController();
	int resp = divCont.resto(dividendo, divisor);
	System.out.println(resp);
}
}

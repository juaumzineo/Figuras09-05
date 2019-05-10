package view;

import model.Circulo;
import model.Quadrado;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circ = new Circulo();
		Quadrado quad = new Quadrado();
		
		circ.setRaio(8);
		quad.setLado(3);
		
		circ.area();
		quad.area();
	}

}

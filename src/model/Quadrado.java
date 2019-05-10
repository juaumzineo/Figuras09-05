package model;

public class Quadrado extends Figura{
	private long lado;

	
	public long getLado() {
		return lado;
	}


	public void setLado(long lado) {
		this.lado = lado;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(lado * lado);
	}
	
}

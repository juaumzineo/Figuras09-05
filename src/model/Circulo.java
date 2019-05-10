package model;

public class Circulo extends Figura{
	private long raio;

	
	public long getRaio() {
		return raio;
	}


	public void setRaio(long raio) {
		this.raio = raio;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(3.14 * raio * raio);
	}

	
}

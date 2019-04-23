package entidades;

public class Quadrado extends FormaGeometrica{
	
	public Quadrado() {
		
	}
	
	public Quadrado(double lado1) {
		super(lado1);
	}
	
	public double calcArea() {
		return Math.pow(getLado1(), 2);
		
	}
	
	public double calcPerimetro() {
		return getLado1() * 4;
	}

}

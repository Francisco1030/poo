package entidades;

public class TrianguloEquilatero extends FormaGeometrica{
	
	public TrianguloEquilatero() {
		
	}
	
	public TrianguloEquilatero(double lado1) {
		super(lado1);
	}
	
	public double calcArea() {
		return (Math.pow(getLado1(), 2) * Math.sqrt(3)) / 4;
	}
	
	public double calcPerimetro() {
		return getLado1() * 3;
	}

}

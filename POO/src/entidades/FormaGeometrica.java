package entidades;

public abstract class FormaGeometrica {
	private double lado1;
	
	public FormaGeometrica() {
		
	}
	
	public FormaGeometrica(double lado1) {
		this.lado1 = lado1;
	}
	
	public abstract double calcArea();
	
	public abstract double calcPerimetro();
	
	public void exibirDados() {
		System.out.println("Lado 1: "+ getLado1());
		System.out.println("Área: "+ calcArea());
		System.out.println("Perimetro: "+ calcPerimetro());
		System.out.println();
	}
	
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	public double getLado1() {
		return lado1;
	}

}

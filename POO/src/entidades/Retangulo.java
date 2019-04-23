package entidades;

public class Retangulo extends FormaGeometrica {
	private double lado2;

	public Retangulo() {

	}

	public Retangulo(double lado1, double lado2) {
		super(lado1);
		this.lado2 = lado2;
	}

	public double calcArea() {
		return getLado1() * getLado2();
	}

	public double calcPerimetro() {
		return (getLado1() + getLado2()) * 2;
	}

	public void exibirDados() {
		System.out.println("Lado 1: " + getLado1());
		System.out.println("Lado 2: "+ getLado2());
		System.out.println("Área: " + calcArea());
		System.out.println("Perimetro: " + calcArea());
		System.out.println("");
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado2() {
		return lado2;
	}

}

package italoTed;

public class Veiculo {
	private String marca;
	private double preco;

	public Veiculo(String marca, double preco) {
		this.marca = marca;
		this.preco = preco;

	}
	
	public Veiculo() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}

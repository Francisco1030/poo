package italoTed;

public class Moto extends Veiculo{
	private String motor;
	private double qtdLitro;


	public Moto(String motor, double qtdLitro, String marca, double preco) {
		this.motor = motor;
		this.qtdLitro = qtdLitro;
		this.setMarca(marca);
		this.setPreco(preco);
		
	}
	
	public Moto(String motor, double qtdLitro) {
		this.motor = motor;
		this.qtdLitro = qtdLitro;
		
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public double getQtdLitro() {
		return qtdLitro;
	}

	public void setQtdLitro(double qtdLitro) {
		this.qtdLitro = qtdLitro;
	}

}
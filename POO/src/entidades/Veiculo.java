package entidades;

public class Veiculo {
	private String marca;
	private String modelo;
	private String cor;
	private double cilindrada;
	private boolean status;
	private Licenciamento documento;
	
	public Veiculo(String marca, String modelo, String cor, double cilindrada, int status, Licenciamento documento) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.cilindrada = cilindrada;
		this.converterStatus(status);
		this.documento = documento;
		
	}
	
	public Veiculo() {
		
	}

	public String statusVeiculo() {
		if (status == true) {
			return "Veiculo está ligado!";
		} else {
			return "Veiculo está desligado";
		}
	}

	public void converterStatus(int status) {
		if (status == 1) {
			setStatus(true);
		} else if (status == 0) {
			setStatus(false);
		}
	}

	public String exibirObjeto() {
		return "\n========================================================\n" + "\nMoto: " + getMarca() + "\nModelo: "
				+ getModelo() + "\nCor: " + getCor() + "\nCilindrada: " + getCilindrada() + "\nPlaca: "
				+ getDocumento().getPlaca() + "\nAno Exercido: " + getDocumento().getAnoExercido() + "\nRenavam: "
				+ getDocumento().getRenavam() + "\nChassi: " + getDocumento().getChass() + "\n" + statusVeiculo();

	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public void setDocumento(Licenciamento documento) {
		this.documento = documento;
	}

	public Licenciamento getDocumento() {
		return documento;
	}

}

package entidades;

public class Licenciamento {
	private String placa;
	private String anoExercido;
	private String renavam;
	private String chassi;
	
	public Licenciamento(String placa, String anoExercido, String renavam, String chassi) {
		this.placa = placa;
		this.anoExercido = anoExercido;
		this.renavam = renavam;
		this.chassi = chassi;
	}
	
	public Licenciamento() {
		
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setAnoExercido(String anoExercido) {
		this.anoExercido = anoExercido;
	}

	public String getAnoExercido() {
		return anoExercido;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getChass() {
		return chassi;
	}

}

package entidades;

public class Condutor {
	private String nome;
	private String cpf;
	private double peso;
	private double tamanho;
	private Habilitacao cnh;

	public Condutor(String nome, String cpf, double peso, double tamanho, Habilitacao cnh) {
		this.nome = nome;
		this.cpf = cpf;
		this.peso = peso;
		this.tamanho = tamanho;
		this.cnh = cnh;
	}
	
	public Condutor() {
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setCnh(Habilitacao cnh) {
		this.cnh = cnh;
	}

	public Habilitacao getCnh() {
		return cnh;
	}

}

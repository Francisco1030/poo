package entidades;

public class Motociclista extends Condutor {

	public Motociclista(String nome, String cpf, double peso, double tamanho, Habilitacao cnh) {
		super(nome, cpf, peso, tamanho, cnh);
	}

	public Motociclista() {

	}

	public String verificaCnhMoto() {

		if (getCnh().getCategoria() == "A" || getCnh().getCategoria() == "a") {
			return "Pode dirigir moto!";
		} else if (getCnh().getCategoria() == "AB" || getCnh().getCategoria() == "ab") {
			return "Pode dirigir moto ou carro!";
		} else {
			return "Não tem permissão para dirigir moto!";
		}

	}

}

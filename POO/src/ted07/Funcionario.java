package ted07;

public class Funcionario {
	private String nome;
	private double salario;
	private static double valeRefeicao;

	public Funcionario() {
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public void aumentarSalario() {
		this.salario *= 1.1;
	}

	public static void aumentarValeRefeicao() {
		Funcionario.valeRefeicao *= 1.1;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public static void setValeRefeicao(double valeRefeicao) {
		Funcionario.valeRefeicao = valeRefeicao;
	}

	public static double getValeRefeicao() {
		return valeRefeicao;
	}

}

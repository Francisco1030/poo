package arrayList;

public class TesteArrayList {
	
	private String nome;
	private double salario;
	private static double valeRefeicao;
	
	public TesteArrayList() {}
	
	public TesteArrayList(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
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
		TesteArrayList.valeRefeicao = valeRefeicao;
	}
	
	public static double getValeRefeicao() {
		return valeRefeicao;
	}


}
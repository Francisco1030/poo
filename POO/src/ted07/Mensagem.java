package ted07;

import java.util.Scanner;

public class Mensagem {

	static Scanner scam = new Scanner(System.in);

	public static void exibirValores(Funcionario func) {
		System.out.println("========================================================");
		System.out.println("Nome: " + func.getNome());
		System.out.printf("Salário: " + "%.2f", func.getSalario());
		System.out.println();
		System.out.printf("Vale refeição: " + "%.2f", Funcionario.getValeRefeicao());
		System.out.println();
		System.out.println("========================================================");

	}
	
	public static void inputString(String mensagem) {
		System.out.println(mensagem);
	}

	public static double inputStringOutDouble(String mensagem) {

		System.out.println(mensagem);
		double valor = scam.nextDouble();
		return valor;

	}

}

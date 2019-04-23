package arrayList;

import java.util.ArrayList;

public class MainTeste {

	public static void main(String[] args) {
		ArrayList<TesteArrayList> func = new ArrayList<TesteArrayList>();
		TesteArrayList f1 = new TesteArrayList("Francisco", 400);
		TesteArrayList f2 = new TesteArrayList("Jean", 600);
		TesteArrayList f3 = new TesteArrayList("José", 1000);
		TesteArrayList.setValeRefeicao(500);

		func.add(f1);
		func.add(f2);
		func.add(f3);

		for (int i = 0; i < func.size(); i++) {
			System.out.println(func.get(i).getNome());
			System.out.println(func.get(i).getSalario());
			System.out.println(TesteArrayList.getValeRefeicao());

		}
	}

//	Mensagem.inputStringOutDouble("Digite o valor do vale refeição: ");

}

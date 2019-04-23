package main;


import entidades.Habilitacao;
import entidades.Licenciamento;
import entidades.Moto;
import entidades.Motociclista;
import entidades.Veiculo;

public class UsaMoto {
	public static void main(String[] args) {
		
		Habilitacao h1 = new Habilitacao("109238828", "A","20/02/2016", "20/02/2021", "EAR");
		Licenciamento l1 = new Licenciamento("PIT", "2019", "08766776731", "F86LO10832EA");
		Licenciamento l2 = new Licenciamento("SWQ", "2017", "32324455221", "PO1082IS83K1");
		Motociclista mc1 = new Motociclista("Pedro Alves Silva", "982.931.516-80", 80.2, 1.97, h1);		
		Moto m1= new Moto("Honda", "XRE", "Preta", 300, 1, l1, mc1);
		Veiculo v1 = new Veiculo("YAMAHA", "Lander", "Azul", 250, 0, l2);
		

		System.out.println(m1.exibirObjeto());
		System.out.println(mc1.verificaCnhMoto());
		System.out.println(v1.exibirObjeto());
		

	}	

}

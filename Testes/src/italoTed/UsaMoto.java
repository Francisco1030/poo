package italoTed;

public class UsaMoto {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Honda",9000);
		Moto m1 = new Moto("160", 25, "Honda", 9000);
		
		System.out.println("Marca: "  + v1.getMarca() + "\nPreço: " + v1.getPreco());
		System.out.println(m1);
	}

}
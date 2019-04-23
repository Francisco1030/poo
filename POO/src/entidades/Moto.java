package entidades;

public class Moto extends Veiculo {
	private Motociclista motociclista;

	public Moto(String marca, String modelo, String cor, double cilindrada, int status, Licenciamento documento, Motociclista motociclista) {
		super(marca, modelo, cor, cilindrada, status, documento);
		this.motociclista = motociclista;

	}
	
	public Moto(Motociclista motociclista) {
		this.motociclista = motociclista;
		
	}

	public Moto() {

	}

	@Override
	public String exibirObjeto() {
		return super.exibirObjeto() + "\nMotociclista: " + getMotociclista().getNome() + "\nCPF: "
				+ getMotociclista().getCpf() + "\nPeso: " + getMotociclista().getPeso() + "\nTamanho: "
				+ getMotociclista().getTamanho() + "\nNº CNH: " + getMotociclista().getCnh().getNumero()
				+ "\nCategoria: " + getMotociclista().getCnh().getCategoria() + "\nData Emissão da CNH: "
				+ getMotociclista().getCnh().getDataEmissao() + "\nData de Vencimento da CNH: "
				+ getMotociclista().getCnh().getDataVencimento() + "\nObservações: "
				+ getMotociclista().getCnh().getObservacoes();

	}

	public void setMotociclista(Motociclista motociclista) {
		this.motociclista = motociclista;
	}

	public Motociclista getMotociclista() {
		return motociclista;
	}

}

package entidades;

public class Habilitacao {
	private String numero;
	private String categoria;
	private String dataEmissao;
	private String dataVencimento;
	private String observacoes;
	
	public Habilitacao(String numero, String categoria, String dataEmissao, String dataVencimento, String observacoes) {
		this.numero = numero;
		this.categoria = categoria;
		this.dataEmissao = dataEmissao;
		this.dataVencimento = dataVencimento;
		this.observacoes = observacoes;
		
	}
	
	public Habilitacao() {
		
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	
	public String getDataEmissao() {
		return dataEmissao;
	}
	
	public void setdataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public String getDataVencimento() {
		return dataVencimento;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	} 
	
	public String getObservacoes() {
		return observacoes;
	}
}

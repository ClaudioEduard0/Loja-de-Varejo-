package Loja_de_varejo;

public class Clientes {

	private String cpf;
	private String nomeCompleto;
	private Endereco endereco;
	
	public Clientes(String cpf, String nomeCompleto, Endereco end1) {
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
	}
	public String getCpf() {
		return this.cpf;
	}
	public String getNomeCompleto() {
		return this.nomeCompleto;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}

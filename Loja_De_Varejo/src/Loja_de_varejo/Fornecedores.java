package Loja_de_varejo;

public class Fornecedores {

	public String nomeEmpresa;
	public Endereco endereco;
	public Estoque produtosFornecidos;
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public Estoque getProdutosFornecidos() {
		return produtosFornecidos;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}


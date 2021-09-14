package Loja_de_varejo;

public class Main {

	public static void main (String[] args) {
		//Criando um objeto
		Endereco end1 = new Endereco("Amadeu fagundes de oliveira freitas","180","Alto petropolis","Porto Alegre","RS","91260010");
		Estoque est1 = new Estoque("Fantasia do Homem Aranha e do Homem de Ferro","Chapéus, Copos, Pratos e Decoração","Camisetas, Bermudas e Calças","Video-game, Celular, Televisão");
		Clientes cli1 = new Clientes("000.000.000.00","Claudio Eduardo",end1);
		Fornecedores for1 = new Fornecedores();
		Produtos pro1 = new Produtos();
		Transportadora tra1 = new Transportadora();
		Vendas ven1 = new Vendas();
		Vendedores vend1 = new Vendedores();
		
		System.out.printf("O senhor %s reside no endereço %s nº %s, no bairro %s - %s/%s\n",cli1.getNomeCompleto(),end1.getRua(),end1.getNumero(),end1.getBairro(),end1.getCidade(),end1.getEstado());
		
				
		
	}
}

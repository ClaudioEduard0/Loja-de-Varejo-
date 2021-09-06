package Loja_de_varejo;

public class Main {

	public static void main (String[] args) {
		//Criando um objeto
		Endereco end1 = new Endereco();
		Estoque est1 = new Estoque();
		Clientes cli1 = new Clientes();
		Fornecedores for1 = new Fornecedores();
		Produtos pro1 = new Produtos();
		Transportadora tra1 = new Transportadora();
		Vendas ven1 = new Vendas();
		Vendedores vend1 = new Vendedores();
		
		//Popular os dados
		end1.bairro = "Centro";
		end1.cep = "00000-000";
		end1.cidade = "Porto Alegre";
		end1.estado = "RS";
		end1.numero = "00";
		end1.rua = "rua almeida cunha";
		
		est1.artigosFestas = "Decorações para aniversário ";
		est1.eletronicos = "Eletrodomésticos";
		est1.Fantasias = "Fantasias para carnaval";
		est1.vestuario = "Roupas";
		
		cli1.cpf = "000.000.000.00";
		cli1.endereco = end1;
		cli1.nomeCompleto = "Joao Ribeiro Freitas";
		
		for1.endereco = end1;
		for1.nomeEmpresa = "Atacado Distribuidora";
		for1.produtosFornecidos = est1;
		
		pro1.produtos = est1;
		
		tra1.enderoEntrega = end1;
		tra1.nomeTransportadora = "Transjoi transportadora LTDA";
		tra1.tempoEntrega = "4 dias úteis";
		
		vend1.cpf = "000.000.000.00";
		vend1.endereco = end1;
		vend1.nomeCompleto = "João Silveira";
				
		
	}
}

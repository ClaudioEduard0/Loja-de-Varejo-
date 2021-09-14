package Loja_de_varejo;

public class Transportadora {

	public String nomeTransportadora;
	public String tempoEntrega;
	public Endereco enderoEntrega;
	public String getNomeTransportadora() {
		
		
	    return nomeTransportadora;
	}
	public String getTempoEntrega() {
		return tempoEntrega;
	}
	public Endereco getEnderoEntrega() {
		return enderoEntrega;
	}
	public void setNomeTransportadora(String nomeTransportadora) {
		this.nomeTransportadora = nomeTransportadora;
	}
	public void setTempoEntrega(String tempoEntrega) {
		this.tempoEntrega = tempoEntrega;
	}
	public void setEnderoEntrega(Endereco enderoEntrega) {
		this.enderoEntrega = enderoEntrega;
	}
	
	
}





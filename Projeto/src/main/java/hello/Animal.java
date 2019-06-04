package hello;

public class Animal {

	private String especie;
	private Especificacao espc;
	private String descricao;
	
	
	public Animal(String especie, String descricao, Especificacao espc){
		this.especie = especie;
		this.espc = espc;
		this.descricao = descricao;

	}



	public String getEspecie() {
		return especie;
	}



	public void setEspecie(String especie) {
		this.especie = especie;
	}



	public Especificacao getEspc() {
		return espc;
	}



	public void setEspc(Especificacao espc) {
		this.espc = espc;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}

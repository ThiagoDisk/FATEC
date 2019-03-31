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
	
	public String getEspecie(){
		return this.especie;
	}
	
	public Especificacao getEspc(){
		return espc;
	}
	
	public String getDescricao(){
		return descricao;
	}


	
	
	
}

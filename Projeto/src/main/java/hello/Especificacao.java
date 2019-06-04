package hello;

public class Especificacao {

	
	private String nome;
	private String idade;
	private String cor;
	private String raca;
	private String sexo;
	

	
	
	public Especificacao(String nome, String idade, String cor, String raca, String sexo){
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
		this.raca = raca;
		this.sexo = sexo; 

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

	//delegacao da comparacao de marca, modelo e cor do carro para a classe Especificacao, pois ela eh a dona dos atributos
	public boolean comparar(Especificacao esp){
		if(nome.equals(esp.nome) && idade.equals(esp.idade) && cor.equals(esp.cor) && raca.equals(esp.raca) && sexo.equals(esp.sexo)){
			return true;
		} else {
			return false;
		}
	}


	
}

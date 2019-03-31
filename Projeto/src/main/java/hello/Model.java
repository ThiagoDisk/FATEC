package hello;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Animal> animais = new LinkedList<Animal>();
	private List<Usuario> usuarios = new LinkedList<Usuario>();
	
	public void addAnimal(Animal animal){
		animais.add(animal);
	}
	
	public void addUsuario(Usuario usuario){
		usuarios.add(usuario);
	}
	
	
	public List<Animal> buscarEspecie(String especie){
		List<Animal> animaisEncontrados = new LinkedList<Animal>();
		
		for(Animal animal:animais){
			if(animal.getEspecie().equals(especie)) animaisEncontrados.add(animal);
		}
		
		return animaisEncontrados;
	}
	
	
	public List<Animal> buscarEspecificacao(Especificacao esp){
		List<Animal> animaisEncontrados = new LinkedList<Animal>();
		
		for(Animal animal:animais){
			 if(esp.comparar(animal.getEspc())) animaisEncontrados.add(animal);
		}
		
		return animaisEncontrados;
		
	}
	
	public List<Animal> buscarIdade(String idade){
		List<Animal> animaisEncontrados = new LinkedList<Animal>();
		
		for(Animal animal:animais) {
			if(animal.getEspc().getIdade().equals(idade)) animaisEncontrados.add(animal);
		}
		return animaisEncontrados;
	}
	
	public List<Animal> getAnimal(){
		return animais;
	}
	
	public List<Animal> buscarSexo(String sexo){
		List<Animal> animaisEncontrados = new LinkedList<Animal>();
		for(Animal animal:animais) {
			if(animal.getEspc().getSexo().equals(sexo)) animaisEncontrados.add(animal);
		}
		return animaisEncontrados;
	}
	
	public List<Animal> buscarRaca(String raca){
		List<Animal> animaisEncontrados = new LinkedList<Animal>();
		for(Animal animal:animais) {
			if(animal.getEspc().getRaca().equals(raca)) animaisEncontrados.add(animal);
		}
		return animaisEncontrados;
	}
	
	public Usuario validarUsuario(String user, String senha){
		
		for(Usuario usuario:usuarios) {
			if(usuario.getUser().equals(user) && usuario.getSenha().equals(senha)) return usuario;	
		}
		return null;
	}
	
	
	


}

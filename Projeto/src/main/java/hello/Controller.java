	package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Model model;
	
	
	public Controller(Model model){
		this.model = model;
	}
	
	

	
	
	public void logar(){
		get("/login/:nome/:senha", (req, res) -> {
		
			Usuario user = model.validarUsuario(req.params(":nome"), req.params(":senha"));
			return new Gson().toJson(user);
			
		});
	}
	
	public void buscarAnimalEspecie(){
		get("/animal/buscaEspecie/:especie", (req, res) -> {
			
			List<Animal> animaisEncontrados = model.buscarEspecie(req.params(":especie"));	
			return new Gson().toJson(animaisEncontrados);
			
		});
	}
	
	
	public void buscarAnimalIdade(){
		get("/animal/buscaIdade/:idade", (req, res) -> {
		
			
			List<Animal> animaisEncontrados = model.buscarIdade(req.params(":idade"));	
			return new Gson().toJson(animaisEncontrados);
			
		});
	}

		public void buscarAnimalSexo(){
			get("/animal/buscaSexo/:sexo", (req, res) -> {
			
				
				List<Animal> animaisEncontrados = model.buscarSexo(req.params(":sexo"));	
				return new Gson().toJson(animaisEncontrados);
				
			});
		}
		
		public void buscarAnimalRaca(){
			get("/animal/buscarRaca/:raca", (req, res) -> {
			
				
				List<Animal> animaisEncontrados = model.buscarRaca(req.params(":raca"));	
				return new Gson().toJson(animaisEncontrados);
				
			});
		}
			
		public void addAnimal(){
				get("/animal/addAnimal/:especie/:descricao/:nome/:idade/:cor/:raca/:sexo", (req, res) -> {
				    model.addAnimal(new Animal(req.params(":especie"),req.params(":descricao"),new Especificacao(req.params(":nome"), req.params(":idade"), req.params(":cor"), req.params(":raca"), req.params(":sexo"))));
					return ("ok");
			
				});
				
				
	}
		public void addUsuario(){
			get("/cadastro/:username/:senha", (req, res) -> {
			    model.addUsuario(new Usuario(req.params(":username"), req.params(":senha")));
				return ("Cadastrado com sucesso.");
		
			});
}
	
	
	
}

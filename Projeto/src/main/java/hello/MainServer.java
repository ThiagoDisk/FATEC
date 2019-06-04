package hello;

import static spark.Spark.*;


public class MainServer {

	final static Model model = new Model();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 2020;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");
		
		inicializarAnimais();

		Controller controller = new Controller(model);

		controller.buscarAnimalEspecie();
		controller.buscarAnimalIdade();
		controller.buscarAnimalRaca();
		controller.buscarAnimalSexo();
		controller.addAnimal();
		controller.logar();
		
    }
    
    public static void inicializarAnimais(){
    	
    	model.addUsuario(new Usuario("giovanna", "12345"));
    	//model.addAnimal(new Animal("Macaco","Fofinho e serelepe", new Especificacao("George", "5", "Marrom","Bonobo","Macho","nada")));

    }
}

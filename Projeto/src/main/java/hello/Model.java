package hello;

import java.util.List;
import java.util.LinkedList;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

public class Model {

	ObjectContainer animais = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/animais2.db4o");
	ObjectContainer especificacoes = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/especificacoes2.db4o");
	ObjectContainer usuarios = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/usuarios.db4o");
	// private List<Animal> animais = new LinkedList<Animal>();
	// private List<Usuario> usuarios = new LinkedList<Usuario>();

	
	public void addAnimal(Animal animal) {
		animais.store(animal);
		animais.commit();
	}

	public void addUsuario(Usuario usuario) {
		usuarios.store(usuario);
		usuarios.commit();
	}

	public List<Animal> buscarEspecie(String especie) {
		List<Animal> result = new LinkedList<Animal>();
		Query query = animais.query();
		query.constrain(Animal.class);
		ObjectSet<Animal> todosAnimais = query.execute();

		for (Animal animal : todosAnimais) {
			if (animal.getEspecie().equals(especie)) {
				result.add(animal);
			}
			
		}return result;

	}

	public List<Animal> buscarEspecificacao(Especificacao esp) {
		List<Animal> result = new LinkedList<Animal>();
		Query query = animais.query();
		query.constrain(Animal.class);
		ObjectSet<Animal> todosAnimais = query.execute();

		for (Animal animal : todosAnimais) {
			if (esp.comparar(animal.getEspc()))
				result.add(animal);

		}
		return result;
	}

	public List<Animal> buscarIdade(String idade) {
		List<Animal> result = new LinkedList<Animal>();
		Query query = animais.query();
		query.constrain(Animal.class);
		ObjectSet<Animal> todosAnimais = query.execute();

		for (Animal animal : todosAnimais) {
			if (animal.getEspc().getIdade().equals(idade))
				result.add(animal);
		}
		return result;
	}

	public List<Animal> buscarSexo(String sexo) {
		List<Animal> result = new LinkedList<Animal>();
		Query query = animais.query();
		query.constrain(Animal.class);
		ObjectSet<Animal> todosAnimais = query.execute();
		for (Animal animal : todosAnimais) {
			if (animal.getEspc().getSexo().equals(sexo))
				result.add(animal);
		}
		return result;
	}

	public List<Animal> buscarRaca(String raca) {
		List<Animal> result = new LinkedList<Animal>();
		Query query = animais.query();
		query.constrain(Animal.class);
		ObjectSet<Animal> todosAnimais = query.execute();
		for (Animal animal : todosAnimais) {
			if (animal.getEspc().getRaca().equals(raca))
				result.add(animal);
		}
		return result;
	}

	public Usuario validarUsuario(String user, String senha) {
		Query query = usuarios.query();
		query.constrain(Usuario.class);
		ObjectSet<Usuario> todosUsuarios = query.execute();

		for (Usuario usuario : todosUsuarios) {
			if (usuario.getUser().equals(user) && usuario.getSenha().equals(senha)) {
				return usuario;
			}
		}
		return null;
	}

}

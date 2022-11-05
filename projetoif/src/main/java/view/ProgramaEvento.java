package view;

import java.util.Iterator;
import java.util.List;
import control.EventoControl;
import model.Evento;

public class ProgramaEvento {
	public static void main(String[] args) {
		// inserindo
		Evento novo = new Evento(null, "Rob�tica", "Rob�tica na pr�tica", "2022-10-10", "2022-09-10", "2022-09-10", null, null, null);
		EventoControl controle = new EventoControl();
		controle.inserir(novo);

		// buscando
		novo = controle.buscarPorId(4); // o id 3 precisa existir no banco, modifique o valor
		if (novo != null) {
			System.out.println(novo.getTitulo()); // substitua por um m�todo get do seu projeto

			// modificando
			novo.setTitulo("SNCT"); // no seu caso utilize um m�todo set do seu projeto
			controle.alterar(novo);
		}
		// buscar todos
		List<Evento> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Evento obj = (Evento) iterator.next();
			System.out.println(obj.getTitulo());
		}

		// excluir
		controle.excluir(objetos.get(0));

		// excluir por id
		controle.excluirPorId(4); // o id 3 precisa existir no banco, modifique o valor
	}
}

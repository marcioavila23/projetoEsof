package view;

import java.util.Iterator;
import java.util.List;
import control.CoordenadorControl;
import model.Coordenador;

public class ProgramaCoordenador {
	public static void main(String[] args) {
		// inserindo
		Coordenador novo = new Coordenador(null, "Márcio", "marcio@gmail.com");
		CoordenadorControl controle = new CoordenadorControl();
		controle.inserir(novo);

		// buscando
		novo = controle.buscarPorId(3); // o id 3 precisa existir no banco, modifique o valor
		if (novo !=null ) {
			System.out.println(novo.getNome()); // substitua por um método get do seu projeto

		// modificando
			novo.setNome("marcio avila"); // no seu caso utilize um método set do seu projeto
			controle.alterar(novo);
		}
		// buscar todos
		List<Coordenador> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Coordenador obj = (Coordenador) iterator.next();
			System.out.println(obj.getNome());
		}

		// excluir
		controle.excluir(objetos.get(0));

		// excluir por id
		//controle.excluirPorId(7); // o id 7 precisa existir no banco, modifique o valor
	}
}

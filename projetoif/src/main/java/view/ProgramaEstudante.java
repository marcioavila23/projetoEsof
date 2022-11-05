package view;

import java.util.Iterator;
import java.util.List;
import control.EstudanteControl;
import model.Estudante;

public class ProgramaEstudante {
	public static void main(String[] args) {
		// inserindo
		Estudante novo = new Estudante(null, "Márcio",  "marcioavila@gmail.com");
		EstudanteControl controle = new EstudanteControl();
		controle.inserir(novo);

		// buscando
		novo = controle.buscarPorId(3); // o id 3 precisa existir no banco, modifique o valor
		System.out.println(novo.getNome()); // substitua por um método get do seu projeto

		// modificando
		novo.setNome("marcio"); // no seu caso utilize um método set do seu projeto
		controle.alterar(novo);

		// buscar todos
		List<Estudante> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Estudante obj = (Estudante) iterator.next();
			System.out.println(obj.getNome());
		}

		// excluir
		controle.excluir(objetos.get(0));

		// excluir por id
		controle.excluirPorId(3); // o id 3 precisa existir no banco, modifique o valor
	}
}

package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Estudante;

public class EstudanteControl {
	private EntityManager em;

	public EstudanteControl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetoif");
		em = emf.createEntityManager();
	}
	public void inserir(Estudante objeto) {
		try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }

	}
	public void alterar(Estudante objeto) {
		try {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }

	}
	public void excluir(Estudante objeto) {
		 try {
	            em.getTransaction().begin();
	            em.remove(objeto);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }

	}
	public void excluirPorId(Integer id) {
		 try {
	            Estudante objeto = buscarPorId(id);
	            excluir(objeto);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }

	}
	public Estudante buscarPorId(Integer id) {return em.find(Estudante.class, id);}
	public List<Estudante> buscarTodos() {
		String nomeClasse = Estudante.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();

	}
}

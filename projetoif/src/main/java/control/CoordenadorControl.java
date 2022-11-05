package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Coordenador;

public class CoordenadorControl {
	private EntityManager em;

	public CoordenadorControl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetoif");
		em = emf.createEntityManager();
	}
	public void inserir(Coordenador objeto) {
		try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }

	}
	public void alterar(Coordenador objeto) {
		try {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }

	}
	public void excluir(Coordenador objeto) {
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
	            Coordenador objeto = buscarPorId(id);
	            excluir(objeto);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }

	}
	public Coordenador buscarPorId(Integer id) {return em.find(Coordenador.class, id);}
	public List<Coordenador> buscarTodos() {
		String nomeClasse = Coordenador.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();

	}
}

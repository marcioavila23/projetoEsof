package control;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import model.Evento;

public class EventoControl {
	private EntityManager em;

	public EventoControl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetoif");
		em = emf.createEntityManager();
	}

	public void inserir(Evento objeto) {
		try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }

	}
	public void alterar(Evento objeto) {
		try {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }

	}
	public void excluir(Evento objeto) {
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
	            Evento objeto = buscarPorId(id);
	            excluir(objeto);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }

	}
	public Evento buscarPorId(Integer id) {return em.find(Evento.class, id);}
	public List<Evento> buscarTodos() {
		String nomeClasse = Evento.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();

	}

}

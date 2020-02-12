package br.com.fti.model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.fti.model.entities.Cliente;

public class ClienteDAO {

		private EntityManagerFactory factory = Persistence.createEntityManagerFactory("fti");
		private EntityManager mananger = factory.createEntityManager();
	
		public String adicionaCliente(Cliente c) {


		try {
			mananger.getTransaction().begin();
			mananger.persist(c);
			mananger.getTransaction().commit();
			
		} catch (Exception e) {
			mananger.getTransaction().rollback();
		} finally {
			mananger.close();
			factory.close();
		}

		return "add";
	}

		public Cliente carregaCliente(long id) {
			
			Cliente c = new Cliente();
			try {
				Query query = mananger.createQuery("SELECT c FROM Cliente as c WHERE c.id=:id");
				query.setParameter("id", id);			
			     c = (Cliente) query.getSingleResult();
			     
			} catch (Exception e) {
				e.getMessage();
			} finally {
				mananger.close();
				factory.close();
			}

			return c;	
			
		}
		
	public String atualizaCliente(Cliente c) {

		try {
			mananger.getTransaction().begin();
			mananger.merge(c);
			mananger.getTransaction().commit();
			
		} catch (Exception e) {
			mananger.getTransaction().rollback();
		} finally {
			mananger.close();
			factory.close();
		}

		return "up";

	}

	public Cliente validaCliente(Cliente c) {

		
		try {

			Query query = mananger.createQuery(
					"SELECT c FROM Cliente c WHERE c.emailCliente = :paramEmail AND c.senhaCliente = :paramSenha ");
			query.setParameter("paramEmail", c.getEmailCliente());
			query.setParameter("paramSenha", c.getSenhaCliente());

			if (query.getSingleResult() != null) {				
				return c = (Cliente) query.getSingleResult();
			} else {
				return null;
			}
		} catch (NoResultException e) {
			return null;
		} finally {
			mananger.close();
			factory.close();
		}
	}


	public List<Cliente> carregaCliente(Cliente t) {

		List<Cliente> list = new ArrayList<>();
	
		try {
			
			Query query = mananger.createQuery("SELECT c FROM Cliente c");	
			list = query.getResultList();
			
		}  catch (Exception e) {
			e.getMessage();
		} finally {
			
			mananger.close();
			factory.close();
		}

		return list;

	}

}

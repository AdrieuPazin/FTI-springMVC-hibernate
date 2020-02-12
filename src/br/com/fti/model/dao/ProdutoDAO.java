package br.com.fti.model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.fti.model.entities.Cliente;
import br.com.fti.model.entities.Produto;

public class ProdutoDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("fti");
	private EntityManager mananger = factory.createEntityManager();

	public String adicionaProduto(Produto p) {
		
		try {
				
			mananger.getTransaction().begin();;
			mananger.persist(p);
			mananger.getTransaction().commit();
			
			
		} catch (Exception e) {
			mananger.getTransaction().rollback();
		} finally {
			mananger.close();
			factory.close();
		}
		
		return "add";
	}
	
	
	public String atualizaProduto(Produto p) {
		
		
		try {
			mananger.getTransaction().begin();;
			mananger.merge(p);
			mananger.getTransaction().commit();
			
			
		} catch (Exception e) {
			mananger.getTransaction().rollback();
		} finally {
			mananger.close();
			factory.close();
		}
				
		return "up";
		
	}
	public List<Produto> carregaProduto() {
		
		List<Produto> list = new ArrayList<>();
		
		try {
			Query query = mananger.createQuery("SELECT p FROM Produto as p");
			
			list = query.getResultList();
			
		} catch (Exception e) {
			e.getMessage();
		}finally {
			mananger.close();
			factory.close();
		}
	
		return list;	
		
		
	}
	
	
	public Produto carregaProduto(long id) {
		
		Produto p = new Produto();
		try {
			Query query = mananger.createQuery("SELECT p FROM Produto as p WHERE p.id=:id");
			query.setParameter("id", id);			
		     p = (Produto) query.getSingleResult();
		     
		} catch (Exception e) {
			e.getMessage();
		} finally {
			mananger.close();
			factory.close();
		}

		return p;	
		
	}
	public boolean deletaProduto(long id) {
		
		Produto p = new Produto();
		
		try {
			p = mananger.find(Produto.class, id);
			
			mananger.getTransaction().begin();
			mananger.remove(p);
			mananger.getTransaction().commit();
			
		} catch (Exception e) {
			mananger.getTransaction().rollback();
		} finally {
			mananger.close();
			factory.close();
		}
		
		return true;			
		
	}
	
}
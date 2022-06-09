package br.com.guimeireles.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.guimeireles.application.model.Produto;

@Stateless
public class ProdutoBean {

	@PersistenceContext
	private EntityManager em;
	
	//lista produtos
	public List<Produto> listar() {
		return em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
	}
}

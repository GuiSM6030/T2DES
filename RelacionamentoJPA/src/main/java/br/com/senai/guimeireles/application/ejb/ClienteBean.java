package br.com.senai.guimeireles.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.guimeireles.application.model.Cliente;


@Stateless
public class ClienteBean {

	@PersistenceContext
	private EntityManager em;
	
	public List<Cliente> listar() {
		return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
}

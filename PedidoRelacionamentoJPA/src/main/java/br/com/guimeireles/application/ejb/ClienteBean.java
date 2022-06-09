package br.com.guimeireles.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.guimeireles.application.model.Cliente;


@Stateless //o tempo que o EJB tem de vida
public class ClienteBean {

	@PersistenceContext //pega os itens listados
	private EntityManager em;
	
	//transforma em tabela no SQL
	public List<Cliente> listar() {
		return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
}

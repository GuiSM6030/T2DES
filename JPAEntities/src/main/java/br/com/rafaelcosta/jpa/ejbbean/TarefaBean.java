package br.com.rafaelcosta.jpa.ejbbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelcosta.jpa.model.Tarefa;

@Stateless
public class TarefaBean {

	@PersistenceContext
	private EntityManager em;
	
	public void inserir(Tarefa tarefa) {
		em.persist(tarefa);
	}
	
	public void atualizar(Tarefa tarefa) {
		em.merge(tarefa);
	}
	
	public void excluir(Tarefa tarefa) {
		tarefa = carregar(tarefa.getId());
		em.remove(tarefa);
	}
	
	public Tarefa carregar(int id) {
		return em.find(Tarefa.class, id);
	}
}

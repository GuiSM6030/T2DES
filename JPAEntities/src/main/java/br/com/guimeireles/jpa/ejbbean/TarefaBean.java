package br.com.guimeireles.jpa.ejbbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.guimeireles.jpa.model.Tarefa;

@Stateless
public class TarefaBean {

	//faz os dados persistirem no SQL
	@PersistenceContext
	private EntityManager em;

	//Faz a manutenção do dado ->
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
	//<- Faz a manutenção do dado 
}

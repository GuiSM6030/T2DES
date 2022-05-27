package br.com.senai.guimeireles.application;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.guimeireles.application.model.Cadastro;

public class Acao {
	
	
	@PersistenceContext
	private EntityManager em;
	
	public void inserir(Cadastro cad) {
		em.persist(cad);
	}
	
	public void atualizar(Cadastro cad) {
		em.merge(cad);
	}
	
	public void excluir(Cadastro cad) {
		cad = carregar(cad.getId());
		em.remove(cad);
	}
	
	public Cadastro carregar(int id) {
		return em.find(Cadastro.class, id);
	}
}

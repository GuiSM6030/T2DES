package br.com.senai.guimeireles.application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;

import javax.inject.Named;

import br.com.senai.guimeireles.application.model.Dados;



@SuppressWarnings("serial")
@Named("tabela")
@SessionScoped
public class TabFormBean implements Serializable{
	
	private List<Dados> despesasList = new ArrayList<>();
	
	public String inserir() {
		Dados d = new Dados();
		despesasList.add(d);
		d.setEdit(true);
		return null;
	}
	
	public String excluir(Dados dado) {
		despesasList.remove(dado);
		return null;
	}
	
	public String editar(Dados dado) {
		dado.setEdit(true);
		return null;
	}
	
	public String gravar(Dados dado) {
		dado.setEdit(false);
		return null;
	}

}

	

package br.com.senai.guimeireles.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.senai.guimeireles.application.Despesas;

@SuppressWarnings("serial")

//apelido do bean
@Named("tabela")
@SessionScoped
public class TabelaBean implements Serializable {
	
	//lista onde vai ser guardado as informações
	private List<Despesas> despesasList = new ArrayList<>();
	private ListDataModel<Despesas> despesas = new ListDataModel<>(despesasList);
	
	//método de inserir cadastros
	public String inserir() {
		
		Despesas d = new Despesas();
		despesasList.add(d);
		
		return null;
	}
	//método de deletar cadastros
	public String delete(Despesas despesa) {
		
		despesasList.remove(despesa);
		return null;
		
	}
	
	//Altera a tabela e salva na tela ↓
	public String gravar(Despesas despesa) {
		
		despesa.setEdit(false);
		return null;
		
	}
	
	public String edit(Despesas despesa) {
		
		despesa.setEdit(true);
		return null;
		
	}
	//Altera a tabela e salva na tela ↑

	//lista que trabalha com JSF
	public ListDataModel<Despesas> getDespesas(){
		
		return despesas;
	}
	
}

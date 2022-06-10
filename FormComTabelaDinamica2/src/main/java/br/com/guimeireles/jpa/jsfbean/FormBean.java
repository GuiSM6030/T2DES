package br.com.guimeireles.jpa.jsfbean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.guimeireles.jpa.ejbbean.ComandosBean;
import br.com.senai.guimeireles.application.model.Despesas;


@Named("form")//nome dado no binding do xhtml
@RequestScoped  //Funciona enquanto o navegador estiver aberto
public class FormBean implements Serializable {
	
	@EJB //relaciona com o banco de dados
	private ComandosBean comandosBean;

	
	@Inject //injeta código
	private FacesContext context; //grava as açoes que acontecem na tela
	
	private UIComponent searchInputText;
	
	private Integer tarefaId;
	
	private Despesas despesa1;
	
	//mainpula os dados
	public void gravarr(AjaxBehaviorEvent event) {
		if(despesa1.getId()==null) {
			comandosBean.inserir(despesa1);
		}	
	}
	
	public void pesquisar(AjaxBehaviorEvent event) {
		despesa1 = comandosBean.carregar(tarefaId);
		
		if(despesa1 == null) {
			context.addMessage(searchInputText.getClientId(context),
					new FacesMessage("Despesa não encontrada"));
		}
		tarefaId = null;		
	}
	
	public void excluir(AjaxBehaviorEvent event) {
		comandosBean.excluir(despesa1);
		despesa1 = null;
	}
	
	
	
	public Despesas getDespesas() {
		if(despesa1==null) {
			despesa1 = new Despesas();
		}
		return despesa1;
	}

	public UIComponent getSearchInputText() {
		return searchInputText;
	}

	public void setSearchInputText(UIComponent searchInputText) {
		this.searchInputText = searchInputText;
	}

	public Integer getTarefaId() {
		return tarefaId;
	}

	public void setTarefaId(Integer tarefaId) {
		this.tarefaId = tarefaId;
	}
	
	
	
}

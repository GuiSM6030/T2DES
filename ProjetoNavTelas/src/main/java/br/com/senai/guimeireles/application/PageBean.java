package br.com.senai.guimeireles.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class PageBean implements Serializable{

	private String page;

	//enumera as paginas
	public enum Pages{
		page_a, page_b;
	}

	//Getter e setter
	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	//Pega o que foi digitado e manda para a página respectivamente
	public Pages goTo() {

		//Validação do que foi digitado, se tiver errado não retorna 
		if("a".equals(page)) {
			return Pages.page_a;
		}else if("b".equals(page)){
			return Pages.page_b;
		}else {
			return null;

		}
	}
}